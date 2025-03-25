package hello;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void testMainOutput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        HelloWorld.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Локальное время: "));
        assertTrue(output.contains("CI Tests for a new random pipeline"));
    }
}