import java.util.*;
class prime
{
    public static boolean isprime(int n)
    {
        int count=0;
        if(n==1)
        return false;
        for( int i=2; i<=(int)Math.sqrt(n); i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0; i<n; i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0; i<n; i++)
        {
            if(isprime(x[i]))
            {
                c++;
            }
        }
        System.out.print(c);
    }
    
}