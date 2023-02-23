package HomeWork03;

import java.util.Scanner;

public class homeWork04 {

  int highest;
  int medium;
  int low;
  int lowest;
  char isMarried;
  Scanner scan = new Scanner(System.in);

  public void getSalary() {
    System.out.println("Please enter your salary: ");
    int x = scan.nextInt();
    if (x >= 130000) {
      highest = (35 * x) / 100;
      System.out.println("Your salary after tax is " + highest);
    } else if (x == 100000 && x <= 129999) {
      medium = (30 * x) / 100;
      System.out.println("Your salary after tax is " + medium);
    } else if (x == 80000 && x <= 99999) {
      low = (25 * x) / 100;
      System.out.println("Your salary after tax is " + low);
    } else if (x <= 79999) {
      lowest = (20 * x) / 100;
      System.out.println("Your salary after tax is " + lowest);
    }
    System.out.println("Are you married (y/n)?");
    char married = scan.next().charAt(0);
    switch (married) {
      case 'y':
        highest = (30 * x) / 100;
        System.out.println("Your salary after tax and married is " + highest);
        medium = (25 * x) / 100;
        System.out.println("Your salary after tax is " + medium);
        low = (20 * x) / 100;
        System.out.println("Your salary after tax is " + low);
        lowest = (15 * x) / 100;
        System.out.println("Your salary after tax is " + lowest);
        break;
    }
  }

  public static void main(String[] args) {
    homeWork04 display = new HomeWork03.homeWork04();
    display.getSalary();
  }

}
