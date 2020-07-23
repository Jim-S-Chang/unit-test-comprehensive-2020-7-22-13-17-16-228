public class GuessNumber {
    private int[] answer;

    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public String guess(int[] inputGuess) {
        int countOfA = getCountOfA(inputGuess, this.answer);
        String result = countOfA + "A0B";
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
