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
}
