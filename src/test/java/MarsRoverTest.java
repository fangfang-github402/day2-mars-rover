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
        //Given
        MarsRover rover = new MarsRover();
        //When
        String report = rover.executeCommand("L");
        //Then
        assertEquals("0:0:W",report);
    }

    @Test
    public void should_face_south_when_orient_west_and_turn_left(){
        //Given
        MarsRover rover = new MarsRover();
        rover.executeCommand("L");
        //When
        String report = rover.executeCommand("L");
        //Then
        assertEquals("0:0:S",report);
    }

    @Test
    public void should_face_east_when_orient_south_and_turn_left(){
        //Given
        MarsRover rover = new MarsRover();
        rover.executeCommand("L");
        rover.executeCommand("L");
        //When
        String report = rover.executeCommand("L");
        //Then
        assertEquals("0:0:E",report);
    }

    @Test
    public void should_face_north_when_orient_east_and_turn_left(){
        //Given
        MarsRover rover = new MarsRover();
        rover.executeCommand("L");
        rover.executeCommand("L");
        rover.executeCommand("L");
        //When
        String report = rover.executeCommand("L");
        //Then
        assertEquals("0:0:N",report);
    }

    @Test
    public void should_face_east_when_orient_north_and_turn_right(){
        //Given
        MarsRover rover = new MarsRover();
        //When
        String report = rover.executeCommand("R");
        //Then
        assertEquals("0:0:E",report);
    }

    @Test
    public void should_face_south_when_orient_east_and_turn_right(){
        //Given
        MarsRover rover = new MarsRover();
        rover.executeCommand("R");
        //When
        String report = rover.executeCommand("R");
        //Then
        assertEquals("0:0:S",report);
    }

    @Test
    public void should_face_west_when_orient_south_and_turn_right(){
        //Given
        MarsRover rover = new MarsRover();
        rover.executeCommand("R");
        rover.executeCommand("R");
        //When
        String report = rover.executeCommand("R");
        //Then
        assertEquals("0:0:W",report);
    }

    @Test
    public void should_face_north_when_orient_west_and_turn_right(){
        //Given
        MarsRover rover = new MarsRover();
        rover.executeCommand("R");
        rover.executeCommand("R");
        rover.executeCommand("R");
        //When
        String report = rover.executeCommand("R");
        //Then
        assertEquals("0:0:N",report);
    }

    @Test
    public void should_incress_y_when_orient_north_and_move(){
        //Given
        MarsRover rover = new MarsRover();
        //When
        String report = rover.executeCommand("M");
        //Then
        assertEquals("0:1:N",report);
    }

    @Test
    public void should_descress_x_when_orient_west_and_move(){
        //Given
        MarsRover rover = new MarsRover();
        rover.executeCommand("M");
        rover.executeCommand("L");
        //When
        String report = rover.executeCommand("M");
        //Then
        assertEquals("-1:1:W",report);
    }

    @Test
    public void should_decress_y_when_orient_south_and_move(){
        //Given
        MarsRover rover = new MarsRover();
        rover.executeCommand("M");
        rover.executeCommand("L");
        rover.executeCommand("M");
        rover.executeCommand("L");
        //When
        String report = rover.executeCommand("M");
        //Then
        assertEquals("-1:0:S",report);
    }

    @Test
    public void should_increase_x_when_orient_east_and_move(){
        //Given
        MarsRover rover = new MarsRover();
        rover.executeCommand("M");
        rover.executeCommand("L");
        rover.executeCommand("M");
        rover.executeCommand("L");
        rover.executeCommand("M");
        rover.executeCommand("L");
        //When
        String report = rover.executeCommand("M");
        //Then
        assertEquals("0:0:E",report);
    }

    @Test
    public void should_descrease_y_when_orient_north_and_move_back(){
        //Given
        MarsRover rover = new MarsRover();
        //When
        String report = rover.executeCommand("B");
        //Then
        assertEquals("0:-1:N",report);
    }

    @Test
    public void should_increase_x_when_orient_west_and_move_back(){
        //Given
        MarsRover rover = new MarsRover();
        rover.executeCommand("B");
        rover.executeCommand("L");
        //When
        String report = rover.executeCommand("B");
        //Then
        assertEquals("1:-1:W",report);
    }

    @Test
    public void should_increase_y_when_orient_south_and_move_back(){
        //Given
        MarsRover rover = new MarsRover();
        rover.executeCommand("B");
        rover.executeCommand("L");
        rover.executeCommand("B");
        rover.executeCommand("L");
        //When
        String report = rover.executeCommand("B");
        //Then
        assertEquals("1:0:S",report);
    }

    @Test
    public void should_descrease_x_when_orient_east_and_move_back(){
        //Given
        MarsRover rover = new MarsRover();
        rover.executeCommand("B");
        rover.executeCommand("L");
        rover.executeCommand("B");
        rover.executeCommand("L");
        rover.executeCommand("B");
        rover.executeCommand("L");
        //When
        String report = rover.executeCommand("B");
        //Then
        assertEquals("0:0:E",report);
    }

    @Test
    public void should_report_0_0_E_when_orient_north_and_BLBLBLB(){
        //Given
        MarsRover rover = new MarsRover();
        //When
        String report = rover.executeCommand("BLBLBLB");
        //Then
        assertEquals("0:0:E",report);
    }
}