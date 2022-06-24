public class Carpet2 {
        private double cost;

        public Carpet2(double cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Carpet{" +
                    "cost=" + cost +
                    '}';
        }

        public double getCost(){
            if(cost < 0 ){
                this.cost = 0;
            }
            //  System.out.println(cost);
            return cost;
        }
    }

