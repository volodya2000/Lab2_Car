import java.util.List;
import java.util.Random;

public enum Brand {
    MAZDA,OPEL,MERCEDES,MITSUBISHI,HONDA,HYUNDAI,RENAULT,ZAZ,MASERATI;

    private static final List<Brand>BRANDS= List.of(Brand.values());

    private static final int SIZE= BRANDS.size();

    private static final Random RANDOM = new Random();

    public static Brand randomBrand(){
        return BRANDS.get(RANDOM.nextInt(SIZE));
    }

}
