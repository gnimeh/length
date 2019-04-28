import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class LengthTest {
    @Test
    public void should_compare_two_length_with_same_unit() {
        Length length1 = new Length(1.22f, "m");
        Length length2 = new Length(1.55f, "m");
        boolean isLarger = length1.largerThan(length2);
        assertFalse(isLarger);
    }

    @Test(expected = DifferentUnitException.class)
    public void should_not_compare_two_length_with_different_unit() {
        Length length1 = new Length(1.22f, "km");
        Length length2 = new Length(1.55f, "m");
        length1.largerThan(length2);
    }
}