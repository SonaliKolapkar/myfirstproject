package basic;

public class Car 
{
		int id;
		int model_no;
		String brand;
	    float price;
		float avg;
		
	Car(int id,int model_no,String brand,float price,float avg)
	{
    this.id = id;
	this.model_no = model_no;
	this.brand = brand;
	this.price = price;
	this.avg = avg;
}
void display() 
{
	        System.out.println("=======");
			System.out.println(id);
			System.out.println(model_no);
			System.out.println(brand);
			System.out.println(price);
			System.out.println(avg);
}
}
	
