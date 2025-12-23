
//implement utility methods like ValidatInput( String input) to check user input for errors.

public class ValidateInput {

    public static boolean validateInput(String input) {

        // check null
        if (input == null) {
            return false;
        }

        // check empty or only spaces
        if (input.trim().isEmpty()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String userInput = "deewan"; // fixed variable name

        if (validateInput(userInput)) {
            System.out.println("Valid input");
        } else {
            System.out.println("Invalid input");
        }
    }
}


