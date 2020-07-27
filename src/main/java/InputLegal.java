import java.util.List;

public class InputLegal {
    public InputLegal() {
    }

    public boolean isLegal(List inputNumbers) {
        boolean isNoRepeatedNumbers = isRepeated(inputNumbers);
        boolean isLengthLegal = judgeLengthLegal(inputNumbers);
        boolean isRangeLegal = judgeRange(inputNumbers);
        return isNoRepeatedNumbers && isLengthLegal && isRangeLegal;
    }

    private boolean judgeRange(List<Integer> inputNumbers) {
        for (int i = 0; i < inputNumbers.size(); i++) {
            if (inputNumbers.get(i) < 0 || inputNumbers.get(i) > 9) {
                return false;
            }
        }
        return true;
    }

    private boolean judgeLengthLegal(List inputNumbers) {
        return inputNumbers.size() == 4;
    }

    private boolean isRepeated(List inputNumbers) {
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
