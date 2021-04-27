package test;

public class Box {
    String name;
    int length;
    int width;
    int height;
    int price;

    public boolean validate(int a, int b, int c) {
        if (a <= length && b <= width && c <= height) {
            return true;
        } else return false;
    }
}
