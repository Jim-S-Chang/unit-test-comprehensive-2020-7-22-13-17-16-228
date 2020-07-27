import java.util.List;
import java.util.stream.Collectors;

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
        if (this.times == 6) {
            return "end";
        }
        this.times++;
        String result = getOutputNumberString(inputNumber);
        if (!inputLegal.isLegal(inputNumber)) {
            return String.format("%sWrong Input, Input again\n", result);
        } else {
            String guessResult = guessNumber.guess(inputNumber);
            judgeWin(guessResult);
            return String.format("%s%s\n", result, guessResult);
        }
    }

    private void judgeWin(String guessResult) {
        if (guessResult.equals("4A0B")) {
            this.times = 6;
        }
    }

    private String getOutputNumberString(List<Integer> inputNumber) {
        return String.format("%s\t", inputNumber.stream()
                .map(e -> String.valueOf(e))
                .collect(Collectors.joining(" ")));
    }

    public int getTimes() {
        return this.times;
    }
}
