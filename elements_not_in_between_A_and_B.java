import java.util.Scanner;
class average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,sum=0,a,b,flag=0; 
        double avg=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0; i<n; i++)
            x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=0; i<n; i++)
        {
            if (x[i]<a ||x[i]>b)
            {
                System.out.print(x[i]+" ");
                flag=1;
            }
        }
        if (flag==0)
        System.out.print(-1);
        
            
    }
    
}