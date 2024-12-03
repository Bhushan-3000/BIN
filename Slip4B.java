public class Slip4B {
    public static void main(String[] args) 
    {
        if (args.length==0) {
            System.out.print("NO INPUT PROVIDED");
        }
        else
        {
            String s = args[0]; 
            for (int i = 0; i < s.length(); i += 2) {
                char ch = s.charAt(i);
                System.out.print("" + ch);
            }
        }
    }
}