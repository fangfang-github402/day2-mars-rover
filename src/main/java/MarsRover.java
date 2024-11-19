import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

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
        Map<Character, Consumer<Void>> commandActions = new HashMap<>();
        commandActions.put('L', v -> {
            orientation = orientation.turnLeft();
            direction = orientation.getDirection();
        });
        commandActions.put('R', v -> {
            orientation = orientation.turnRight();
            direction = orientation.getDirection();
        });
        commandActions.put('M', v -> coordinate = orientation.moveForward(coordinate));
        commandActions.put('B', v -> coordinate = orientation.moveBackward(coordinate));
        commands.chars()
                .mapToObj(c -> (char) c)
                .forEach(command -> {
                    Consumer<Void> action = commandActions.get(command);
                    if (action != null) {
                        action.accept(null);
                    } else {
                        throw new IllegalArgumentException("Invalid command: " + command);
                    }
                });
        return showStatus();
    }
}
