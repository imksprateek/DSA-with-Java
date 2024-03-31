package oops.Inheritence;

public class MultilevelInheritence {

    public static void main(String[] args) {
        BoxPrice box1 = new BoxPrice(4, 2, 1, 9, 120);

        System.out.println(box1.length);
        System.out.println(box1.breadth);
        System.out.println(box1.height);
        System.out.println(box1.weight);
        System.out.println(box1.price);

        Box box2 = new BoxWeight(5, 2, 1, 6);
        System.out.println(box2.length);
        //Can't access box2.weight
        //System.out.println(box2.weight);

        BoxPrice box3 = new BoxPrice(box1);

        System.out.println(box3.price);
        System.out.println(box3.weight);
        System.out.println(box3.length);

    }

    public static class Box {
        int length, breadth, height;

        public Box(int l, int b, int h) {
            this.length = l;
            this.breadth = b;
            this.height = h;
        }

        public Box() {
            this.length = -1;
            this.breadth = -1;
            this.height = -1;
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

        public BoxWeight() {
            super();
            this.weight = -1;
        }

        public BoxWeight(BoxWeight other) {
            super(other.length, other.breadth, other.height);
            this.weight = other.weight;
        }

        public void get_dimensions() {
            System.out.println("l=" + this.length + " " + "b=" + this.breadth + " " + "h=" + this.height + " " + "w=" + this.weight);
        }
    }

    public static class BoxPrice extends BoxWeight {
        int price;

        BoxPrice(int l, int b, int h, int w, int cost) {
            super(l, b, h, w);
            this.price = cost;
        }

        BoxPrice() {
            this.price = -1;
        }

        BoxPrice(BoxPrice other) {
            super(other.length, other.breadth, other.height, other.weight);
            this.price = other.price;
        }
    }
}
