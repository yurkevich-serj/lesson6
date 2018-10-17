package by.itacademy.lesson6.menu;

import by.itacademy.lesson6.operations.Operation;
import by.itacademy.lesson6.operations.OperationExecutionException;
import by.itacademy.lesson6.operations.Sqrt;


import java.util.Scanner;

public class SqrtSubMenu implements SubMenu {
    private Operation division = new Sqrt();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void execute() {
        System.out.println("Введите операнд:");
        double operand1 = scanner.nextDouble();
        try {
            System.out.println(division.execute(operand1));
        } catch (OperationExecutionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String name() {
        return "Извлечение корня";
    }
}
