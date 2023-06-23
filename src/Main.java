import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String password = "";
        String characters = """
                a b c d e f g h i j k l m n o p q r s t u v w x y z
                A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
                0 1 2 3 4 5 6 7 8 9 ! @ # $ % & * ?
                """;
        String[] charForPass = characters.split(" ");

        System.out.print("Enter password length: ");
        int charLen = scanner.nextInt();

        for(int i = 0; i < charLen; i++){
            int randomIntForPass = random.nextInt(charForPass.length);
            password = password + charForPass[randomIntForPass];
        }

        System.out.println(password);
    }
}