
/**
 * Write a description of class Priority here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Priority
{
    static final int MIN_PRIORITY = 1;
    static final int MED_PRIORITY = 5;
    static final int MAX_PRIORITY = 10;
    public abstract void setPriority(int p);
    
    public abstract int getPriority();
}
