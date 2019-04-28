public class Length {

    private float value;

    private String unit;

    public Length(float value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean largerThan(Length target)  {
        if (!target.unit.equals(this.unit)) {
            throw new DifferentUnitException();
        }
        return this.value > target.value;
    }
}
