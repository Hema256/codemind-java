import java.util.Scanner;
class pretty
{
    public static void main(String args[])
    {
        int n,a=0,b=0,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for( int j=0;j<n;j++)
        {
            c=0;
            a=sc.nextInt();
            b=sc.nextInt();
            for(int i=a; i<=b; i++)
            {
                if(i%10==2 || i%10==3 || i%10==9)
                c++;
            }
            System.out.println(c);
        }
    }
}