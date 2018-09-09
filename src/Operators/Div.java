package Operators;

public class Div extends Operator {

    public Div(String text) {
        super(text);
    }


    public double run(double before, double after)
    {
        return before / after;
    }
}
