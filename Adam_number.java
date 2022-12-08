import java.util.Scanner;
class av
{
    public static int rev(int n)
    {
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
            
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sq,n1,sq1,sq2;
        n=sc.nextInt();
        sq=n*n;
        n1=rev(n);
        sq1=n1*n1;
        sq2=rev(sq1);
        if(sq==sq2)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
        
    }
}