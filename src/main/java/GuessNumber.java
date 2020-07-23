public class GuessNumber {
    private int[] answer;

    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public String guess(int[] inputGuess) {
        int countOfA = getCountOfA(inputGuess, this.answer);
        int countOfB = getCountOfB(inputGuess, this.answer);
        return countOfA + "A" + countOfB + "B";
    }

    private int getCountOfB(int[] inputGuess, int[] answer) {
        int result = 0;
        for (int i = 0; i < inputGuess.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (inputGuess[i] == answer[j] && i != j) {
                    result++;
                }
            }
        }
        return result;
    }

    private int getCountOfA(int[] inputGuess, int[] answer) {
        int result = 0;
        for (int i = 0; i < inputGuess.length; i++) {
            if (inputGuess[i] == answer[i]) {
                result++;
            }
        }
        return result;
    }
}
