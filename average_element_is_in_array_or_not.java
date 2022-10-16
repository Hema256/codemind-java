import java.util.Scanner;
class average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,avg=0,sum=0,found=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0; i<n; i++)
        {
            x[i]=sc.nextInt();
            sum=sum+x[i];
        }
        avg=sum/n;
        for(i=0; i<n; i++)
        {
            if (x[i]==avg)
            found=1;
        }
        if (found==1)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
        
    }
    
}