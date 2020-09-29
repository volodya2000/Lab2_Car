import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car>cars= CarFactory.getCarArray(20);

        System.out.println(CarFactory.sortByBrand(Brand.MAZDA,cars));
    }
}
