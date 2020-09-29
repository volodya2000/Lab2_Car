import java.util.List;
import java.util.Random;

public enum Model {

    MICROCAR,ECONOMY_HATCHBACK,SEDAN,COUPE,SPORTS_CAR,SUV,PICKUP,LIMOUSINE,ELECTRIC,HYBRID;

    private static final List<Model> MODELS =
            List.of(values());
    private static final int SIZE = MODELS.size();
    private static final Random RANDOM = new Random();

    public static Model randomModel()  {
        return MODELS.get(RANDOM.nextInt(SIZE));
    }
}
