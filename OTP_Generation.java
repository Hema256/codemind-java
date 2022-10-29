import java.util.Scanner ;
class otp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int n=s1.length();
        int a=0;
        
        for(int i=0; i<n;i++)
        {
            char ch=s1.charAt(i);
            int num=Integer.parseInt(String.valueOf(ch));
            if(num%2!=0)
            {
                int p=num*num;
                System.out.print(p);
            }
            
        }
            
    }
}