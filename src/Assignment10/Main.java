import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SList<Integer> list = new SList<>();
        SListIterator iterator = new SListIterator();

        Scanner scanner = new Scanner(System.in);
        int value;

        do{
            System.out.println("Enter: ");
            System.out.print("1. Insert\n" + "2. Remove\n" + "3. Display\n" + "4. Exit\n");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter value: ");
                    value =scanner.nextInt();
                    iterator.add(new SList(value));
                    break;
                case 2:
                    System.out.println("Enter value to be Removed");
                    value= scanner.nextInt();
                    iterator.remove(new SList(value));
                    break;
                case 3:
                        iterator.display();
                        break;
                case 4:System.exit(0);
                default:
                    System.out.println("You have entered wrong option");
                    break;
            }
        }while(true);
    }
}
