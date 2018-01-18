
/**
 * Write a description of class Task here.
 * 
 * @author Connie Huang
 * @version 1/16/2018
 */
public class Task implements Priority
{
   private int priority;
   private String name = "";
   public Task(String n){
       name = n;
   }
   /**
    * @return name of task
    */
   public String getName(){
       return name;
   }
   public void setPriority(int p){
       priority = p;
   }
   public int getPriority(){
       return priority;
   }
   public String toString(){
       return "Name: " + name + "  Priority: " + priority;
    }
}
