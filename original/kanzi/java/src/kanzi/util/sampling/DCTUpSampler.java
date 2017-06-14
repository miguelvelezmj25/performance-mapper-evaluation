/*
Copyright 2011-2017 Frederic Langlet
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
you may obtain a copy of the License at

                http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package kanzi.util.sampling;

import kanzi.SliceIntArray;
import kanzi.IntTransform;
import kanzi.prediction.IntraTables;
import kanzi.transform.DCT16;
import kanzi.transform.DCT32;
import kanzi.transform.DCT4;
import kanzi.transform.DCT8;


public class DCTUpSampler implements UpSampler
{
   private final int width;
   private final int height;
   private final int stride;
   private final int dim;
   private final int offset;
   private final IntTransform idct;
   private final IntTransform fdct;
   private final int[] scan;    
   private final int[] buffer1;
   private final int[] buffer2;
   private int[] guide;
   
   
   public DCTUpSampler(int width, int height)
   {
      this(width, height, width, 0, 8);
   }
 
    
   public DCTUpSampler(int width, int height, int stride, int offset, int step)
   {
      if (offset < 0)
         throw new IllegalArgumentException("The offset must be at least 0");

      if (stride < width)
         throw new IllegalArgumentException("The stride must be at least as big as the width");
      
      if ((step != 8) && (step != 16) && (step != 32))
          throw new IllegalArgumentException("The transform dimension must be 8, 16 or 32");

      if ((height & (step-1)) != 0)
         throw new IllegalArgumentException("The height must be a multiple of " + step);

      if ((width & (step-1)) != 0)
         throw new IllegalArgumentException("The width must be a multiple of " + step);

      IntTransform fdct_;
      IntTransform idct_;
      int[] scan_;
 
      switch (step)
      {
         case 8 : 
            idct_ = new DCT8();
            fdct_ = new DCT4();
            scan_ = IntraTables.RASTER_SCAN_8x8;
            break;            
         case 16 :
            idct_ = new DCT16();
            fdct_ = new DCT8();
            scan_ = IntraTables.RASTER_SCAN_16x16;
            break;            
         case 32 : 
            idct_ = new DCT32();
            fdct_ = new DCT16();
            scan_ = IntraTables.RASTER_SCAN_32x32;
            break;            
         default:
            throw new IllegalArgumentException("Invalid transform dimension (must be 8, 16, 32 or 64)");
      }    
      
      this.width = width;
      this.height = height;
      this.stride = stride;
      this.offset = offset;
      this.fdct = fdct_;
      this.idct = idct_;
      this.scan = scan_;      
      this.dim = step;
      this.buffer1 = new int[this.dim*this.dim];
      this.buffer2 = new int[this.dim*this.dim];
      this.guide = new int[0];
   }
    
    
   @Override
   public void superSampleVertical(int[] input, int[] output)
   {
      throw new UnsupportedOperationException("Not supported."); 
   }


   @Override
   public void superSampleHorizontal(int[] input, int[] output)
   {
      throw new UnsupportedOperationException("Not supported."); 
   }
    
    
   @Override
   public void superSample(int[] input, int[] output)
   {
      int offs = this.offset;
      final int h = this.height;
      final int w = this.width;
      final int st = this.stride;
      final int[] buf1 = this.buffer1;
      final int[] buf2 = this.buffer2;
      final int count = this.dim * this.dim;
      final SliceIntArray src = new SliceIntArray(buf1, 0);
      final SliceIntArray dst = new SliceIntArray(buf2, 0);
      final int step = this.dim >> 1;
      final int stStep = st * step;
      final int count4 = count >> 2;
      
      for (int y=0; y<h; y+=step)
      {
         for (int x=0; x<w; x+=step)
         {
            int iOffs = offs;
            int n = 0;
            
            // Fill buf from input
            for (int j=0; j<step; j++)
            {
               for (int i=0; i<step; i+=4)
               {
                  final int idx = iOffs + x + i;
                  buf1[n]   = input[idx];
                  buf1[n+1] = input[idx+1];
                  buf1[n+2] = input[idx+2];
                  buf1[n+3] = input[idx+3];
                  n += 4;
               }

               iOffs += st;   
            }
            
            src.index = 0;
            dst.index = 0;
            src.length = count4;
            this.fdct.forward(src, dst);
               
            // Unpack and clear DCT high frequency bands
            for (int i=0; i<count; i++)
               buf1[i] = 0;

            for (int i=0; i<count4; i++)
               buf1[this.scan[i]] = buf2[i];

//            if (this.guide.length > 0)
//            {
//               src.index = 0;
//               dst.index = 0;
//               src.length = count;
//               this.idct.forward(src, dst);
//
//               for (int i=count4; i<count; i++)
//                  buf1[this.scan[i]] = buf2[this.scan[i]] >> 1;
//            }
         
            src.index = 0;
            dst.index = 0;
            src.length = count;
            this.idct.inverse(src, dst);
            int oOffs = (offs<<2) + (x<<1);
             n = 0;

            // Fill output at x,y from buf(dim x dim)
            for (int j=0; j<this.dim; j++)
            {              
               for (int i=0; i<this.dim; i++, n++)
               {
                  final int val = buf2[n];
                  output[oOffs+i] = (val >= 255) ? 255 : val & ~(val>>31);
               }
               
               oOffs += (st<<1);
            }                       
         }
         
         offs += stStep;
      }    
   }


//   public boolean setGuide(int[] guide)
//   {
//      if (guide == null)
//         return false;
//       
//      if (guide.length < 4*this.width*this.height)
//         return false;
//       
//      if (this.guide.length < 4*this.width*this.height)
//         this.guide = new int[4*this.width*this.height];
//      
//      System.arraycopy(guide, 0, this.guide, 0, 4*this.width*this.height);
//      return true;
//   }

    
   @Override
   public boolean supportsScalingFactor(int factor)
   {
      return (factor == 2);
   }
}