import java.util.Scanner;
class abn
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            if(i*(i+1)==n)
            {
                c=1;
                break;
            }
        }
        if(c==1)
        System.out.print("YES");
        else
        System.out.print("NO");
    }
}