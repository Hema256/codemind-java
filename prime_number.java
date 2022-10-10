import java.util.Scanner;
class ab
{
    public static boolean isprime(int n)
    {
        for(int i=2; i<=(int)Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if (isprime(n))
        System.out.print("prime");
        else
        System.out.print("not a prime");
    }
}