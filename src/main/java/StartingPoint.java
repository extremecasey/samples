

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
//import java.util.*;
//import java.util.Scanner;
/**
 * 
 * @author caseyk
 * @version 1.0
 * 
 *
 *
 *
 */


public class StartingPoint {
	public static void main(String args[]) {

//		System.out.println(args[0]);
		
//		final int myinteger = 123;
		
//		myinteger = 123;
//		myinteger = 222; // reassignment causes an error
//		boolean mybool;
//		mybool = (boolean)true; 
		
		System.gc();
		System.out.println("version 1.1");
// List 
	     List<String> a1 = new ArrayList<String>();
	      a1.add("Zara");
	      a1.add("Mahnaz");
	      a1.add("Ayan");
	      System.out.print("ArrayList Elements : ");
	      System.out.println(a1);

		
		
		Car MyCar = new Car();
//		@SuppressWarnings (value = "unused")
		Car MyCar2 = new Car();
//		Car MyCar3 = new Car();
//		Car MyCar4 = new Car();
	
		System.out.println();
// Serialization 
		MyCar2.persistCar();
		Car MyNewCar = Car.fetchCar("Car"+MyCar2.hashCode()+".ser");
		System.out.println("my fetched Car is (" + MyNewCar.toString()+")\n");
		
		
		MyCar.setColor("Red");
//		MyCar.Run();
		SubCar subbb = new SubCar();
		subbb.setMake("Ford");
		subbb.numWheels = 6;

//		System.out.println("MyCar is String is (" + MyCar.toString()+")\n");


		System.out.println("Instanceof checking");
		if (MyCar instanceof Vehicle) {
			System.out.println("MyCar is a Vehicle");
		} else {
			System.out.println("MyCar is NOT a Vehicle");
		};
		if (MyCar instanceof Object) {
			System.out.println("MyCar is an Object");
		} else {
			System.out.println("MyCar is NOT an Object");
		};
		if (MyCar instanceof Car) {
			System.out.println("MyCar is a Car");
		}	else {
			System.out.println("MyCar is NOT a Car");
		};
		if (MyCar instanceof SubCar) {
			System.out.println("MyCar is a SubCar");
		} else {
		System.out.println("MyCar is NOT a SubCar");
		};
		
// REFLECTION
//		String Random2String = "This is my s\"tring:";
		
		System.out.println("\nReflection");
		System.out.println("hashCode for MyCar is : " + MyCar.hashCode());
			
		Class<Car> reflectClass = Car.class;
		
		System.out.println("REFLECT My class is : " + reflectClass.getName());
		
		Method[] classMethods = reflectClass.getMethods();		
		for (Method listMethods : classMethods) {
			System.out.print("Method Name: " + listMethods.getName());

			System.out.print("\treturns (" + listMethods.getReturnType()+")");

			if (listMethods.getName().startsWith("get")) {
				System.out.println(" : Getter");
			} else if (listMethods.getName().startsWith("set")) {
				System.out.println(" : Setter");
			} else {
				
				System.out.println("");
			}
			
			
			
		}
		

		
// OTHER TESTS 		
		
		
		double a = Math.PI;

		int dice = 0;
		Random r = new Random();
		dice = r.nextInt(6) + 1;

		MyCar.setMake("Porsche " + a + " Dice " + dice);

		System.out.println(Car.numVehicles + " Car(s) Created");

		int[] nums = new int[100];
		System.out.println("array size: " + nums.length);


		System.out.println("My car is a " + MyCar.getMake());
		System.out.println("And the Color is " + MyCar.getColor());
		if (!MyCar.isClean()) MyCar.washMe();
		if (!MyCar.isClean()) MyCar.washMe();

		System.out.print("\nEnter the number of interations: ");
		Scanner ImportFromUser = new Scanner(System.in);
		int start = 0;
		int finish = ImportFromUser.nextInt();
		//		int stat;
		while ( start++ < finish) {
			System.out.print("mpg="+MyCar.calcmpg()+ " " + start + " - Running " + MyCar.id + " > " );
			MyCar.run(155);

		}

		divideByZero(7);

	}

	public static void divideByZero(int b) {
		
		try
		{
			System.out.println(b/0);
		} 
		catch (ArithmeticException e){
			System.out.println("You cant do that : " + e.getMessage() + " : " + e.toString());
//			e.printStackTrace();
		}
		
	}
	}





