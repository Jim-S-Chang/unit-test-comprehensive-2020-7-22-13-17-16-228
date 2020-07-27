import java.util.HashSet;
import java.util.List;

public class InputLegal {
    public InputLegal() {
    }

    public boolean isLegal(List inputNumbers) {
        return isNoRepeated(inputNumbers) && isLengthLegal(inputNumbers) && isRangeLegal(inputNumbers);
    }

    private boolean isRangeLegal(List<Integer> inputNumbers) {
        return inputNumbers.stream().filter(x -> x >= 0 && x <= 9).toArray().length == 4;
    }

    private boolean isLengthLegal(List inputNumbers) {
        return inputNumbers.size() == 4;
    }

    private boolean isNoRepeated(List inputNumbers) {
        HashSet set = new HashSet(inputNumbers);
        inputNumbers.clear();
        inputNumbers.addAll(set);
        return inputNumbers.size() == 4;
    }
}
