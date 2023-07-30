package lilehanding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lift {
    private String liftId;
    private boolean isMoving;
    private int currentFloor;

    public Lift(String liftId) {
        this.liftId = liftId;
        this.isMoving = false;
        this.currentFloor = 1; // Assume the lift starts at the first floor
    }

    public void callLift(int destinationFloor) {
        System.out.println("Lift " + liftId + " is called to floor " + destinationFloor);

        boolean overWeight = Math.random() < 0.2; // 20% chance of being overweight
        boolean malfunctioning = Math.random() < 0.1; // 10% chance of malfunctioning
        boolean electricityIsLost = Math.random() < 0.05; // 5% chance of electricity loss

        if (malfunctioning) {
            System.out.println("Sorry, Lift " + liftId + " is currently malfunctioning. Please use another lift.");
            return;
        }

        if (overWeight) {
            System.out.println("Warning: Lift " + liftId + " is currently overloaded. Please reduce the weight.");
        }

        if (electricityIsLost) {
            System.out.println("Sorry, Lift " + liftId + " is currently not operational due to electricity loss.");
            return;
        }

        if (!isMoving) {
            moveLift(destinationFloor);
        }
    }

    private void moveLift(int destinationFloor) {
        isMoving = true;
        System.out.println("Lift " + liftId + " is moving from floor " + currentFloor + " to floor " + destinationFloor);
        try {
            // Simulate lift movement time (e.g., 1 second per floor)
            Thread.sleep(Math.abs(destinationFloor - currentFloor) * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        currentFloor = destinationFloor;
        isMoving = false;
        System.out.println("Lift " + liftId + " has reached floor " + currentFloor);
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(6);

        Lift lift1 = new Lift("Lift 1");
        Lift lift2 = new Lift("Lift 2");
        Lift lift3 = new Lift("Lift 3");
        Lift lift4 = new Lift("Lift 4");
        Lift lift5 = new Lift("Lift 5");
        Lift lift6 = new Lift("Lift 6");

        int destinationFloor = 5; // Example destination floor

        // Call 6 lifts to the same destination floor using multithreading
        executorService.submit(() -> lift1.callLift(destinationFloor));
        executorService.submit(() -> lift2.callLift(destinationFloor));
        executorService.submit(() -> lift3.callLift(destinationFloor));
        executorService.submit(() -> lift4.callLift(destinationFloor));
        executorService.submit(() -> lift5.callLift(destinationFloor));
        executorService.submit(() -> lift6.callLift(destinationFloor));

        executorService.shutdown();
    }
}
