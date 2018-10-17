package by.itacademy.lesson6.operations;

public class Sqrt implements Operation {
    @Override
    public double execute(double... a) {
        return Math.sqrt(a[0]);
    }
}
