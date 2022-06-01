import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MaxMinTest {
    MaxMin m;
    @BeforeEach
    void setup(){
        m=new MaxMin();
    }
    @Test
    public void bLarger(){
        double a=10.0;
        double b=16.0;
        double expected =16.0;
        double actual=m.maximum(a,b);
        assertTrue(actual>a, "b should be larger" );
//        assertEquals(expected, actual);
    }

}
