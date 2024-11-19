public class MarsRover {

    public Direction direction;
    public Coordinate coordinate;
    public Orientation orientation;

    public MarsRover(){
        this.coordinate = new Coordinate();
        this.direction = Direction.N;
        this.orientation = new NorthOriented();
    }

    public String showStatus() {
        return this.coordinate.X() + ":" + this.coordinate.Y() + ":" + this.direction;
    }

    public String executeCommand(String command) {
        if(command.equals("L")){
            orientation = orientation.turnLeft();
            direction = orientation.getDirection();
            return showStatus();
        }
        if(command.equals("R")){
            orientation = orientation.turnRight();
            direction = orientation.getDirection();
            return showStatus();
        }
        if(command.equals("M")){
            coordinate = orientation.moveForward(coordinate);
            return showStatus();
        }
        return showStatus();
    }
}
