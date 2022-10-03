import java.util.Scanner;
class av
{
    public static boolean rev(int n)
    {
        int sum=0,r,temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
            
        }
        if(temp==sum)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        for(int i=1; i<=t; i++)
        {
            int n;
            n=sc.nextInt();
            if(rev(n))
            {
            System.out.println("True");
            }
            else
            {
            System.out.println("False");
            }
            
        }
    }
}