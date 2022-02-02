import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    //add tests
    @Test
    public void addAllTester(){
        int arr[] = {1,2,3,4};
        //should be 10, failed case is 11
        assertEquals(11, SkillDemo.addAll(arr));
    }

}
