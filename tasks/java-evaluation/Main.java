import java.lang.System;

public class Main {
    public static void main(String[] args) {
        // Instantiate elevator
        Elevator elevator = new Elevator(1);

        // Instantiate elevator controller
        ElevatorController controller = new ElevatorController(elevator, 1, 5);
        
        int requestedFloor;

        // Request floor 3
        requestedFloor = 3;
        System.out.println("Request floor: " + requestedFloor);
        controller.goToFloor(requestedFloor);

        // Request floor 8
        requestedFloor = 8;
        System.out.println("Request floor: " + requestedFloor);
        controller.goToFloor(requestedFloor);

        // Request floor 3
        requestedFloor = 1;
        System.out.println("Request floor: " + requestedFloor);
        controller.goToFloor(requestedFloor);

        // quit
        System.out.println("Request floor: quit");
    }
    
}
