public class Hex {
   
    public static void main(String[] args) {

        // Check arg count
        if (args.length != 1) {
            System.err.println("Error: Please supply exactly one hexadecimal argument.");
            System.exit(1);
        }

        String hex = args[0].toLowerCase();

        // Validate the string manually
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            boolean isDigit = (c >= '0' && c <= '9');
            boolean isLetter = (c >= 'a' && c <= 'f');

            if (!isDigit && !isLetter) {
                System.err.println("Error: Not a valid hexadecimal number.");
                System.exit(1);
            }
        }
 
}
