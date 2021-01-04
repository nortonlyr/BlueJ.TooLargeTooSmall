
/**
 * Write a description of class TooLargeTooSmall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TooLargeTooSmall
{
    // instance variables - replace the example below with your own
    private integer chosenNum;

    /**
     * Constructor for objects of class TooLargeTooSmall
     */
    public TooLargeTooSmall(Integer seed)
    {
        // initialise instance variables
        chosenNum = seed;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Integer guess(Integer g)
    {
        if (chosenNum == g){
        return 0;
    } else if (chosenNum > g){
        return -1;
    } else if (chosenNum < g){
        return 1;
    }
        return chosenNum;
    }
}
