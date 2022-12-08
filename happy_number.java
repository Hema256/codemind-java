import java.util.Scanner;
class av
{
    public static int rev(int n)
    {
        int s=0,r1;
        while (n>0)
        {
            r1=n%10;
            s=s+r1*r1;
            n=n/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=0,r=n;
        for(int i=0; i<=n; i++)
        {
           r=rev(r);
           if (r==1 || r==7)
           {
               h=1;
               System.out.println("True");
               break;
           }
        }
        if (h==0)
        {
            System.out.println("False");
        }
    }
}
    