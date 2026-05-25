public class URGENTtasks {
    private String tasks[];
    private int top=-1;
    URGENTtasks(){ // creating the array
        tasks=new String[20];
    }
    public boolean isUrgentEmpty(){ // checks if the array is empty
        return top==-1;
    }
    public boolean isUrgentFull(){ // checks if the array is full
        return top ==tasks.length-1;
    }
    public void addUrgentTask(String task){
        if (isUrgentFull()){ // checks if the array is full
            System.out.println("Stack Full");
        }else { // adding task to array
            top++;
            tasks[top]=task;
            System.out.println("[+] Urgent task added: "+task);
        }
    }
    public void handleUrgentTask(){
        if (isUrgentEmpty()){ // checks if the array is empty
            System.out.println("[!] No urgent tasks!");
        } else { // handling top task
            System.out.println("[✔] Handling: " + tasks[top]);
            top--;
        }
    }
    public void peekNextUrgent(){
        if (isUrgentEmpty()){ // checks if the array is empty
            System.out.println("[!] No urgent tasks!");
        } else { // print top task
            System.out.println("Urgent Task: "+tasks[top]);
        }
    }
    public void showAllUrgent(){
        if (isUrgentEmpty()){ // checks if the array is empty
            System.out.println("[!] No urgent tasks!");
        } else { // prints all tasks
            for (int i = top; i >=0 ; i--) {
                System.out.println(tasks[i]);
            }
            System.out.println();
        }
    }

}
