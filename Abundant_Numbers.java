import java.util.Scanner;
class cg
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,sum=0;
        n=sc.nextInt();
         int i=1;
        while(i<=n/2)
        {
            if(n%i==0)
            sum=sum+i;
            i++;
            
        }
        if(sum>n)
        System.out.print("True");
        else
        System.out.print("False");
        
    }
}