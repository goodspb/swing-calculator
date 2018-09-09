package Operators;

public abstract class Operator {
    protected String text;

    public Operator(String text)
    {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public abstract double run(double before, double after);
}
