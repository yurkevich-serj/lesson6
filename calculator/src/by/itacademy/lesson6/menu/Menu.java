package by.itacademy.lesson6.menu;

import java.util.Scanner;

public class Menu {
    private SubMenu[] subMenus = {new DivisionSubMenu(), new SqrtSubMenu(), new AdditionSubMenu(),
            new SubtractionSubMenu(), new MultiplicationSubMenu(), new CubicRootSubMenu()};
    private Scanner scanner = new Scanner(System.in);

    public void execute() {
        System.out.println("Введите номер операции:");
        for (int i = 0; i < subMenus.length; i++) {
            System.out.println((i + 1) + ". " + subMenus[i].name());
        }

        int choice = scanner.nextInt();
        subMenus[choice - 1].execute();
    }

}

