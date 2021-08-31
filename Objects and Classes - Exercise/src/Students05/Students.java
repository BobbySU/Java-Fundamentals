package Students05;

public class Students {
    private String first;
    private String second;
    private double score;

    public Students(String first, String second, double score) {
        this.first = first;
        this.second = second;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f",this.first,this.second,this.score);
    }
}
