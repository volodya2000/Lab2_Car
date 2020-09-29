import java.util.List;
import java.util.Random;

public enum Color {
    BLACK,WHITE,BLUE,GREEN,RED,ORANGE,PURPLE,YELLOW,PINK,VIOLET;

    private static final List<Color> COLORS =
            List.of(values());
    private static final int SIZE = COLORS.size();
    private static final Random RANDOM = new Random();

    public static Color randomColor()  {
        return COLORS.get(RANDOM.nextInt(SIZE));
    }
}
