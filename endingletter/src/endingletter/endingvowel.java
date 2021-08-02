package endingletter;

public class endingvowel {
	
static void letter(String a)
{
	char first=a.charAt(0);
	char last=a.charAt(a.length()-1);
	
	if(("aeiou".indexOf(first)-1)==("aeiou".indexOf(last)-1 ))
	{
		System.out.println(true);
		
	}
	else
	{
		System.out.println(false);
	}
	}
static void letter(String a,String b)
{
	char first=a.charAt(0);
	char last=a.charAt(a.length()-1);
	char start=b.charAt(0);
	char end=b.charAt(b.length()-1);
	if((("aeiou".indexOf(first)-1)==("aeiou".indexOf(last)-1 )) &&(("aeiou".indexOf(start)-1)==("aeiou".indexOf(end) )) )
	{
		System.out.println(true);
		
	}
	else
	{
		System.out.println(false);
	}	
}
public static void main(String []args)
{
	letter("anna");
	letter("anitha","eve");
	
}
}
