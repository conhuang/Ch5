
/**
 * Write a description of class TaskTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TaskTest
{
    public static void main(String[] args){
        Task[] tasks = new Task[5];
        tasks [0] = new Task("Eat");
        tasks [1] = new Task("Sleep");
        tasks [2] = new Task("Finish APCS programs");
        tasks [3] = new Task("Exercise");
        tasks [4] = new Task("Watch TV");
        
        tasks[0].setPriority(4);
        tasks[1].setPriority(Priority.MAX_PRIORITY);
        tasks[2].setPriority(2);
        tasks[3].setPriority(Priority.MED_PRIORITY);
        tasks[4].setPriority(Priority.MIN_PRIORITY);
        
        for(Task a: tasks){
            System.out.println(a);
        }
    }
}
