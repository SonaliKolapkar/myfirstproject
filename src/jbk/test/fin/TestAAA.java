package jbk.test.fin;

public class TestAAA
{
	public static void main(String[] args) 
	{
		Book b1=new Book();
	    Book b2=new Book();
	    Book b3=new Book();
	    Book b4=new Book();
	    Book b5=new Book();
	    Book b6=new Book();
	    Book b7=new Book();
	    
	    b1.id=111;
	    b1.bookname="java";
	    b1.author="E Balagurusamy";
	    b1.price=478f;
	    
	    b2.id=112;
	    b2.bookname="Core Java";
	    b2.author="Dr.R.Nageswara Rao";
	    b2.price=519f;
	    
	    b3.id=113;
	    b3.bookname="OOPs with C++";
	    b3.author="Reema Thareja";
	    b3.price=360f;
	    
	    b4.id=114;
	    b4.bookname="Data Structures";
	    b4.author="Alfred V. Aho";
	    b4.price=560f;
	    
	    b5.id=115;
	    b5.bookname="james";
	    b5.author="sksksk";
	    b5.price=745f;
	    
	    b6.id=116;
	    b6.bookname="johns";
	    b6.author="sss";
	    b6.price=350f;
	    
	    b7.id=117;
	    b7.bookname="sskkoollaapp";
	    b7.author="sks";
	    b7.price=253f;
	    
	    
	    Order o1 =new Order();
	    Order o2 =new Order();
	    Order o3 =new Order();
	    
	    o1.orderid=4321;
	    o1.orderdate="16 jan 2001";
	    o1.calBill(b1,b2,b3);
	    
	    o2.orderid=461;
	    o2.orderdate="10 march 2022";
	    o2.calBill(b1,b3,b2);
	    
	    o3.orderid=123;
	    o3.orderdate="20 feb 2015";
	    o3.calBill(b1,b2,b3);
	    
	}
}
