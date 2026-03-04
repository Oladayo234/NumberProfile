import numberProfile.NumberProfile;
import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int userInput = input.nextInt();
    NumberProfile.getProfileOfNumber(userInput);
}

