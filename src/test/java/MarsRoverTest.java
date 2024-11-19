import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_initialize_mars_rover(){
        //Given
        MarsRover rover = new MarsRover();
        //When
        String report = rover.showStatus();
        //Then
        assertEquals("0:0:N",report);
    }

    @Test
    public void should_face_west_when_orient_north_and_turn_left(){
        MarsRover rover = new MarsRover();
        String report = rover.executeCommand("L");
        assertEquals("0:0:W",report);
    }

    @Test
    public void should_face_south_when_orient_west_and_turn_left(){
        MarsRover rover = new MarsRover();
        rover.executeCommand("L");
        String report = rover.executeCommand("L");
        assertEquals("0:0:S",report);
    }

    @Test
    public void should_face_east_when_orient_south_and_turn_left(){
        MarsRover rover = new MarsRover();
        rover.executeCommand("L");
        rover.executeCommand("L");
        String report = rover.executeCommand("L");
        assertEquals("0:0:E",report);
    }

    @Test
    public void should_face_north_when_orient_east_and_turn_left(){
        MarsRover rover = new MarsRover();
        rover.executeCommand("L");
        rover.executeCommand("L");
        rover.executeCommand("L");
        String report = rover.executeCommand("L");
        assertEquals("0:0:N",report);
    }

    @Test
    public void should_face_east_when_orient_north_and_turn_right(){
        MarsRover rover = new MarsRover();
        String report = rover.executeCommand("R");
        assertEquals("0:0:E",report);
    }

    @Test
    public void should_face_south_when_orient_east_and_turn_right(){
        MarsRover rover = new MarsRover();
        rover.executeCommand("R");
        String report = rover.executeCommand("R");
        assertEquals("0:0:S",report);
    }

    @Test
    public void should_face_west_when_orient_south_and_turn_right(){
        MarsRover rover = new MarsRover();
        rover.executeCommand("R");
        rover.executeCommand("R");
        String report = rover.executeCommand("R");
        assertEquals("0:0:W",report);
    }

    @Test
    public void should_face_north_when_orient_west_and_turn_right(){
        MarsRover rover = new MarsRover();
        rover.executeCommand("R");
        rover.executeCommand("R");
        rover.executeCommand("R");
        String report = rover.executeCommand("R");
        assertEquals("0:0:N",report);
    }

    @Test
    public void should_incress_y_when_orient_north_and_move(){
        MarsRover rover = new MarsRover();
        String report = rover.executeCommand("M");
        assertEquals("0:1:N",report);
    }
}
