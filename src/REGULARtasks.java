public class REGULARtasks {
    Node front = null;
    Node rear = null;
    void addRegularTask(String task){
        if (isRegularEmpty()){ // adding node at first
            Node newnode = new Node(task);
            front = newnode;
            rear = newnode;
            System.out.println("[+] Regular task added: "+task);
        } else { // adding node in queue
            Node newnode = new Node(task);
            rear.next = newnode;
            rear = newnode;
            System.out.println("[+] Regular task added: "+task);
        }
    }
    public void processRegularTask(){
        if (isRegularEmpty()){ // checks if queue is empty
            System.out.println("[!] No regular tasks!");
        } else {
            System.out.println("[✔] Processing: " + front.taskName); // pop node
           front=front.next;
           if (front == null){
               rear = null;
           }
        }
    }
    public void peekNextRegular(){
        if (isRegularEmpty()){ // checks if queue is empty
            System.out.println("[!] No regular tasks!");
        } else {
            System.out.println("Regular Task: " + front.taskName); // first node in queue
        }
    }
    public void showAllRegular(){
        if (isRegularEmpty()){ // checks if queue is empty
            System.out.println("[!] No regular tasks!");
        }else {
            Node temp = front;
            while (temp!= null){ // traverse and print data of node
                System.out.println(temp.taskName);
                temp = temp.next;
            }
            System.out.println();
        }

    }
    boolean isRegularEmpty(){ // checks if queue is empty
        return front == null;
    }
}
class Node{
    String taskName;
    Node next;
    public Node(String taskName){ // creating node
        this.taskName=taskName;
    }
}