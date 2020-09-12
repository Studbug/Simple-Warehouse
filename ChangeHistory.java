
import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {

    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }

    public void add(double status) {
        this.changeHistory.add(status);
    }

    public void clear() {
        this.changeHistory.clear();
    }

    public double maxValue() {
        return Collections.max(changeHistory);
    }

    public double minValue() {
        return Collections.min(changeHistory);
    }

    public double average() {
        if (!this.changeHistory.isEmpty()) {
            double sum = 0;
            for (int i = 0, length = this.changeHistory.size(); i < length; i++) {
                sum += this.changeHistory.get(i);
            }
            return sum / this.changeHistory.size();
        }
        return 0;
    }

    @Override
    public String toString() {
        return this.changeHistory.toString();
    }
}
