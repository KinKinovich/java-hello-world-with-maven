package hello;

import org.junit.Test;
import static org.junit.Assert.*;

public class GreeterTest {

    @Test
    public void testSayHello() {
        Greeter greeter = new Greeter();
        assertFalse(greeter.sayHello().contains("Hello, World!"));
    }
}