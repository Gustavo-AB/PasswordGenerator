import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String charForPass = "";
        String password = "";

        int i;
        String[] lowerCaseLetters = {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        };
        String[] upperCaseLetters = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        String[] numbers = {
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
        };
        String[] specialChars = {
                "!", "@", "#", "$", "%", "&", "*", "?"
        };

        System.out.print("Number of lowercase letters: ");
        int numberLowercaseLetters = scanner.nextInt();

        System.out.print("Number of uppercase letters: ");
        int numberUppercaseLetters = scanner.nextInt();

        System.out.print("Amount of numbers: ");
        int amountNumbers = scanner.nextInt();

        System.out.print("Number of special characters: ");
        int numberSpecialChars = scanner.nextInt();

        for(i = 0; i < numberLowercaseLetters; i++){
            charForPass = charForPass.concat(lowerCaseLetters[random.nextInt(lowerCaseLetters.length)]);
            charForPass = charForPass.concat(",");
        }

        for(i = 0; i < numberUppercaseLetters; i++){
            charForPass = charForPass.concat(upperCaseLetters[random.nextInt(upperCaseLetters.length)]);
            charForPass = charForPass.concat(",");
        }

        for(i = 0; i < amountNumbers; i++){
            charForPass =  charForPass.concat(numbers[random.nextInt(numbers.length)]);
            charForPass = charForPass.concat(",");
        }

        for(i = 0; i < numberSpecialChars; i++){
            charForPass = charForPass.concat(specialChars[random.nextInt(specialChars.length)]);
            charForPass = charForPass.concat(",");
        }

        String[] passwordChars;
        passwordChars = charForPass.split(",");

        i = 0;
        int randomIndex;
        while(true){
            if(i == passwordChars.length) {
                break;
            }

            randomIndex = random.nextInt(passwordChars.length);

            if(passwordChars[randomIndex] != null){
                password = password.concat(passwordChars[randomIndex]);
                passwordChars[randomIndex] = null;
                i++;
            }
        }

        System.out.println(password);
    }
}