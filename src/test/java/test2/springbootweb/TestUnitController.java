package test2.springbootweb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnitController {

    @Test
    public void testUniT(){
        TestController controller = new TestController();
        String result = controller.hello("Test");
        assertEquals("Welcome, Test", result);
    }
}
