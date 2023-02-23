package HomeWork03;
import java.util.Scanner;
public class homeWork01 {
public static void main(String[] args) {
  int hourlyRate;
  int weeklyHours;
  double stateTaxRate;
  double federalTaxRate;
  Scanner scan = new Scanner(System.in);
System.out.println("Please enter hourly rate ?");
 hourlyRate = scan.nextInt();
System.out.println("Please enter weekly hours ?");
weeklyHours = scan.nextInt();
System.out.println("Please enter state tax rate ?");
stateTaxRate = scan.nextDouble();
System.out.println("please enter federal tax rate ?");
federalTaxRate = scan.nextDouble();
  double salaryBeforeTax = hourlyRate * weeklyHours * 52;
  double stateTax = salaryBeforeTax * stateTaxRate / 100;
  double federalTax = salaryBeforeTax * federalTaxRate /100;
  double totalTax = stateTax + federalTax;
  double salaryAferTax = salaryBeforeTax - totalTax;

System.out.println("Gross pay is: " + salaryBeforeTax);
System.out.println("Federal tax is: " + federalTax);
System.out.println("State tax is: " + stateTax);
System.out.println("Total tax is: " + totalTax);
System.out.println("Net income is: " + salaryAferTax);
}
}

  