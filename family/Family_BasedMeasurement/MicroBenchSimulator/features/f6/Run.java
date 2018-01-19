
public class Run {
	private void print(){
		original();
		System.out.println("F6");
		try{
			  Thread.currentThread().sleep(400);
			}
			catch(InterruptedException ie){
			}
	}
	
	private void domore(){
		original();
		print();
		try{
			  Thread.currentThread().sleep(150);
			}
			catch(InterruptedException ie){
			}
	}
}
