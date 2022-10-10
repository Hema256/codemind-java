import java.util.Scanner;
class small
{
    public static int fact(int n)
    {
         int factorial=1,i;
         for(i=1; i<=n; i++ )
         {
             factorial=factorial*i;
         }
         return factorial;
         
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,a,p;
        t=sc.nextInt();
        for(int i=1; i<=t; i++)
        {
            a=sc.nextInt();
            p=fact(a);
            System.out.println(p);
        }
        
    }
}