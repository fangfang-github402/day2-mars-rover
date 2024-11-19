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

    public String executeCommand(String commands) {
        commands.chars()
                .mapToObj(c -> (char) c)
                .forEach(command -> {
                    if(command.equals('L')) {
                        orientation = orientation.turnLeft();
                        direction = orientation.getDirection();
                    }
                    if(command.equals('R')) {
                        orientation = orientation.turnRight();
                        direction = orientation.getDirection();
                    }
                    if(command.equals('M')) {
                        coordinate = orientation.moveForward(coordinate);
                    }
                    if(command.equals('B')) {
                        coordinate = orientation.moveBackward(coordinate);
                    }
                });
        return showStatus();
    }
}
