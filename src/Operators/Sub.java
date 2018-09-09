package Operators;


public class Sub extends Operator {

    public Sub(String text) {
        super(text);
    }

    public double run(double before, double after)
    {
        return before - after;
    }
}
