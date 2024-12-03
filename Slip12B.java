public class Slip12B 
{
    public static void main(String arg[])
    {
        StringBuffer temp=new StringBuffer();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < arg.length; i++) 
        {
            temp.append(arg[i]).reverse();
            sb.append(temp);
            temp.delete(0, arg[i].length());
        }
        System.out.println(temp);
    }   
}
