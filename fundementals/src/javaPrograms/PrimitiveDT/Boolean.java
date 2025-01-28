package fundementals.src.javaPrograms.PrimitiveDT;
public class Boolean {
    public static void main(String[] args) {
        boolean Sunny = true;
        boolean Weekend = false;

        // AND operator (&&)
        if (Sunny && Weekend) {
            System.out.println("It's sunny, and it's the weekend! Let's go to the beach!");
        } else {
            System.out.println("Either it's not sunny, or it's not the weekend.");
        }

        // OR operator (||)
        if (Sunny || Weekend) {
            System.out.println("At least one of the conditions is true.");
        }

        // NOT operator (!)
        if (!Weekend) {
            System.out.println("It's a weekday, time to work.");
        }
    }
}
