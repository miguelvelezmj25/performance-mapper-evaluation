import java.util.*;

//f1
public class Run {

	private void dosomething() {
		try{
			  //do what you want to do before sleeping
			  Thread.currentThread().sleep(1000);//sleep for 1000 ms
			  //do what you want to do after sleeptig
			  original();
			}
			catch(InterruptedException ie){
			//If this thread was intrrupted by nother thread 
			}
	}
	private void domore(){
		try{
			  //do what you want to do before sleeping
			  Thread.currentThread().sleep(555);//sleep for 1000 ms
			  //do what you want to do after sleeptig
			}
			catch(InterruptedException ie){
			//If this thread was intrrupted by nother thread 
			}
			original();
	}
}
