public class InputLegal {
    public InputLegal() {
    }

    public boolean isLegal(int[] inputNumbers) {
        boolean isNoRepeatedNumbers = isRepeated(inputNumbers);
        boolean isLengthLegal = judgeLengthLegal(inputNumbers);
        boolean isRangeLegal = judgeRange(inputNumbers);
        return isNoRepeatedNumbers && isLengthLegal && isRangeLegal;
    }

    private boolean judgeRange(int[] inputNumbers) {
        for (int i = 0; i < inputNumbers.length; i++) {
            if (inputNumbers[i] < 0 || inputNumbers[i] > 9) {
                return false;
            }
        }
        return true;
    }

    private boolean judgeLengthLegal(int[] inputNumbers) {
        return inputNumbers.length == 4;
    }

    private boolean isRepeated(int[] inputNumbers) {
        for (int i = 0; i < inputNumbers.length; i++) {
            for (int j = i + 1; j < inputNumbers.length; j++) {
                if (inputNumbers[j] == inputNumbers[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
