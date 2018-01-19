import java.util.*;

//f2
public class Run {


	private void dosomething() {
		try{
			  //do what you want to do before sleeping
			  Thread.currentThread().sleep(5000);//sleep for 1000 ms
			  //do what you want to do after sleeptig
			  original();
			  domore();
			}
			catch(InterruptedException ie){
			//If this thread was intrrupted by nother thread 
			}
	}
	
	private void domore()
	{
		original();
	}
}
