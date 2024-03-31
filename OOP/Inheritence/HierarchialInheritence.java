package oops.Inheritence;

public class HierarchialInheritence {

    public static void main(String[] args) {
        //Different classes inherit from the same parent class

        BoxPrice box1 = new BoxPrice();

        System.out.println(box1.price);

        BoxColor box2 = new BoxColor();

        System.out.println(box2.color);
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

    public static class BoxColor extends BoxWeight {
        String color;

        BoxColor() {
            super();
            this.color = "Black";
        }
    }
}
