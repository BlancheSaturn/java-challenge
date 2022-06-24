
    public class Floor2 {
        private double width;
        private double length;

        public Floor2(double width, double length) {
            this.width = width;
            this.length = length;
        }
        @Override
        public String toString() {
            return "Carpet{" +
                    "width=" + width +
                    ", length=" + length +
                    '}';
        }
        public double getArea(){
            double result = width * length;
            System.out.println(result);
            return result;
        }
    }

