public class InputLegal {
    public InputLegal() {
    }

    public boolean isLegal(int[] inputNumbers) {
        boolean isNoRepeatedNumbers = isRepeated(inputNumbers);
        return isNoRepeatedNumbers;
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
