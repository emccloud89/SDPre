import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true){{
      printMenu();}
      selection = scanner.nextInt();
      if (selection == 1) {
        System.out.println("Hello Human");
      } else if (selection == 2) {
          System.out.println("Apple, Bananas, Coconuts");      
         } else if (selection == 3) {
              System.out.println("Goodbye");
              scanner.close();
            }  

  }
}
  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}