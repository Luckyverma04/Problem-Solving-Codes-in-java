import java.util.*;

public class BookShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Predefined books in multidimensional ArrayList
        ArrayList<ArrayList<String>> books = new ArrayList<>();

        books.add(new ArrayList<>(Arrays.asList("Java Programming", "James Gosling", "500", "Oracle", "10")));
        books.add(new ArrayList<>(Arrays.asList("C++ Primer", "Bjarne Stroustrup", "600", "Pearson", "5")));
        books.add(new ArrayList<>(Arrays.asList("Python Basics", "Guido van Rossum", "450", "O'Reilly", "7")));
        books.add(new ArrayList<>(Arrays.asList("Data Structures", "Mark Allen", "400", "McGraw Hill", "3")));

        // Input to search
        System.out.print("Enter Book Title to Search: ");
        String searchTitle = sc.nextLine();
        System.out.print("Enter Author Name to Search: ");
        String searchAuthor = sc.nextLine();

        boolean found = false;

        for (ArrayList<String> book : books) {
            if (book.get(0).equalsIgnoreCase(searchTitle) && book.get(1).equalsIgnoreCase(searchAuthor)) {
                found = true;

                System.out.println("\n✅ Book Found:");
                System.out.println("Title: " + book.get(0));
                System.out.println("Author: " + book.get(1));
                System.out.println("Price: ₹" + book.get(2));
                System.out.println("Publisher: " + book.get(3));
                System.out.println("Stock Available: " + book.get(4));

                System.out.print("Enter number of copies required: ");
                int copies = sc.nextInt();
                int stock = Integer.parseInt(book.get(4));
                float price = Float.parseFloat(book.get(2));

                if (copies <= stock) {
                    float total = copies * price;
                    System.out.println("💰 Total cost: ₹" + total);
                    // Update stock after sale (optional)
                    book.set(4, String.valueOf(stock - copies));
                } else {
                    System.out.println("❌ Required copies not in stock.");
                }
                break;
            }
        }

        if (!found) {
            System.out.println("❌ Book not available in the system.");
        }

        sc.close();
    }
}
