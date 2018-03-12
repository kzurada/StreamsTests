package Range;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeTest {

    @Test
    void Range() {

        Range range = new Range(10,30);
        Assert.assertTrue(range.isInRange(20));
    }

    @AfterEach
    void tearDown() {
        Range range = new Range(10,25);
        Assert.assertTrue(range.isInRange(22));
    }
}