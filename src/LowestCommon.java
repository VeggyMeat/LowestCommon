public class LowestCommon {
    public static int lowestCommon(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("x and y must be non-negative");
        }

        int c = 0;
        while (x > 0 && y > 0) {
            if (x % 2 == 1 && y % 2 == 1) {
                return c;
            }
            c += 1;
            x /= 2;
            y /= 2;
        }

        return -1;
    }
}
