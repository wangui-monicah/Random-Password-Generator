import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in); //creation of a scanner

        System.out.println("How many characters do you want your password to have? ");
        int lengthPass = input.nextInt();

        String lowerCase = "qwertyuiopasdfghjklzxcvbnm";
        String upperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String symbols = "!@#%$^&*";

        String password = "";

        for(int i = 0; i<lengthPass; i++){
            int rand = (int)(4 * Math.random());

            switch (rand) {
                case 0:
                    password += String.valueOf((int) (10 * Math.random()));
                    break;

                case 1:
                    rand = (int)(lowerCase.length() * Math.random());
                    password += String.valueOf(lowerCase.charAt(rand));
                    break;

                case 2:
                    rand = (int)(upperCase.length() * Math.random());
                    password += String.valueOf(upperCase.charAt(rand));
                    break;

                case 3:
                    rand = (int)(symbols.length() * Math.random());
                    password += String.valueOf(symbols.charAt(rand));

            }



        }

        System.out.println("Your randomly generated password is: ");
        System.out.print(password);


    }
}