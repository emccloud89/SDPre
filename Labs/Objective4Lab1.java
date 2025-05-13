import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String fname = "What is your first name?";
    String lname = "What is your last name?";
    String favoriteAnimal = "What is your favorite animal?";
    String favoriteFood = "What is your favorite food?";
    String favoriteSong = "What is your favorite song?";
      System.out.println(fname);
      String userInput = keyboard.nextLine();
      System.out.println(userInput);
      System.out.println(lname);
      String userInput1 = keyboard.nextLine();
      System.out.println(userInput1);
      System.out.println(favoriteAnimal);
      String userInput2 = keyboard.nextLine();
      System.out.println(userInput2);
      System.out.println(favoriteFood);
      String userInput3 = keyboard.nextLine();
      System.out.println(userInput3);
      System.out.println(favoriteSong);
      String userInput4 = keyboard.nextLine();
      System.out.println(userInput4);
      String fullname = userInput + " " + userInput1;
      System.out.println("My name is " + fullname + ".");
      System.out.println("My favorite animal is the " + userInput2 + ".");
      System.out.println("My favorite food is " + userInput3 + ".");
      System.out.println("My favorite song is " + userInput4 + ".");
      
    //TODO prompt the user to get input for all of the String variables.

    //TODO print the output formatted to look like the expected output using String concatenation.

  }
}