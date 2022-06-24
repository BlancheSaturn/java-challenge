public class Floor {
    private double length;
    private double width;

    public Floor(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public  double getArea(){
        if (length < 0) {
            this.length = 0;
        } else if (width < 0) {
            this.width = 0;
        } else {

        }
        return length * width;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
