import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
      String num1 = "Please enter the first whole number you would like to add.";
      String num2 = "Please enter the second whole number you would like to add.";
      String num3 = "Please enter the third whole number you would like to add.";
      String dub1 = "Please enter the first decimal number you would like to add.";
      String dub2 = "Please enter the second decimal number you would like to add.";
      String dub3 = "Please enter the third decimal number you would like to add.";
        System.out.println(num1);
        int ans = keyboard.nextInt();
        System.out.println(num2);
        int ans1 = keyboard.nextInt();
        System.out.println(num3);
        int ans2 = keyboard.nextInt();
        System.out.println(dub1);
        double ans3 = keyboard.nextDouble();
        System.out.println(dub2);
        double ans4 = keyboard.nextDouble();
        System.out.println(dub3);
        double ans5 = keyboard.nextDouble();
        int sum = ans + ans1 + ans2;
        System.out.println("The sum of " + ans + " + " + ans1 + " + " + ans2 + " = " + sum);
        double sum1 = ans3 + ans4 + ans5;
        System.out.println("The sum of " + ans3 + " + " + ans4 + " + " + ans5 + " = " + sum1);




    //TODO prompt the user to get input for all of the above int variables.

    //TODO prompt the user to get input for all of the above double variables.

    //TODO print the three ints and their sum.

    //TODO print the three doubles and their sum.

  }
}
