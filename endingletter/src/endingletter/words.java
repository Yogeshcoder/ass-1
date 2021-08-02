package endingletter;

public class words {
	static void letter(String a)
	{
		int n=a.length();
		char first=a.charAt(0);
		char last=a.charAt(n-1);
		if(first==last)
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
	int n=a.length();
	char first=a.charAt(0);
	char last=a.charAt(n-1);
	int m=b.length();
	char start=b.charAt(0);
	char end=b.charAt(m-1);
	if((first==last)&&(start==end))
	{
		System.out.println(true);
	}
	else
	{
		System.out.println(false);
	}
	}
public static void main(String[]args) {
	letter("annai");
	letter("level","anitha");
}
}
