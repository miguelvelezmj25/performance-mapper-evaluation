import featureHouse.FeatureAnnotation;


public class Main {


	public static void main(String[] args) {
		int time = 10;
		if(args.length == 1)
			time = Integer.parseInt(args[0]);
		Main m = new Main();
		long runs = 0;
		for (int i = 0; i < 10; i++) {
			runs += m.startMeasurement(time);
		}
		runs = runs / 10;
		System.out.println("Method exectutions: " + runs);
		System.out.println("Executions per second: " + (runs / time) );

	}
	
	public Main(){		
		super();
	}
	
	//@featureHouse.FeatureAnnotation(name="f1")
	public long startMeasurement(int seconds) {
		long time = seconds * 1000;
		long runs = 0;
		long start = System.currentTimeMillis();
		while(true){
			if(System.currentTimeMillis() - start >= time)
				break;
			foo();
			runs++;
		}
		return runs;
	}	
	

	//@featureHouse.FeatureAnnotation(name="f1")
	public boolean foo() {
		int x = 20 * 20;
		if (x == 400)
			return true;
		return false;
	}
}
