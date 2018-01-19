
public class Run {
	private void print(){
		original();
		System.out.println("F5");
		try{
			  Thread.currentThread().sleep(300);
			}
			catch(InterruptedException ie){
			}
	}
	
	private void dosomething(){
		original();
		try{
			  Thread.currentThread().sleep(300);
			}
			catch(InterruptedException ie){
			}
	}
}
