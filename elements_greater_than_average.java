import java.util.Scanner;
class ad
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],i,c=0,avg,n,sum=0;
        n=sc.nextInt();
        x=new int[n];
        for( i=0; i<n; i++)
        {
            x[i]=sc.nextInt();
            sum+=x[i];
            
        }
        avg=(int)sum/n;
        for(i=0; i<n; i++)
        {
            if(x[i]>=avg)
            c++;
            
        }
        System.out.print(c);
        
    }
}