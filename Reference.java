public class Reference {
    public static void update(int marks[],int nonchangeable) {
        nonchangeable=10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 5;
        }
    }

    public static void main(String args[]) {
        int marks[] = {12, 23, 34};
        int nonchangeable = 5; // This variable is not used in the update method
        update(marks,nonchangeable);
        System.out.println(nonchangeable);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}
