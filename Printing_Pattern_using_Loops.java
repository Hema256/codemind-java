import java.util.*;
class printingpattern
{
   static void pattern(int n)
   {
       int left=0,top=0,right=2*n-1,down=2*n-1;
       for(int i=0; i<=2*n-2; i++)
       {
           for(int j=0; j<=2*n-2; j++)
           {
               int min_disc=Math.min(Math.min(i,down-i-1),Math.min(right-j-1,j));
               if(j==2*n-2)
               System.out.print(n-min_disc+" ");
               if(j<2*n-2)
               System.out.print(n-min_disc+" ");
           }
           System.out.println();
       }
   }
   public static void main(String args[])
   {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   pattern(n);
   }
}
    
