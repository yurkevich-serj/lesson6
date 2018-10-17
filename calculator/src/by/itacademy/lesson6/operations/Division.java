package by.itacademy.lesson6.operations;

public class Division implements Operation {

    @Override
    public double execute(double... a) throws OperationExecutionException {
        if (a[1] == 0)
            throw new OperationExecutionException("by.itacademy.lesson6.operations.Division by zero is forbidden");
        return a[0] / a[1];
    }
}
