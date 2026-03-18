import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("UC6 - Map Bogie to Capacity");
        System.out.println("================================\n");

        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 54);

        System.out.println("Bogie Capacities:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " seats");
        }

        System.out.println("\nUC6 bogie capacity mapping completed...");
    }
}
