public class Elevator {
    private int currFloor;

    public Elevator(int initFloor) {
        this.currFloor = initFloor;
        System.out.println("Elevator instantiated at floor " + this.currFloor);
    }
    
    public int getCurrentFloor() {
        return this.currFloor;
    }
 
    public void moveUp() {
        currFloor += 1;
    }

    public void moveDown() {
        currFloor -= 1;
    }
}
