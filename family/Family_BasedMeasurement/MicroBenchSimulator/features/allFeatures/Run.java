import java.util.*; 
public   class  Run {
	

	/**
	 * @param args
	 */
	@featureHouse.FeatureAnnotation(name="base")
public static void main(String[] args) {
		//verificationClasses.FeatureSwitches.select_features();
		/*verificationClasses.FeatureSwitches.select_features();
		verificationClasses.PerformanceProfiler.startMeasurement();
		Date start = new Date();
		
		Date end = new Date();
		System.out.println(end.getTime() - start.getTime());
		verificationClasses.PerformanceProfiler.printChoiceCalculus("C:\\Workspace\\test.txt");*/
		temp();
		//end();
	}

	
	@featureHouse.FeatureAnnotation(name="base")
public static void temp()
	{
		Run a = new Run();
		a.dosomething();
		a.print();
	}

	
	
	@featureHouse.FeatureAnnotation (name="base")
private void dosomething__before__f1() {
		try{
			  //do what you want to do before sleeping
			  Thread.currentThread().sleep(2000);//sleep for 1000 ms
			  //do what you want to do after sleeptig
			}
			catch(InterruptedException ie){
			//If this thread was intrrupted by nother thread 
			}
	}

	
	
	@featureHouse.FeatureAnnotation(name="f1")
private void  dosomething__role__f1() {
		try{
			  //do what you want to do before sleeping
			  Thread.currentThread().sleep(1000);//sleep for 1000 ms
			  //do what you want to do after sleeptig
			  dosomething__before__f1();
			}
			catch(InterruptedException ie){
			//If this thread was intrrupted by nother thread 
			}
	}

	

	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=0, thenFeature="f1", elseFeature="base")
private void
dosomething__before__f2() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_f1) {
        dosomething__role__f1();
    } else {
        dosomething__before__f1();
    }
}



	

	@featureHouse.FeatureAnnotation(name="f2")
private void  dosomething__role__f2() {
		try{
			  //do what you want to do before sleeping
			  Thread.currentThread().sleep(5000);//sleep for 1000 ms
			  //do what you want to do after sleeptig
			  dosomething__before__f2();
			  domore();
			}
			catch(InterruptedException ie){
			//If this thread was intrrupted by nother thread 
			}
	}

	


	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=2, thenFeature="f2", elseFeature="featureSwitch")
private void
dosomething__before__f3() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_f2) {
        dosomething__role__f2();
    } else {
        dosomething__before__f2();
    }
}



	


	@featureHouse.FeatureAnnotation(name="f3")
private void  dosomething__role__f3() {
		try
		{
		Thread.sleep(1000);
		}
		catch(InterruptedException ie){
		//If this thread was intrrupted by nother thread 
		}
		dosomething__before__f3();
		
		domore();
	}

	


	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=4, thenFeature="f3", elseFeature="featureSwitch")
private void
dosomething__before__f5() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_f3) {
        dosomething__role__f3();
    } else {
        dosomething__before__f3();
    }
}



	


	@featureHouse.FeatureAnnotation(name="f5")
private void  dosomething__role__f5(){
		dosomething__before__f5();
		try{
			  Thread.currentThread().sleep(300);
			}
			catch(InterruptedException ie){
			}
	}

	
	
	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=6, thenFeature="f5", elseFeature="featureSwitch")
private void
dosomething__before__f8() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_f5) {
        dosomething__role__f5();
    } else {
        dosomething__before__f5();
    }
}



	
	
	@featureHouse.FeatureAnnotation(name="f8")
private void  dosomething__role__f8(){
		dosomething__before__f8();
		try{
			  Thread.currentThread().sleep(20);
			}
			catch(InterruptedException ie){
			}
	}

	
	
	@featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=11, thenFeature="f8", elseFeature="featureSwitch")
private void
dosomething() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_f8) {
        dosomething__role__f8();
    } else {
        dosomething__before__f8();
    }
}



	
	
	@featureHouse.FeatureAnnotation (name="base")
private void domore__before__f1() {
		try{
			  //do what you want to do before sleeping
			  Thread.currentThread().sleep(1111);//sleep for 1000 ms
			  //do what you want to do after sleeptig
			}
			catch(InterruptedException ie){
			//If this thread was intrrupted by nother thread 
			}
	}

	
	
	@featureHouse.FeatureAnnotation(name="f1")
private void  domore__role__f1(){
		try{
			  //do what you want to do before sleeping
			  Thread.currentThread().sleep(555);//sleep for 1000 ms
			  //do what you want to do after sleeptig
			}
			catch(InterruptedException ie){
			//If this thread was intrrupted by nother thread 
			}
			domore__before__f1();
	}

	
	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=1, thenFeature="f1", elseFeature="base")
