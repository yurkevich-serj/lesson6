package by.itacademy.lesson6.operations;

public interface Operation {
    double execute(double... a) throws OperationExecutionException;
}
