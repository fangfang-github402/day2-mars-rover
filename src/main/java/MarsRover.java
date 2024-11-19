public class MarsRover {

    public Direction direction;

    public MarsRover(){
        this.direction = Direction.N;
    }

    public String showStatus() {
        return "0:0:" + this.direction;
    }

    public String executeCommand(String command) {
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
        return showStatus();
    }
}
