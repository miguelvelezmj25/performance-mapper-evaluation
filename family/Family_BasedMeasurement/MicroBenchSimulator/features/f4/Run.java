
public class Run {
	private void print(){
		original();
		System.out.println("F4");
		try{
			  Thread.currentThread().sleep(200);
			}
			catch(InterruptedException ie){
			}
	}
}
