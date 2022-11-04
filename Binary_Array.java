import java.util.Scanner;
class average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,c=0; 
        double avg=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0; i<n; i++)
            x[i]=sc.nextInt();
        for(i=0; i<n; i++)
        {
            if((x[i]==1)||(x[i]==0))
            {
                continue;
            }
            else
            {
                System.out.print("False");
                System.exit(0);
            }
        }
        System.out.print("True");
        
            
    }
    
}