import java.util.*;
class Slip21A {
    public static void main(String[] args) {
        Hashtable hash=new Hashtable();
        int flag=0;
        String str;
        // String str1;
        String str2;
        hash.put("delhi", "011");
        hash.put("pune", "020");
        hash.put("navi mumbai", "0215");
        hash.put("nagpur", "0712");
        hash.put("satara", "02162");

        Enumeration names= hash.keys();
        System.out.println("printing entire hash table");
        while (names.hasMoreElements()) 
        {
            str=(String)names.nextElement();
            str2=(String)hash.get(str);
            System.out.print("city:"+str);
            System.out.println("  code:"+str2);
        }
        names=hash.keys();
        System.out.println("\t searching the code for requested city");
        while (names.hasMoreElements()) 
        {
            str=(String)names.nextElement();
            str2=(String)hash.get(str);
            if (str.equals(args[0])) 
            {
                flag=1;
                System.out.println(" city found");    
                System.out.print("\t city:"+str);
                System.out.println("\t code:"+str2+"\n");
            }
            else 
            {
                flag=0;
            }
        }
        if (flag==0) {
            System.out.println("city not found");
        }
    }    
}
