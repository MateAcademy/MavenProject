package example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Sergey Klunniy
 */
public class MathUtilTest {

    @Test
    public void min() {
        int a = 2;
        int b =4;
        int rez = MathUtil.min(a, b);
        Assert.assertEquals(rez, 2);
    }
}