class Box {
    protected int length;
    protected int breadth;
    public Box(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int area() {
        return length * breadth;
    }
}

class Box3D extends Box {
    private int height;
    public Box3D(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }
    public int volume() {
        return length * breadth * height;
    }
}

public class DemoBox {
    public static void main(String[] args) {

        Box box = new Box(5, 4);
        System.out.println("Area = " + box.area());

        Box3D box3d = new Box3D(5, 4, 3);
        System.out.println("Volume = " + box3d.volume());
    }
}