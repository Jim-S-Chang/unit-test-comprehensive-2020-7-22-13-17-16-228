import java.util.List;
import java.util.stream.IntStream;

public class GuessNumber {
    private List answer;

    public GuessNumber(AnswerGenerator answerGenerator) {
        answer = answerGenerator.generate();
    }

    public String guess(List inputGuess) {
        return String.format("%dA%dB", getCountOfA(inputGuess), getCountOfB(inputGuess));
    }

    private int getCountOfB(List inputGuess) {
        return inputGuess.stream().filter(e->answer.contains(e)).toArray().length- getCountOfA(inputGuess);
    }

    private int getCountOfA(List inputGuess) {
        return IntStream
                .range(0,inputGuess.size())
                .filter(i->inputGuess.get(i)==answer.get(i))
                .toArray()
                .length;
    }
}
