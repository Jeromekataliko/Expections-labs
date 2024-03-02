import java.util.Scanner;

public class BadSubscriptCaught {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Henry", "Ivy", "Jack"};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an index to display the name: ");
            int index = scanner.nextInt();
            System.out.println("Name at position " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of range.");
        }
    }
}
