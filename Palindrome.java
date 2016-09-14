import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=String.valueOf(n);
		StringBuffer sb=new StringBuffer(s);
		
		String reverse=sb.reverse().toString();
		//System.out.println(s);
		//System.out.println(reverse);
		if(reverse.compareTo(s)==0)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println(" Not Palindrome");
		}

	}

}
