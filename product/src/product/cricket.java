package product;

public class cricket{

	int match;
	float strikeRate;
	cricket(int x,int y){
		match=x;
		strikeRate=y;
	}
	



	public static void main(String[] args) {
		System.out.println("batsman careers");
		cricket MSDhoni=new cricket(140,190);
		cricket Kohli=new cricket(130,120);
		cricket raina=new cricket(109,150);
		cricket sachin=new cricket(170,110);
		System.out.println(MSDhoni.match);
		System.out.println(MSDhoni.strikeRate);
		System.out.println(Kohli.match);
		System.out.println(Kohli.strikeRate);
		System.out.println(raina.match);
		System.out.println(raina.strikeRate);
		System.out.println(sachin.match);
		System.out.println(sachin.strikeRate);
	}
	
}