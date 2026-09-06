package Projects;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Menu {
    public void customer(String name) {
        System.out.println(name + " is Succesfully Added!!");
    }
}

//This is a basic Help Desk System that uses Queue.

public class helpdesk {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Queue<String> queue = new LinkedList<String>();
        Menu selection = new Menu();

        boolean running = true;

        while(running) {
            System.out.println("==== Help Desk System ====");

            System.out.println("1. Add Customer");
            System.out.println("2. Show Customers");
            System.out.println("3. Remove Customer");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scn.nextInt();

            scn.nextLine();

            if(choice == 1) {
                System.out.print("Enter Name: ");
                String name = scn.nextLine();
                selection.customer(name);

                queue.offer(name);
            } else if(choice == 2) {
                System.out.println(queue);
            }else if(choice == 3){
                queue.poll();
            }else if(choice == 4) {
                running = false;
            }
        }
    }
}
