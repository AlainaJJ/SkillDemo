//javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar SkillDemoExTest.java
//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore SkillDemoExTest

import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoExTest {

    @Test 
    public void subtract() {
        assertEquals(2, SkillDemoEx.subtract(4, 3));
    }
    
}
