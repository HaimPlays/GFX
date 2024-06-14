import java.util.*;
public class random
{
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
      int screens, cam, alert, stinger, totalscreen, totalcam, totalalert, totalstinger, total;
      System.out.println("How many screens do you want? (Starting, intermission, etc) (If you dont want any input 0)");
      screens=reader.nextInt();
      System.out.println("How many camera borders do you want? (Its pretty much the gameplay scene, and the cam border will go on the intermission screen if purchased) (If you dont want any input 0)");
      cam=reader.nextInt();
      System.out.println("How many alerts do you want? (If you dont want any input 0)");
      alert=reader.nextInt();
      System.out.println("How many stinger transitions do you want? (If you dont want any input 0)");
      stinger=reader.nextInt();
      totalscreen=screens*10;
      totalcam=cam*10;
      totalalert=alert*20;
      totalstinger=stinger*15;
      total=totalscreen+totalcam+totalalert+totalstinger;
      System.out.println("The total cost for all the screens is:  "+totalscreen+" USD");
      System.out.println("The total cost for all the camera borders is:  "+totalcam+" USD");
      System.out.println("The total cost for all the alerts is:  "+totalalert+" USD");
      System.out.println("The total cost for all the stinger transitions is:  "+totalstinger+" USD");
      System.out.println("The total cost for your desiered stream package is:  "+total+" USD");
      System.out.println("If you would like to purchase the package please send a screen shot to HaimPlays on twitter.");
    }
}
