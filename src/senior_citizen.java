import java.util.Scanner;
public class senior_citizen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter our age!");
        int age = sc.nextInt();
        if (age >= 0 && age <= 12) {
            System.out.println("Child");
        } else if (age > 12 && age <= 19) {
            System.out.println("Teenager");
        } else if (age > 19 && age <= 64) {
            System.out.println("Adult");
        } else if (age > 64) {
            System.out.println("Senior Citizen");
        }
    }
}
