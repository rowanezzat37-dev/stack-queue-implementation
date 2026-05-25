import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int choice;
        URGENTtasks stack = new URGENTtasks();
        REGULARtasks queue = new REGULARtasks();

        System.out.println("=== TEST CASES ===");


        stack.addUrgentTask("Fix server crash");
        stack.addUrgentTask("Deploy hotfix");
        stack.addUrgentTask("Update SSL cert");


        queue.addRegularTask("Write docs");
        queue.addRegularTask("Code review");
        queue.addRegularTask("Team meeting");
        queue.addRegularTask("Update roadmap");


        stack.handleUrgentTask();


        queue.processRegularTask();
        queue.processRegularTask();


        stack.showAllUrgent();


        queue.showAllRegular();



        stack.handleUrgentTask();
        stack.handleUrgentTask();
        stack.handleUrgentTask();



        queue.processRegularTask();
        queue.processRegularTask();
        queue.processRegularTask();


        do { // menu and loops until entering 9
            System.out.println("\n=== MENU ===");
            System.out.println("[1] Add Urgent Task\n[2] Handle Urgent Task\n[3] Peek Urgent\n[4] Add Regular Task\n[5] Process Regular Task\n[6] Peek Regular\n[7] Show All Urgent\n[8] Show All Regular\n[9] Exit");
            System.out.print("Enter Your Choice: ");
            choice= input.nextInt();
          switch (choice){
              case 1:
                  System.out.println("Enter Task: ");
                  input.nextLine();
                  stack.addUrgentTask(input.nextLine());
                  break;
              case 2:
                  stack.handleUrgentTask();
                  break;
              case 3:
                  stack.peekNextUrgent();
                  break;
              case 4:
                  System.out.println("Enter Task: ");
                  input.nextLine();
                  queue.addRegularTask(input.nextLine());
                  break;
              case 5:
                  queue.processRegularTask();
                  break;
              case 6:
                  queue.peekNextRegular();
                  break;
              case 7:
                  stack.showAllUrgent();
                  break;
              case 8:
                  queue.showAllRegular();
                  break;
              case 9:
                  System.out.println("Exiting...");
                  break;
              default:
                  System.out.println("Invalid Input!!!");
                  break;
          }
        } while (choice!=9);
    }
}
