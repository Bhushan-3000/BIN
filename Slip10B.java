import java.util.*;
public class Slip10B {
    public static void main(String arg[])
    {
        HashMap <Character,Integer> hm= new HashMap<Character,Integer>();
        String s=arg[0];
        char ch[]=s.toCharArray();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            int count=0;
            char c=ch[i];
            for(int j=i;j<n;j++)
            {
                if (c==ch[j]) 
                {
                    count++;
                }
            }
            if (hm.containsKey(c)) 
            {
                continue;
            }
            else 
            {
                hm.put(ch[i], count);
            }
        }
        System.out.print("The frequency of characters in the given string"+hm);
    }
   
}
