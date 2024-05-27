import java.util.Arrays;

public class MinMaxService {
    private int[] mas;
    private int max;
    private int min;

    MinMaxService(int[] mas) {
        this.mas = mas;
    }
    public void min() {
        min = Arrays.stream(mas).min().getAsInt();
    }

    public void max() {
        max = Arrays.stream(mas).max().getAsInt();
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
}
