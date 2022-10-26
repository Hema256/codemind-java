import java.util.*;
class prime
{
    public static boolean isprime(int n)
    {
        if(n==1)
        return false;
        for( int i=2; i<=(int)Math.sqrt(n); i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,sum=0;
        double avg;
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
                sum=sum+x[i];
                c++;
            }
        }
        avg=(double)sum/c;
        System.out.format("%.2f",avg);
    }
    
}