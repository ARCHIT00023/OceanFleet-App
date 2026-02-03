import java.util.ArrayList;
import java.util.List;

/**
 * UC-1: Create Vessel Model
 * UC-2: Store Vessel Records Using List
 * UC-3: Retrieve Vessel by Vessel ID
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

        public Vessel() {
        }

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
       UC-2 & UC-3: VesselUtil
       ======================= */
    static class VesselUtil {

        private List<Vessel> vesselList = new ArrayList<>();

        // UC-2: Add vessel
        public void addVesselPerformance(Vessel vessel) {
            vesselList.add(vessel);
        }

        // UC-3: Retrieve vessel by ID (case-sensitive)
        public Vessel getVesselById(String ves
