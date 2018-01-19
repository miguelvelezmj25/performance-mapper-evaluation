
public class Run {
	private void print(){
		original();
		System.out.println("F9");
		try{
			  Thread.currentThread().sleep(50);
			}
			catch(InterruptedException ie){
			}
	}
}
