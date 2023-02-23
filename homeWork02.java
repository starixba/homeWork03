/*Create a class called CampusTime, an integer variable named time is given with a number between 1~24 has
been initialized, write a program that can find out if the campus is open or not.
 Campus is open from 8 am(8) to
11 pm (23) If user enters a time within the open time they should see message: “open”  but if the time entered is
outside of operating hours they should see: “ closed” */

package HomeWork03;

import java.util.Scanner;

public class homeWork02 {
  public static void main(String[] args) {
    int time;
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a number between 1-24");
    time = scan.nextInt();
    if (time >= 8 && time < 22) {
      System.out.println("Open");
    } else if (time > 1 || time < 7 || time == 23 || time == 24) {
      System.out.println("Close");
    } else {
      System.out.println("Please re-enter the number");
    }
  }
}
