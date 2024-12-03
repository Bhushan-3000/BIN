import java.util.*;
public class Slip6A {
    public static void main(String[] args) 
    {
        int rows=Integer.parseInt(args[0]);
        int columns=Integer.parseInt(args[1]);
        
        Scanner sc =new Scanner(System.in);
        
        System.out.print("Enter the elements in the matrix");

        int mtrix[][]=new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                mtrix[i][j]=sc.nextInt();
            }
        }

        sc.close();
        int trnspsemtrix[][]=new int[rows][columns];
        
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++) 
            {
                trnspsemtrix[i][j]=mtrix[j][i];
            }
        }
        System.out.println("The Matrix is:");
        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                System.out.print(""+mtrix[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("The Transpose Matrix is:");
        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                System.out.print(""+trnspsemtrix[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}