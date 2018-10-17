package by.itacademy.lesson6.menu;

import by.itacademy.lesson6.operations.Division;
import by.itacademy.lesson6.operations.Operation;
import by.itacademy.lesson6.operations.OperationExecutionException;

import java.util.Scanner;

public class DivisionSubMenu implements SubMenu {
    private Operation division = new Division();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void execute() {
        System.out.println("Введите операнды:");
        double operand1 = scanner.nextDouble();
        double operand2 = scanner.nextDouble();
        try {
            System.out.println(division.execute(operand1, operand2));
        } catch (OperationExecutionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String name() {
        return "Деление";
    }
}

