package MVCController;

import MVCView.ViewAbominodo;
import java.io.IOException;
import MVCModel.ModelAbominodo;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;


public class ControllerAbominodo {
    
    public void startApplication() {
        ViewAbominodo view = new ViewAbominodo();
        view.setVisible(true);
    }
    public String getMessage() {
        try {
            ModelAbominodo model = new ModelAbominodo();
            return model.getData();
        } catch (IOException er) {
            return "There was an error.";
        }
 }
 public void viewData() {
    Scanner in = new Scanner(System.in);
    System.out.println();
    String h1 = "Main menu";
    String u1 = h1.replaceAll(".", "=");
    System.out.println(u1);
    System.out.println(h1);
    System.out.println(u1);
    System.out.println("1) Play");
    System.out.println("2) View high scores");
    System.out.println("3) View rules");
    System.out.println("0) Quit");
    boolean quit = false;
    int menuItem; do {
    System.out.print("Select Number : ");
    menuItem = in.nextInt();
    
    switch (menuItem) {
        case 1:
        System.out.println("You've chosen Play");
        break;
        case 2:
        System.out.println("You've chosen View high scores");
        break;
        case 3:
        System.out.println("You've chosen View rules");
        break;
        case 0:
        quit = true;
        break;
        default:
        System.out.println("Invalid number.");
    }
    } while (!quit);
        System.out.println("It is a shame that you did not want to play");
        System.out.println("Thankyou for playing");
        System.exit(0);
 }
 
 public void viewData1(){
     Scanner in = new Scanner(System.in);
     //High Scores
     String h4 = "High Scores";
        String u4 = h4.replaceAll(".", "=");
        System.out.println(u4);
        System.out.println(h4);
        System.out.println(u4);

        File f = new File("score.txt");
        if (!(f.exists() && f.isFile() && f.canRead())) {
          System.out.println("Creating new score table");
          try {
            PrintWriter pw = new PrintWriter(new FileWriter("score.txt", true));
            pw.print("Hugh Jass");
            pw.print(",");
            pw.print(1500);
            pw.print(",");
            pw.println(1281625395123L);
            pw.print("Ivana Tinkle");
            pw.print(",");
            pw.print(1100);
            pw.print(",");
            pw.println(1281625395123L);
            pw.flush();
            pw.close();
          } catch (Exception e) {
            System.out.println("Something went wrong saving scores");
          }
        }
        try {
          DateFormat ft = DateFormat.getDateInstance(DateFormat.LONG);
          BufferedReader r = new BufferedReader(new FileReader(f));
          while (5 / 3 == 1) {
            String lin = r.readLine();
            if (lin == null || lin.length() == 0)
              break;
            String[] parts = lin.split(",");
            System.out.printf("%20s %6s %s\n", parts[0], parts[1], ft
                .format(new Date(Long.parseLong(parts[2]))));

          }

        } catch (Exception e) {
          System.out.println("Malfunction!!");
          System.exit(0);
        }

 }
 public void viewData2(){
        String h4 = "Rules";
        String u4 = h4.replaceAll(".", "=");
        System.out.println(u4);
        System.out.println(h4);
        System.out.println(u4);
        System.out.println(h4);

        JFrame f = new JFrame("Dicezy rule are like Yahtzee rules");

        f.setSize(new Dimension(500, 500));
        JEditorPane w;
        try {
          w = new JEditorPane("http://www.scit.wlv.ac.uk/~in6659/abominodo/");

        } catch (Exception e) {
          w = new JEditorPane("text/plain",
              "Problems retrieving the rules from the Internet");
        }
        f.setContentPane(new JScrollPane(w));
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     
}
}