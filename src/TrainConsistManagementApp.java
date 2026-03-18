import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("================================\n");

        LinkedList<String> consist = new LinkedList<>();

        // Add bogies
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(consist + "\n");

        // Insert Pantry Car at position 2 (0-based index)
        consist.add(2, "Pantry Car");

        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(consist + "\n");

        // Remove first and last bogie
        consist.removeFirst();
        consist.removeLast();

        System.out.println("After Removing First and Last Bogie:");
        System.out.println(consist + "\n");

        System.out.println("UC4 ordered consist operations completed...");
    }
}