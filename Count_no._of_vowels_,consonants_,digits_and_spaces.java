import java.util.Scanner ;
class otp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int n=s1.length();
        String vw="AEIOUaeiou";
        int vc=0,cc=0,dc=0,s1c=0;
        
        for(int i=0; i<n;i++)
        {
            char ch=s1.charAt(i);
            if(vw.contains(ch+""))
                vc++;
            else if(ch==' ')
                s1c++;
            else if(ch>=48 && ch<=57)
                dc++;
            else
                cc++;
                
        }
        System.out.println("Vowels: "+vc);
        System.out.println("Consonants: "+cc);
        System.out.println("Digits: "+dc);
        System.out.println("White spaces: "+s1c);
                

            
    }
}