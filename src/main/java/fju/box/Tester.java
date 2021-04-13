package fju.box;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Box3 box3 = new Box3();
        Box5 box5 = new Box5();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object's length:");
        int length = scanner.nextInt();
        System.out.println("Please enter object's width:");
        int width = scanner.nextInt();
        System.out.println("Please enter object's height:");
        int height = scanner.nextInt();
        System.out.println("Length: " + length +  ", Width: " + width + ", Height: " + height);

        if (box3.validate(length, width, height)) {
            System.out.println(box3.getName() + " $" + box3.getPrice());
        } else if (box5.validate(length, width, height)){
            System.out.println(box5.getName() + " $" + box5.getPrice());
        }
    }
}
