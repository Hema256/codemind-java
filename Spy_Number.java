import java.util.Scanner;
class ab
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,pro=1,r;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            pro=pro*r;
            n=n/10;
        }
        if(sum==pro)
        {
            System.out.print("Spy Number");
        }
        else
        {
            System.out.print("Not Spy Number");
        }
    }
}