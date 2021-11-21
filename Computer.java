public class Computer 
{
    private static boolean isAComputer;
    private static int difficulty;
    private final static int DEFAULT_DIFFICULTY = 0;
    
    public Computer() {
        this(DEFAULT_DIFFICULTY);
    }

    public Computer(int level) {
        isAComputer = false;
        difficulty = level;
    }

    public static void setAComputer(boolean isAComputer) {
        Computer.isAComputer = isAComputer;
    }

    public static void setDifficulty(int difficulty) {
        Computer.difficulty = difficulty;
    }

    public static int getDifficulty() {
        return difficulty;
    }

    public static boolean getIsAComputer() {
        return isAComputer;
    }
}
