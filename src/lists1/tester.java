package lists1;

import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        container list = new container();
        Scanner scanner = new Scanner(System.in);
        while (true){
            boolean shouldBreak = false;
            System.out.println("What to do?\n" +
                    "1. List\n" +
                    "2. Remove\n" +
                    "3. Add\n" +
                    "4. Clear\n" +
                    "5. Exit");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println(list.listAll());
                    break;
                case 2:
                    System.out.println("Choose: ");
                    System.out.println(list.listAll());
                    int choice2 = Integer.parseInt(scanner.nextLine());
                    list.remove(choice2);
                    System.out.println("Done");
                    break;
                case 3:
                    System.out.println("First name: ");
                    String firstname = scanner.nextLine();
                    System.out.println("Last name: ");
                    String lasttname = scanner.nextLine();
                    System.out.println("Age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.println("Class: ");
                    int level = Integer.parseInt(scanner.nextLine());
                    list.add(new student(age, level, firstname, lasttname));
                    System.out.println("Done");
                    break;
                case 4:
                    list.clear();
                    System.out.println("Done");
                    break;
                case 5:
                    shouldBreak = true;
                    System.out.println("goodbye");
                    break;
                default:
                    System.out.println("wrong command");
                    break;
            }
            if (shouldBreak){
                break;
            }
        }

    }
}
