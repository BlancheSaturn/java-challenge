public class Calculator2 {

    private Floor2 floor;
    private Carpet2 carpet;


    public Calculator2() {
        this.floor = new Floor2(20.98,12.5);
        this.carpet = new Carpet2(3560.89);
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "floor=" + floor +
                ", carpet=" + carpet +
                '}';
    }

    public String getTotalCost(){
        double priceOfCarpetArea = floor.getArea() * carpet.getCost();
//    System.out.println(priceOfCarpetArea);
        double priceOfCarpetAreaRounded = Math.round(priceOfCarpetArea);
        String resultPriceOfCarpetAreaRounded = String.valueOf(priceOfCarpetAreaRounded);
        String finalResult = (("$")+ resultPriceOfCarpetAreaRounded);
        return finalResult;
    }
}
