package algorithm;

import org.junit.jupiter.api.Test;

public class TwoSumTest {
    final TwoSum twoSum = new TwoSum();

    @Test
    public void nullArray_success() {
        twoSum.twoSum(null, 10);
    }
}
