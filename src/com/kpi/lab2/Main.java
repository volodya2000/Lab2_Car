import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car>cars= CarFactory.getCarArray(20);
        System.out.println(cars);

        System.out.println(CarFactory.sortByBrand(Brand.MAZDA,cars));
        System.out.println(CarFactory.sortByPriceYear(200000.21, 1977,cars));
        System.out.println(CarFactory.sortByModelYear(Model.LIMOUSINE, 5, cars));
    }
}
