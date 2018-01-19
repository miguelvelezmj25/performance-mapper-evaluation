
public class Run {
	private void print(){
		original();
		System.out.println("F10");
		try{
			  Thread.currentThread().sleep(80);
			}
			catch(InterruptedException ie){
			}
	}
	
	private void domore(){
		print();
		original();
	}
}
