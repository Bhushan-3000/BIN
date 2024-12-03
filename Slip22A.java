import java.io.*;
import java.util.*;

public class Slip22A {
    public static void main(String[] args) throws Exception {
        int ch = 0;
        FileWriter fw;
        String fnm, fnms;
        File f1, f2;
        do {
            System.out.println("1. create a file");
            System.out.println("2. rename a file");
            System.out.println("3. delete a file");
            System.out.println("4. display path of file");
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("enter the name of the file to be created ");
                    sc = new Scanner(System.in);
                    fnm = sc.next();
                    fw = new FileWriter(fnm);
                    fw.write("this  file is created for testing ");
                    fw.flush();
                    fw.close();
                    break;

                case 2:
                    System.out.println("enter the file to be renamed");
                    sc = new Scanner(System.in);
                    fnm = sc.next();
                    f1 = new File(fnm);

                    System.out.println("enter the new file name");
                    sc = new Scanner(System.in);
                    fnms = sc.next();
                    f2 = new File(fnms);
                    f1.renameTo(f2);
                    System.out.println("file has been renamed");
                    break;

                case 3:
                    System.out.println("enter the name of the file to be deleted");
                    sc = new Scanner(System.in);
                    fnm = sc.next();
                    f1 = new File(fnm);
                    f1.delete();
                    System.out.println("the file has been deleted successfully");
                    break;

                case 4:
                    System.out.println("enter the file to be shown the path of ");
                    sc = new Scanner(System.in);
                    fnm = sc.next();
                    f1 = new File(fnm);
                    System.out.println("this file path is" + f1.getAbsolutePath());
                    break;
            }
        } while (ch <= 4);
    }
}