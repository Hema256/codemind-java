import java.util.Scanner;
class cg
{
    public static boolean palin(int n)
    {
        int rev=0,r;
        int temp=n;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==temp)
        return true;
        else
        return false;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d1,d2;
        n=sc.nextInt();
        for(int i=n+1; ; i++)
        {
            if(palin(i))
            {
                d1=i;
                break;
            }
        }
        for(int i=n-1; ; i--)
        {
            if(palin(i))
            {
                d2=i;
                break;
            }
        }
        if((d1-n)>(n-d2))
        {
            System.out.println(d2);
        }
        else if((d1-n)<(n-d2))
        {
            System.out.println(d1);
        }
        else 
        {
            System.out.println(d2+" "+d1);
        }
    }
}