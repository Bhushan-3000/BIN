import java.util.*;
class Player
{
    private int p_id;
    private String p_name;
    private int total_runs;
    private int innings_played;
    private int not_out_times;
    static float max=0;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Player id:");
        p_id=sc.nextInt();
        System.out.println("Enter the Player Name:");

        sc=new Scanner(System.in);
        p_name=sc.nextLine();
        System.out.println("Enter the Player Total Runs:");
        total_runs=sc.nextInt();
        System.out.println("Enter the Player innings played:");
        innings_played=sc.nextInt();
        System.out.println("Enter the Player Not Out Times:");
        not_out_times=sc.nextInt();
        // sc.close();
    }
    void display()
    {
        System.out.println("The Player id: "+p_id);
        System.out.println("The Player name: "+p_name);
        System.out.println("The Player total runs: "+total_runs);
        System.out.println("The Player Innings played: "+innings_played);
        System.out.println("The Player Not out times: "+not_out_times);
    }
    void average()
    {
        float avg=total_runs/innings_played;
        System.out.println("Average"+avg);
        if (avg>max) 
        {
            max=avg;    
        }
        // if(avg>max)  max=avg; ? continue;
    }
}
public class Slip7A 
{
    public static void main(String[] args) 
    {
        Player p[]=new Player[10];
        for(int i=0;i<2;i++)
        {
            p[i]=new Player();
            p[i].accept();
        }
        for(int i=0;i<2;i++)
        {
            p[i].display();
            p[i].average();
        }
        System.out.println("Max Average"+Player.max);
    }
}
