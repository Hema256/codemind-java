import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,c=0,x;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n-->0)
        {
            x=sc.nextInt();
            if(x%2!=0)
              c++;
        }
        if(c<=2)
           System.out.println("YES");
        else
           System.out.println("NO");
    }
}