import java.util.Scanner;
class fib
{
    public static void main(String args[])
    {
        int n,a=0,b=1,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        for(int i=1; i<=n; i++)
        {
            
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
            
        }
        
        
        
    }
}