public class isPalindrome {
    public static boolean checkPalindrome(String str) {
        int n=str.length();

      for (int i = 0; i < str.length() / 2; i++) {
        if(str.charAt(i)!=str.charAt(n-1-i)){
            System.out.println("Not a Palindrome");
            return false;

        }
    }
    return true;
    }
    public static void main(String args[]){
        String str="racecar";
        System.out.println("Is the string a Palindrome: " + checkPalindrome(str));

    }
}
