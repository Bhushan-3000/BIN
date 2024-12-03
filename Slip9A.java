class checkPan extends Exception
{
    checkPan()
    {
        System.out.println("Invalid data");
    }   
}
class checkMobile extends Exception
{
    checkMobile()
    {
        System.out.println("Invalid Data");
    }
}
public class Slip9A {
    public static void main(String arg[])
    {
        try {
            int f=0;
            String pno=arg[0];
            String mno=arg[1];
            if (pno.length()!=10 ) {
                throw new checkPan();
            }
            else if(mno.length()==10)
            {
                for (int i = 0; i < mno.length(); i++) {
                    if (mno.charAt(i)>='0' && mno.charAt(i)<='9') {
                        f=1;
                    }
                    else 
                    {
                        f=0;
                        break;
                    }
                }
            }
            if (f==0) {
                throw new checkMobile();
            }
        } catch (checkPan e) {
            System.out.println("PAN number should have 10 characters");
        }
        catch(checkMobile e)
        {
            System.out.println("the mobile no should have only 10 digits and no characters");
        }
    }
}