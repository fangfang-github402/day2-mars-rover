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
            if(direction.equals(Direction.N)){
                coordinate.y = coordinate.Y() + 1;
            }
            if(direction.equals(Direction.W)){
                coordinate.x = coordinate.X() - 1;
            }
            if(direction.equals(Direction.S)){
                coordinate.y = coordinate.Y() - 1;
            }
            if(direction.equals(Direction.E)){
                coordinate.x = coordinate.X() + 1;
            }
        }
        return showStatus();
    }
}
