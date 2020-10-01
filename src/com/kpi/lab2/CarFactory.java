import java.util.*;

public class CarFactory {

    public static List<Car> getCarArray(int listSize) {
        // final List<Car> carsOutput = List.of();
        final List<Car> carsArrayOutput = new ArrayList<>(listSize);
        /*for(int i =0; i<listSize; i++){
            carsArrayOutput.add();
        }

         */


        return carsArrayOutput;
    }

    public static List<Car> sortByBrand(Brand carBrand, List<Car> carsInput) {
        final ArrayList<Car> carsBrandOutput = new ArrayList<>();
        //int index = carsInput.indexOf(carBrand);
        for (int i = 0; i < carsInput.size(); i++) {
            if (carsInput.get(i).getBrand().equals(carBrand))
                carsBrandOutput.add(carsInput.get(i));
        }
        return carsBrandOutput;
    }

    public static List<Car> sortByModelYear(Model carModel, int carYears, List<Car> carsInput) {
        final ArrayList<Car> carsOutput = new ArrayList<>();
        //int index = carsInput.indexOf(carBrand);
        for (int i = 0; i < carsInput.size(); i++) {
            if (carsInput.get(i).getModel().equals(carModel) &&
                    (GetYear.getCurrentYear() - carsInput.get(i).getYearOfExploitation()) > carYears)
                carsOutput.add(carsInput.get(i));
        }
        return carsOutput;
    }


    public static List<Car> sortByPriceYear(double carPrice, int carYearOfExploitation, List<Car> carsInput) {
        final ArrayList<Car> carsOutput = new ArrayList<>();
        //int index = carsInput.indexOf(carBrand);
        for (int i = 0; i < carsInput.size(); i++)
            if (carsInput.get(i).getYearOfExploitation() == carYearOfExploitation &&
                    carsInput.get(i).getPrice() > carPrice) carsOutput.add(carsInput.get(i));
        return carsOutput;
    }


}
