import java.util.Scanner;
class cg
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,b;
        n=sc.nextInt();
        b=sc.nextInt();
        int i=1;
        while(i<=b)
        {
            if(i%2!=0)
            {
                System.out.println(n+ " x " +i+ " = " +(n*i));
            }
            i++;
        }
            
        
    }
}