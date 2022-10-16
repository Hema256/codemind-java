import java.util.Scanner;
class average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,sum=0; 
        double avg=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0; i<n; i++)
        {
            x[i]=sc.nextInt();
            sum=sum+x[i];
        }
        avg=(double)sum/n;
        System.out.format("%.2f",avg);
            
    }
    
}