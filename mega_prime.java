import java.util.Scanner;
class mega
{
	public static boolean isprime(int n)
	{
        if(n==1)
        return false;
		for(int i=2; i<=(int)Math.sqrt(n); i++)
		{
			if(n%i==0)
		
			return false;
		}
		return true;
	}
	public static boolean digit(int n)
	{
		int r,sum;
		while(n>0)
		{	
			r=n%10;
			n=n/10;
			if (isprime(r))
    	    {
    			continue;
    		}
    		else
    		{
    			return false;
    	    }
		    	
			
		}
		return true;
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		if(isprime(n) && digit(n))
		System.out.println("Mega Prime");
			
		else
		System.out.println("Not Mega Prime");
			
		
	}

	
}