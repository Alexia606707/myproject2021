package fju.box;

public class Box3 extends Box{
    public Box3() {
        length = 10;
        width = 10;
        height = 10;
    }

    @Override
    public String getName() {
        return "BOX3";
    }

    @Override
    public int getPrice() {
        return 60;
    }
}
