import java.util.Scanner;
class ab
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],i,n,min;
        n=sc.nextInt();
        x=new int[n];
        for(i=0; i<n; i++)
         x[i]=sc.nextInt();
         min=x[0];
         
         for(i=0; i<n; i++)
         {
             
             if (x[i]<min)
             {
                 min=x[i];
             }
         }
         System.out.println(min);
    }
}