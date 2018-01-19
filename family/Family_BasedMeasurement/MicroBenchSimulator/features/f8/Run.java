
public class Run {
	private void print(){
		original();
		System.out.println("F8");
		try{
			  Thread.currentThread().sleep(200);
			}
			catch(InterruptedException ie){
			}
	}
	
	private void dosomething(){
		original();
		try{
			  Thread.currentThread().sleep(20);
			}
			catch(InterruptedException ie){
			}
	}
}
