import java.util.ArrayList;
import java.util.List;

/**
 * UC-1 & UC-2 Implementation
 * UC-1: Create Vessel Model
 * UC-2: Store Vessel Records Using List
 */
public class Application {

    /* =======================
       UC-1: Vessel Model
       ======================= */
    static class Vessel {

        private String vesselId;
        private String vesselName;
        private double averageSpeed;
        private String vesselType;

        // No-argument constructor
        public Vessel() {
        }

        // Parameterized constructor
        public Vessel(String vesselId, String vesselName, double averageSpeed, String vesselType) {
            this.vesselId = vesselId;
            this.vesselName = vesselName;
            this.averageSpeed = averageSpeed;
            this.vesselType = vesselType;
        }

        public String getVesselId() {
            return vesselId;
        }

        public void setVesselId(String vesselId) {
            this.vesselId = vesselId;
        }

        public String getVesselName() {
            return vesselName;
        }

        public void setVesselName(String vesselName) {
            this.vesselName = vesselName;
        }

        public double getAverageSpeed() {
            return averageSpeed;
        }

        public void setAverageSpeed(double averageSpeed) {
            this.averageSpeed = averageSpeed;
        }

        public String getVesselType() {
            return vesselType;
        }

        public void setVesselType(String vesselType) {
            this.vesselType = vesselType;
        }
    }

    /* =======================
       UC-2: VesselUtil Class
       ======================= */
    static class VesselUtil {

        // List to store vessel records
        private List<Vessel> vesselList = new ArrayList<>();

        // Add vessel to the list
        public void addVesselPerformance(Vessel vessel) {
            vesselList.add(vessel);
        }

        // Display all vessels (for verification)
        public void displayVessels() {
            for (Vessel vessel : vesselList) {
                System.out.println(
                        vessel.getVesselId() + " | " +
                        vessel.getVesselName() + " | " +
                        vessel.getAverageSpeed() + " | " +
                        vessel.getVesselType()
                );
            }
        }
    }

    /* =======================
       Main Method (User Flow)
       ======================= */
    public static void main(String[] args) {

        VesselUtil vesselUtil = new VesselUtil();

        // User enters vessel details
        Vessel v1 = new Vessel("V001", "Ocean Explorer", 28.5, "Cargo");
        Vessel v2 = new Vessel("V002", "Sea Guardian", 32.0, "Defense");

        // Store vessel records
        vesselUtil.addVesselPerformance(v1);
        vesselUtil.addVesselPerformance(v2);

        // Display stored vessels
        System.out.println("Stored Vessel Records:");
        vesselUtil.displayVessels();
    }
}
