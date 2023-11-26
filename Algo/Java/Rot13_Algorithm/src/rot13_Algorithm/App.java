package rot13_Algorithm;
import java.util.Scanner;

public class App {

	public static String rot13(String value) {

        char[] values = value.toCharArray();
        for (int i = 0; i < values.length; i++) {
            char letter = values[i];

            if (letter >= 'a' && letter <= 'z') {
                // Rotate lowercase letters.

                if (letter > 'm') {
                    letter -= 13;
                } else {
                    letter += 13;
                }
            } else if (letter >= 'A' && letter <= 'Z') {
                // Rotate uppercase letters.

                if (letter > 'M') {
                    letter -= 13;
                } else {
                    letter += 13;
                }
            }
            values[i] = letter;
        }
        // Convert array to a new String.
        return new String(values);
    }

    public static void main(String[] args) {

        // Rotate the input string.
        // ... Then rotate the rotated string.
    	
    	Scanner userPasswd = new Scanner(System.in);
    	String input;
    	System.out.println("Saisir un mot de passe : ");
    	input = userPasswd.nextLine();
    	userPasswd.close();
    	
        //String input = "Do you have any cat pictures?";
    	
        String rot13 = rot13(input);
        //String roundTrip = rot13(rot13);

        //System.out.println(input);
        System.out.println("Votre mot de passe codé est : " + rot13);
        //System.out.println("Votre mot de passe décodé est : " + roundTrip);
    }

}
