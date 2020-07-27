import java.util.List;
import java.util.Objects;

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

    public GameProcess(AnswerGenerator answerGenerator) {
        this.inputLegal = new InputLegal();
        this.guessNumber = new GuessNumber(answerGenerator);
        this.times = 0;
    }

    public String start() {
        return "Input\tOutput\n";
    }

    public String guess(List inputNumber) {
        if (this.times == 6){
            return "end";
        }
        this.times++;
        boolean isLegal = inputLegal.isLegal(inputNumber);
        String result = "";
        for (int i = 0; i < inputNumber.size(); i++) {
            result += inputNumber.get(i);
            if (i == inputNumber.size() - 1) {
                result += "\t";
            } else {
                result += " ";
            }
        }
        if (!isLegal) {
            result += "Wrong Input, Input again\n";
            return result;
        } else {
            String guessResult = guessNumber.guess(inputNumber);
            result += guessResult + "\n";
            if (guessResult.equals("4A0B")) {
                this.times = 6;
            }
            return result;
        }
    }

    public int getTimes() {
        return this.times;
    }
}
