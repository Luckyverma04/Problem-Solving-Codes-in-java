public class ReverseString {
    public static void main(String[] args) {
        String sentence = "Java is very interesting";
        
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Reverse the words
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
