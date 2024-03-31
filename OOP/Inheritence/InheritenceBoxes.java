package oops.Inheritence;

public class InheritenceBoxes {
    public static void main(String[] args) {
        Box box1 = new Box(6, 1, 9);
        BoxWeight box2 = new BoxWeight(3, 6, 9, 12);
        box1.printDimensions();
        box2.get_dimensions();
    }

    public static class Box {
        int length, breadth, height;

        public Box(int l, int b, int h) {
            this.length = l;
            this.breadth = b;
            this.height = h;
        }

        public void printDimensions() {
            System.out.println("l=" + this.length + " " + "b=" + this.breadth + " " + "h=" + this.height);
        }
    }

    public static class BoxWeight extends Box {
        int weight;

        public BoxWeight(int l, int b, int h, int w) {
            super(l, b, h);
            this.weight = w;
        }

        public void get_dimensions() {
            System.out.println("l=" + this.length + " " + "b=" + this.breadth + " " + "h=" + this.height + " " + "w=" + this.weight);
        }
    }
}
