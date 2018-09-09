package Operators;

public class Add extends Operator {

    public Add(String text) {
        super(text);
    }

    public double run(double before, double after)
    {
        return before + after;
    }

}
