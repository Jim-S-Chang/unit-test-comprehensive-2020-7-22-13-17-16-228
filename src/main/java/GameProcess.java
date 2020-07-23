public class GameProcess {
    private GuessNumber guessNumber;
    private int times;
    public GameProcess() {
        AnswerGenerator answerGenerator = new RealAnswerGenerator();
        this.guessNumber = new GuessNumber(answerGenerator);
        this.times = 0;
    }

    public String start() {
        return "Input\tOutput\t";
    }
}
