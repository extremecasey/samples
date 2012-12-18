

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Car extends Vehicle implements Washable, EnergyConsumer, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5936164016500383367L;
	int id = 5555;
	private String color = "blue";
	private String make = "themake";
	private String model = "themodel";
	private int year = 1956;
	@SuppressWarnings("unused")
	private transient double calculatedMPG = 10.0d; 

	//	qqq = 333;

	public Car() {
		//		color = "Blue"; //default color is blue
		this("Blue");
		this.autompg = 45.123f;
		this.calculatedMPG = 12.44d;

	}
	public Car(String c) {
		super();
		this.color = c; 
		autompg = 45.456f; 
		//		id = ++numVehicles;
	}

	public void persistCar() {
		try
		{
			FileOutputStream fileOut =
					new FileOutputStream("Car"+ this.hashCode() +".ser" );
			ObjectOutputStream out =
					new ObjectOutputStream(fileOut);
			out.writeObject(this);
			out.close();
			fileOut.close();
		}catch(IOException i)
		{
			i.printStackTrace();
		}
		System.out.println("Persisting Car"+ this.hashCode() +".ser");
	}

	static Car fetchCar(String s) {
		Car newCar = null; 
		System.out.println("Locating Car ("+ s +")");
		try
		{
			FileInputStream fileIn =
					new FileInputStream(s);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			newCar = (Car) in.readObject();
			in.close();
			fileIn.close();
			return newCar;
		} catch(IOException i)
		{
			i.printStackTrace();
			return null;
		} catch(ClassNotFoundException c)
		{
			System.out.println("Car ("+ s +") not found.");
			c.printStackTrace();
			return null;
		}
	}

	@Override
	public String toString(){ 
		return (((Integer)id)).toString()+":"+color +":"+make+":"+model+":"+((Integer)year).toString();

	}
	void setColor(String c){
		color = c;
	}
	String getColor(){
		return color;
	}

	void setMake(String m){
		make = m;
	}
	String getMake(){
		return make;
	}
	@Override
	int run(int TopSpeed) {
		// TODO Auto-generated method stub
		return super.run(TopSpeed + 255);
	}
//	@Override
	public void washMe() {
		System.out.println("All Clean!");
		clean = true;
	}
//	@Override
	public boolean isClean() {
		return clean;
	}
//	@Override
	public float calcmpg() {
		return (float) autompg;
	}


	public void ShowMe(int a) {


	};




}
