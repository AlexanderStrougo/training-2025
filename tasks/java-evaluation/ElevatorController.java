public class ElevatorController {
    private int minFloor;
    private int maxFloor;
    private Elevator elevator;

    public ElevatorController(Elevator elevator, int minFloor, int maxFloor) {
        this.elevator = elevator;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void goToFloor(int newFloor) {
        // check if invalid floor
        if (newFloor < minFloor || newFloor > maxFloor) {
            System.out.println("Floor " + newFloor + " is not a valid floor");
            return;
        } 
        
        if (newFloor > elevator.getCurrentFloor()) {
            while (newFloor > elevator.getCurrentFloor()) {
                elevator.moveUp();
                System.out.println("Moving up... now at floor " + elevator.getCurrentFloor());
            }
        } else {
            while (newFloor < elevator.getCurrentFloor()) {
                elevator.moveDown();
                System.out.println("Moving down... now at floor " + elevator.getCurrentFloor());
            }
        }
        System.out.println("Arrived at floor " + elevator.getCurrentFloor());
    }
}
