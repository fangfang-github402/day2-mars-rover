public class MarsRover {
    private String direction = "N";

    public String showStatus() {
        return "0:0:" + this.direction;
    }

    public String executeCommand(String command) {
        if(direction == "N"){
            direction = "W";
            return "0:0:" + direction;
        }
        return "0:0:" + this.direction;
    }
}
