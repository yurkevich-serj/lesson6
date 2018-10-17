package by.itacademy.lesson6.menu;

import by.itacademy.lesson6.operations.Operation;
import by.itacademy.lesson6.operations.OperationExecutionException;
import by.itacademy.lesson6.operations.Subtraction;

import java.util.Scanner;

public class SubtractionSubMenu implements SubMenu {
    private Operation subtraction = new Subtraction();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void execute() {
        System.out.println("Введите операнд");
        double operand1 = scanner.nextDouble();
        double operand2 = scanner.nextDouble();
        try {
            System.out.println(subtraction.execute(operand1, operand2));
        } catch (OperationExecutionException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String name() {
        return "Вычитание";
    }
}
