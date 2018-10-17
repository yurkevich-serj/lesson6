package by.itacademy.lesson6.operations;

public class CubicRoot implements Operation {
    @Override
    public double execute(double... a) throws OperationExecutionException {
        return Math.cbrt(a[0]);
    }
}
