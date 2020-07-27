import java.util.List;

public class InputLegal {
    public InputLegal() {
    }

    public boolean isLegal(List inputNumbers) {
        return isNoRepeated(inputNumbers) && isLengthLegal(inputNumbers) && isRangeLegal(inputNumbers);
    }

    private boolean isRangeLegal(List<Integer> inputNumbers) {
        return inputNumbers.stream().filter(x->x>=0&&x<=9).toArray().length == 4 ? true : false;
    }

    private boolean isLengthLegal(List inputNumbers) {
        return inputNumbers.size() == 4;
    }

    private boolean isNoRepeated(List inputNumbers) {
        for (int i = 0; i < inputNumbers.size(); i++) {
            for (int j = i + 1; j < inputNumbers.size(); j++) {
                if (inputNumbers.get(j) == inputNumbers.get(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
