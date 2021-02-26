import java.util.Scanner;

public class Main {
	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		
		generate(s);
		
		
	}

	private static void generate(String s) 
	{
		
		int n=s.length();
		int mid;
		int start;
		for(int i=0;i<n;i++)
		{
			mid=n/2;
			start=0;
			
		    for(int j=2*(n-i);j>=0;j--)
		    {
		    	System.out.print(" ");
		    	
		    }
		    for(int j=0;j<=i;j++)
		    {
		    	if(mid < n)
		    	{
		    	System.out.print(s.charAt(mid)+" ");
		    	mid++;
		    	}
		    	else
		    	{
		    		System.out.print(s.charAt(start)+" ");
		    		start++;
		    	}	
		    }
		    System.out.println();
		}
		
	}	
}
