/**
 * Name: Zane Yankalunas
 * 
 */
public class StonePile 
{
    private static int numberOfStones;
    private final static int DEFAULT_NUMBER_OF_STONES = 3;

    /** Default constructer */
    public StonePile()
    {
        this(DEFAULT_NUMBER_OF_STONES);
    }
    
    /** Constructer */
    public StonePile(int n)
    {
        numberOfStones = n;
    }

    public static int getNumberOfStones() {
        return numberOfStones;
    }

    public static void setNumberOfStones(int numberOfStones) {
        StonePile.numberOfStones = numberOfStones;
    }

    public boolean removeStones(int r)
    {
        if (numberOfStones - r < 0) {
            return false;
        } else if (numberOfStones - r == 0) {
            numberOfStones -= r;
            return true;
        } else {
            numberOfStones -= r;
            return true;
        }
    }
}
