import java.util.Scanner;
import java.util.ArrayList;

public class Duke {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> store = new ArrayList<>();

        System.out.println("Hello! I'm meimei ^_^\nI could scream at you all day!");
        String command = sc.nextLine();

        while(!command.equals("bye")) {
            if (command.equals("list")) {
                System.out.println("Here are the tasks in your list: ");
                for (int i = 0; i < store.size(); i++) {
                    System.out.println((i+1) + "." + store.get(i).toString());
                }
            }
            //adding of task
            else {
                store.add(command);
                System.out.println("added: " + command);
            }
            command = sc.nextLine();
        }

        System.out.println("Bye. Meimei will miss you!");
    }
}

