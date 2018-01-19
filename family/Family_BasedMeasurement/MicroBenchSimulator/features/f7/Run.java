
public class Run {
	private void print(){
		System.out.println("F7");
		for (int i = 0; i < 5; i++) {
			original();
			try{
				  Thread.currentThread().sleep(20);
				}
				catch(InterruptedException ie){
				}
		}
	}
}
