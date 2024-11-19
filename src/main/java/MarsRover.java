public class MarsRover {

    public Direction direction;
    public Coordinate coordinate;

    public MarsRover(){
        this.coordinate = new Coordinate();
        this.direction = Direction.N;
    }

    public String showStatus() {
        return this.coordinate.X() + ":" + this.coordinate.Y() + ":" + this.direction;
    }

    public String executeCommand(String command) {
        if(command.equals("L")){
            if(direction.equals(Direction.N)){
                direction = Direction.W;
                return showStatus();
            }
            if(direction.equals(Direction.W)){
                direction = Direction.S;
                return showStatus();
            }
            if(direction.equals(Direction.S)){
                direction = Direction.E;
                return showStatus();
            }
            if(direction.equals(Direction.E)){
                direction = Direction.N;
                return showStatus();
            }
        }
        if(command.equals("R")){
            if(direction.equals(Direction.N)){
                direction = Direction.E;
                return showStatus();
            }
            if(direction.equals(Direction.E)){
                direction = Direction.S;
                return showStatus();
            }
            if(direction.equals(Direction.S)){
                direction = Direction.W;
                return showStatus();
            }
            if(direction.equals(Direction.W)){
                direction = Direction.N;
                return showStatus();
            }
        }
        if(command.equals("M")){
            coordinate.y = coordinate.Y() + 1;
        }
        return showStatus();
    }
}
