import java.util.Scanner;
class d
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c=0;
        n=sc.nextInt();
        for(int i=0; i<n;i++)
        {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}