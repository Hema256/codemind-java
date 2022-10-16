import java.util.Scanner;
class average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,max;
        n=sc.nextInt();
        x=new int[n];
        for(i=0; i<n; i++)
        {
            x[i]=sc.nextInt();
        }
        max=x[0];
        for(i=0; i<n; i++)
        {
            if (max<=x[i])
            {
                max=x[i];
            }
        }
        System.out.print(max);
        
    }
}