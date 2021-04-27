package test;

public class Box {
    int length;
    int width;
    int height;
    public boolean validate(int a, int b, int c) {
        if (a <= length && b <= width && c <= height) {
            return true;
        } else return false;
    }
}
