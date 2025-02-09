import java.util.Scanner;
public class days_to_years_months_days {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter days!");
        int days=sc.nextInt();
        int year = days/365;
        int month= (days-year*365)/30;
        int day= (days-year*365-month*30);
        System.out.printf("%d years, %d months, and %d days",year,month,day);


    }
}
