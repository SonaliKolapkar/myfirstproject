package basic;

 class CarTest 
{
	
	public static void main(String[] args) {
		Car c1 = new Car(1001, 12776, "TATA", 500000f, 35.00f);
		Car c2 = new Car(1002, 12776, "Maruti", 300000f, 12.09f);
		Car c3 = new Car(1003, 12776, "NANO", 200000f, 30.05f);
		Car c4 = new Car(1004, 12776, "Mahindra", 300000f, 12.06f);
		Car c5 = new Car(1005, 12776, "TATA", 400000f, 50.00f);

		if (c1.price > c2.price && c1.price > c3.price && c1.price > c4.price && c1.price > c5.price) {
			System.out.println("c1 is expensive");
			c1.display();

		}
		if (c2.price > c1.price && c2.price > c3.price && c2.price > c4.price && c2.price > c5.price) {
			System.out.println("c2 is expensive");
			c2.display();

		}

		if (c3.price > c1.price && c3.price > c2.price && c3.price > c4.price && c3.price > c5.price) {
			System.out.println("c3 is expensive");
			c3.display();

		}
		if (c4.price > c1.price && c4.price > c2.price && c4.price > c3.price && c4.price > c5.price) {
			System.out.println("c4 is expensive");
			c4.display();

		}
		if (c5.price > c1.price && c5.price > c2.price && c5.price > c3.price && c5.price > c4.price) {
			System.out.println("c5 is expensive");
			c5.display();

		}
	}
}
