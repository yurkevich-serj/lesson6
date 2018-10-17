package by.itacademy.lesson6.menu;

import by.itacademy.lesson6.operations.CubicRoot;
import by.itacademy.lesson6.operations.Operation;
import by.itacademy.lesson6.operations.OperationExecutionException;

import java.util.Scanner;

public class CubicRootSubMenu implements SubMenu {
    private Operation croot = new CubicRoot();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void execute() {
        System.out.println("Введите операнд");
        double operand1 = scanner.nextDouble();
        try {
            System.out.println(croot.execute(operand1));
        } catch (OperationExecutionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String name() {
        return "Кубический корень";
    }
}
