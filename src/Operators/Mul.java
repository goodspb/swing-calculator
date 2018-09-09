package Operators;

public class Mul extends Operator {

    public Mul(String text) {
        super(text);
    }

    public double run(double before, double after)
    {
        return before * after;
    }
}
