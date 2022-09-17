import java.util.Scanner;
class ad
{
    public static boolean isprime(int n)
    {
        if (n<2)
        return false;
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if (n%i==0)
            count++;
        }
        if (count==0)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        int x[],n,i,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        
        for(i=0; i<n; i++)
        x[i]=sc.nextInt();
        for(i=0; i<n; i++)
        {
            if(isprime(x[i]))
            {
                
                c++;
                
            }
        }
        System.out.println(c);
        
    }
}