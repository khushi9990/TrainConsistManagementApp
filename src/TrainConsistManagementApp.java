import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("================================\n");

        Set<String> bogieIDs = new HashSet<>();

        bogieIDs.add("BG104");
        bogieIDs.add("BG103");
        bogieIDs.add("BG102");
        bogieIDs.add("BG101");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIDs + "\n");

        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.\n");

        System.out.println("UC3 uniqueness validation completed...");
    }
}