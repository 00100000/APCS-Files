public class ValidPassword {
    public static void main(String[] args) {
        System.out.println(isValidPassword("ABCdef012!@#")); // true
        System.out.println(isValidPassword("L33Th4x0rS*()")); // true
        System.out.println(isValidPassword("My code is spaghetti")); // false
        System.out.println(isValidPassword("JavaScript > Java")); // false
    }

    public static boolean isValidPassword(String password) {
        if (password.length() > 6) {
            if (password.length() < 16) {
                // uppercase letters
                int uppercaseCount = 0;
                for (int i = 0; i < password.length(); i++) {
                    if (password.charAt(i) <= 90 && password.charAt(i) >= 65) {
                        uppercaseCount++;
                    }
                }
                // uppercase letters
                if (uppercaseCount >= 3) {
                    // lowercase letters
                    int lowercaseCount = 0;
                    for (int i = 0; i < password.length(); i++) {
                        if (password.charAt(i) <= 122 && password.charAt(i) >= 97) {
                            lowercaseCount++;
                        }
                    }
                    // lowercase letters
                    if (lowercaseCount >= 3) {
                        // numbers
                        int numCount = 0;
                        for (int i = 0; i < password.length(); i++) {
                            if (password.charAt(i) <= 57 && password.charAt(i) >= 48) {
                                numCount++;
                            }
                        }
                        // numbers
                        if (password.length() - (uppercaseCount + lowercaseCount + numCount) >= 3) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
