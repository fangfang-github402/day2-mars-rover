public class MarsRover {
    private String direction = "N";

    public String showStatus() {
        return "0:0:" + this.direction;
    }

    public String executeCommand(String command) {
        return "0:0:" + this.direction;
    }
}