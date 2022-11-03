import java.util.Scanner;
class ad
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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int j=0; j<n; j++)
        {
            int a,h=0;
            a=sc.nextInt();
    
            for(int k=2; k<=a/2; k++)
            {
                int s1;
                s1=k;
               if(isprime(s1))
               {
                   for(int l=2; l<=a/2; l++)
                   {
                       int s2=l;
                       if(isprime(s2))
                       {
                           if(s1!=s2)
                           {
                               if(s1*s2==a)
                               {
                                   h=1;
                                   System.out.println("YES");
                                   break;
                               }
                           }
                       }
                   }
                   if(h==1)
                   {
                        break;
                   }
               }
            
               
            }
            if(h==0)
            System.out.println("NO");
            
            
        }
    }
}