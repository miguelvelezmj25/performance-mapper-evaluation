import java.util.*;

//f3
public class Run {


	private void dosomething() {
		try
		{
		Thread.sleep(1000);
		}
		catch(InterruptedException ie){
		//If this thread was intrrupted by nother thread 
		}
		original();
		
		domore();
	}
}
