import java.util.*;

//base
public class Run {

	/**
	 * @param args
	 */
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
	public static void temp()
	{
		Run a = new Run();
		a.dosomething();
		a.print();
	}
	
	private void dosomething() {
		try{
			  //do what you want to do before sleeping
			  Thread.currentThread().sleep(2000);//sleep for 1000 ms
			  //do what you want to do after sleeptig
			}
			catch(InterruptedException ie){
			//If this thread was intrrupted by nother thread 
			}
	}
	
	private void domore() {
		try{
			  //do what you want to do before sleeping
			  Thread.currentThread().sleep(1111);//sleep for 1000 ms
			  //do what you want to do after sleeptig
			}
			catch(InterruptedException ie){
			//If this thread was intrrupted by nother thread 
			}
	}
	
	private void print(){
		System.out.println("Base");
		try{
			  Thread.currentThread().sleep(500);
			}
			catch(InterruptedException ie){
			}
	
	}
	
}
