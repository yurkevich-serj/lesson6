package by.itacademy.lesson6.operations;

public class Subtraction implements Operation {
    @Override
    public double execute(double... a) throws OperationExecutionException {
        return a[0] - a[1];
    }
}
