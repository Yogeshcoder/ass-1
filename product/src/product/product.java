package product;

import java.util.Scanner;

public class product {
	String name;
	int qty,price,amount;
	static int netAmount;
	
	void getdata()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter the name");
		name=s.nextLine();
		System.out.println("enter the qty");
		qty=s.nextInt();
		System.out.println("price");
		price=s.nextInt();
		
	}
	
	void calculate()
	{
		amount=qty*price;
		product.netAmount=product.netAmount=amount;
		
		
	}
	 
	void display()
	{
		System.out.println(name);
		System.out.println(price);
		System.out.println(qty);
		System.out.println(amount);
	}
	
public static void main(String[]args) 
{
	product a=new product();
	a.getdata();
	a.calculate();
	
	product b=new product();
	b.getdata();
	b.calculate();
	a.display();
	b.display();
	
	System.out.println("netAounmt"+product.netAmount);
	
}
}
