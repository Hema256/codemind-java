import java.util.Scanner;
class ab
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],i,a,b,n,max,found=0;
        n=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        x=new int[n];
        for(i=0; i<n; i++)
         x[i]=sc.nextInt();
         max=x[n-1];
         
         for(i=0; i<n; i++)
         {
             if(x[i]<=a ||x[i]>=b)
             if (x[i]>max)
             {
                 max=x[i];
                 found=1;
             }
         }
         if(found==1)
         System.out.println(max);
         else
         System.out.println(-1);
    }
}