package home_work;

public class Test_B 
{
public static void main(String[] args)
{
		Book b1=new Book();
		Book b2=new Book();
		Book b3=new Book();
		Book b4=new Book();
		Book b5=new Book();
		Book b6=new Book();
	
b1.accept(221,"OOps in C++","Rajesh K.Shukla",50.77f,"Wiley",9788126516582L);
b2.accept(222,"Java","E Balagurusamy",46.00f,"McGraw Hill Education",9353162343L);
b3.accept(223,"Visual Basics6","Gary Cornell",60.88f,"McGraw Hill Education",9353168943L);
b4.accept(224,"Core Python","Dr.R.Nageswara Rao",637.00f,"Dreamtech Press",9789390457151L);
b5.accept(225,"HTML & CSS","Thomas A.Powell",843.60f,"McGraw Hill Education",9780070701946L);
b6.accept(226, "Data Science","Ervin Kreyszig",849.88f,"Khanna Publishing",9789386173676L);  

            b1.display();
			b2.display();
			b3.display();
			b4.display();
			b5.display();
			b6.display();
}
}