private void
domore__before__f2() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_f1) {
        domore__role__f1();
    } else {
        domore__before__f1();
    }
}



	
	@featureHouse.FeatureAnnotation(name="f2")
private void  domore__role__f2()
	{
		domore__before__f2();
	}

	
	
	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=3, thenFeature="f2", elseFeature="featureSwitch")
private void
domore__before__f6() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_f2) {
        domore__role__f2();
    } else {
        domore__before__f2();
    }
}



	
	
	@featureHouse.FeatureAnnotation(name="f6")
private void  domore__role__f6(){
		domore__before__f6();
		print();
		try{
			  Thread.currentThread().sleep(150);
			}
			catch(InterruptedException ie){
			}
	}

	
	
	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=8, thenFeature="f6", elseFeature="featureSwitch")
private void
domore__before__f10() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_f6) {
        domore__role__f6();
    } else {
        domore__before__f6();
    }
}



	
	
	@featureHouse.FeatureAnnotation(name="f10")
private void  domore__role__f10(){
		print();
		domore__before__f10();
	}

	
	
	@featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=14, thenFeature="f10", elseFeature="featureSwitch")
private void
domore() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_f10) {
        domore__role__f10();
    } else {
        domore__before__f10();
    }
}



	
	
	@featureHouse.FeatureAnnotation (name="base")
private void print__before__f4(){
		System.out.println("Base");
		try{
			  Thread.currentThread().sleep(500);
			}
			catch(InterruptedException ie){
			}
	
	}

	
	
	@featureHouse.FeatureAnnotation(name="f4")
private void  print__role__f4(){
		print__before__f4();
		System.out.println("F4");
		try{
			  Thread.currentThread().sleep(200);
			}
			catch(InterruptedException ie){
			}
	}

	
	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=5, thenFeature="f4", elseFeature="base")
private void
print__before__f5() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_f4) {
        print__role__f4();
    } else {
        print__before__f4();
    }
}



	
	@featureHouse.FeatureAnnotation(name="f5")
private void  print__role__f5(){
		print__before__f5();
		System.out.println("F5");
		try{
			  Thread.currentThread().sleep(300);
			}
			catch(InterruptedException ie){
			}
	}

	
	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=7, thenFeature="f5", elseFeature="featureSwitch")
private void
print__before__f6() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_f5) {
        print__role__f5();
    } else {
        print__before__f5();
    }
}



	
	@featureHouse.FeatureAnnotation(name="f6")
private void  print__role__f6(){
		print__before__f6();
		System.out.println("F6");
		try{
			  Thread.currentThread().sleep(400);
			}
			catch(InterruptedException ie){
			}
	}

	
	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=9, thenFeature="f6", elseFeature="featureSwitch")
private void
print__before__f7() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_f6) {
        print__role__f6();
    } else {
        print__before__f6();
    }
}



	
	@featureHouse.FeatureAnnotation(name="f7")
private void  print__role__f7(){
		System.out.println("F7");
		for (int i = 0; i < 5; i++) {
			print__before__f7();
			try{
				  Thread.currentThread().sleep(20);
				}
				catch(InterruptedException ie){
				}
		}
	}

	
	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=10, thenFeature="f7", elseFeature="featureSwitch")
private void
print__before__f8() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_f7) {
        print__role__f7();
    } else {
        print__before__f7();
    }
}



	
	@featureHouse.FeatureAnnotation(name="f8")
private void  print__role__f8(){
		print__before__f8();
		System.out.println("F8");
		try{
			  Thread.currentThread().sleep(200);
			}
			catch(InterruptedException ie){
			}
	}

	
	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=12, thenFeature="f8", elseFeature="featureSwitch")
private void
print__before__f9() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_f8) {
        print__role__f8();
    } else {
        print__before__f8();
    }
}



	
	@featureHouse.FeatureAnnotation(name="f9")
private void  print__role__f9(){
		print__before__f9();
		System.out.println("F9");
		try{
			  Thread.currentThread().sleep(50);
			}
			catch(InterruptedException ie){
			}
	}

	
	@featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=13, thenFeature="f9", elseFeature="featureSwitch")
private void
print__before__f10() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_f9) {
        print__role__f9();
    } else {
        print__before__f9();
    }
}



	
	@featureHouse.FeatureAnnotation(name="f10")
private void  print__role__f10(){
		print__before__f10();
		System.out.println("F10");
		try{
			  Thread.currentThread().sleep(80);
			}
			catch(InterruptedException ie){
			}
	}

	
	@featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=15, thenFeature="f10", elseFeature="featureSwitch")
private void
print() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_f10) {
        print__role__f10();
    } else {
        print__before__f10();
    }
}




}
