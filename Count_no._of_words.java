import java.util.Scanner ;
class otp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int n=s1.length();
        int wc=0;
        for(int i=0; i<n;i++)
        {
            char ch=s1.charAt(i);
            if(ch==' '&& s1.charAt(i+1)!=' ')
            {
                wc++;
            }
        }
        System.out.print(wc+1);
            
    }
}