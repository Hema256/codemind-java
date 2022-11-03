import java.util.Scanner;
class cg
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,rev=0,r;
        n=sc.nextInt();
        int temp=n;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==temp)
        System.out.print("True");
        else
        System.out.print("False");
            
        
    }
}