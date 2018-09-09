package Status;

import Operators.Operator;

public class Status {
    private boolean clearNumber = false;
    private double result = 0.0;
    private Operator lastOperator;

    public Operator getLastOperator() {
        return lastOperator;
    }

    public void setLastOperator(Operator lastOperator) {
        this.lastOperator = lastOperator;
    }

    public boolean isClearNumber() {
        return clearNumber;
    }

    public void setClearNumber(boolean clearNumber) {
        this.clearNumber = clearNumber;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
