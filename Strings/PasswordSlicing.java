package Strings;

import java.util.Scanner;

public class PasswordSlicing {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String password = "Password", userPass;
    int size1 = password.length();
    System.out.print("Please type in the password >>: ");
    userPass = input.nextLine();
    input.close();
    int size2 = userPass.length();
    if (size1 == size2) {
      if (
        (password.charAt(0) == userPass.charAt(0)) &&
        (password.charAt(size2 - 1) == userPass.charAt(size1 - 1))
      ) {
        System.out.println("The passwords are correct!");
      } else {
        System.out.println("The first and last characters are different.");
      }
    } else {
      System.out.println("Incorrect password!");
    }
  }
}
