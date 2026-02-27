
    public class uc4 {
        public static void main(String[] args) {
            String input = "LEVEL";

            char[] characters = input.toCharArray();
            int start = 0;
            int end = characters.length - 1;
            boolean isPalindrome = true;

            while (start < end) {
                if (characters[start] != characters[end]) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }

            System.out.println("Input String : " + input);

            if (isPalindrome) {
                System.out.println("Result : The string is a Palindrome");
            } else {
                System.out.println("Result : The string is NOT a Palindrome");
            }
        }
    }