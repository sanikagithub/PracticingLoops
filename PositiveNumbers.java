import java.util.Scanner;
public class PositiveNumbers {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

while (true) {
    System.out.println("Enter a number:");
    int number = Integer.valueOf(scanner.nextLine());
    if (number == 0) {
        break;
    }
    if (number < 0) {
        System.out.println("Number must be positive!");
        continue;
    }
    System.out.println("Your number was " + number);
    break;
            }
System.out.println("Process finished with exit code 0");

scanner.close();
}
} 