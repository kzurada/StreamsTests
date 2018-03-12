package Range;

public class Range {
    private int lowerBound;
    private int upperBound;

    public Range(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public boolean isInRange(int number) {
        return number >= lowerBound && number <= upperBound;
    }
}
