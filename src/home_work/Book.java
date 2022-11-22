package home_work;

public class Book 
{
	int bookid;
	String booktitle;
	String author;
	float cost;
	String publisher;
	long bookno;

void accept(int bookid, String booktitle,String author,float cost,String publisher,long bookno)
{
	this.bookid=bookid;
	this.author=author;
	this.cost=cost;
	this.publisher=publisher;
	this.bookno=bookno;
}
void display() 
{
	System.out.println("==========");
	System.out.println(bookid);
	System.out.println(booktitle);
	System.out.println(author);
	System.out.println(cost);
	System.out.println(publisher);
	System.out.println(bookno);
}
}

