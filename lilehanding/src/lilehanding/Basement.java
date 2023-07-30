package lilehanding;

public class Basement {
    private String basementDetails;

    public Basement(String basementDetails) {
        this.basementDetails = basementDetails;
    }

    public String getBasementDetails() {
        return basementDetails;
    }

    @Override
    public String toString() {
        return "Basement [Details: " + basementDetails + "]";
    }
}
