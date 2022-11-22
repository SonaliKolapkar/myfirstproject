package inheritance;

public class Car extends Vehicle
       {
	
		String modelType;
		public String color;
		public void showDetail() 
		{
		vehicleType="Car";
			modelType="sports";
			System.out.println(modelType+""+vehicleType);
		}
		public static void main(String[] args) 
		{
		Car car=new Car();
		car.showDetail();
		}
		}
