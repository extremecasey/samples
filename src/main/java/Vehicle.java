

 abstract class  Vehicle {
	final static double GRAVITY = 9.81; 
    final static String DATABASE_PATH = "ORACLE7521\\12311\\RFF";
	final static char LEVEL = 'c';
	int numWheels;
	Double cost;
	String countryOfOrigin;
	float autompg; 
	boolean clean = false;
	static int numVehicles = 0;

	public Vehicle(){
		
	}
	
	int run(int TopSpeed){
		System.out.println("Vroom @ " + TopSpeed);
		return TopSpeed;
	}

	abstract void ShowMe(int a);
}
