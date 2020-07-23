public class GameProcess {
    private GuessNumber guessNumber;
    private InputLegal inputLegal;
    private int times;

    public GameProcess() {
        AnswerGenerator answerGenerator = new RealAnswerGenerator();
        this.inputLegal = new InputLegal();
        this.guessNumber = new GuessNumber(answerGenerator);
        this.times = 0;
    }

    public String start() {
        return "Input\tOutput\n";
    }

    public String guess(int[] inputNumber) {
        this.times++;
        boolean isLegal = inputLegal.isLegal(inputNumber);
        if (!isLegal) {
            String result = "";
            for (int i = 0; i < inputNumber.length; i++) {
                result += inputNumber[i];
                if (i == inputNumber.length - 1) {
                    result += "\t";
                } else {
                    result += " ";
                }
            }
            result += "Wrong Input, Input again\n";
            return result;
        }
        return "";
    }

    public int getTimes() {
        return this.times;
    }
}