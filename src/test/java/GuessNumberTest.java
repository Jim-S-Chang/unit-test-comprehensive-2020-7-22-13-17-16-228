import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.when;

public class GuessNumberTest {
    @Test
    public void should_return_4A0B_when_guess_number_given_answer_1234_inputGuess_1234() {
        List<Integer> answer = new LinkedList<>();
        answer.add(1);
        answer.add(2);
        answer.add(3);
        answer.add(4);
        List<Integer> inputGuess = new LinkedList<>();
        inputGuess.add(1);
        inputGuess.add(2);
        inputGuess.add(3);
        inputGuess.add(4);

        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);

        String result = guessNumber.guess(inputGuess);

        Assertions.assertEquals("4A0B", result);
    }

    @Test
    public void should_return_0A0B_when_guess_number_given_answer_1234_inputGuess_5678() {
        List<Integer> answer = new LinkedList<>();
        answer.add(1);
        answer.add(2);
        answer.add(3);
        answer.add(4);
        List<Integer> inputGuess = new LinkedList<>();
        inputGuess.add(5);
        inputGuess.add(6);
        inputGuess.add(7);
        inputGuess.add(8);

        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);

        String result = guessNumber.guess(inputGuess);

        Assertions.assertEquals("0A0B", result);
    }

    @Test
    public void should_return_2A0B_when_guess_number_given_answer_1234_inputGuess_1278() {
        List<Integer> answer = new LinkedList<>();
        answer.add(1);
        answer.add(2);
        answer.add(3);
        answer.add(4);
        List<Integer> inputGuess = new LinkedList<>();
        inputGuess.add(1);
        inputGuess.add(2);
        inputGuess.add(7);
        inputGuess.add(8);

        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);

        String result = guessNumber.guess(inputGuess);

        Assertions.assertEquals("2A0B", result);
    }

    @Test
    public void should_return_0A4B_when_guess_number_given_answer_1234_inputGuess_2143() {
        List<Integer> answer = new LinkedList<>();
        answer.add(1);
        answer.add(2);
        answer.add(3);
        answer.add(4);
        List<Integer> inputGuess = new LinkedList<>();
        inputGuess.add(2);
        inputGuess.add(1);
        inputGuess.add(4);
        inputGuess.add(3);

        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);

        String result = guessNumber.guess(inputGuess);

        Assertions.assertEquals("0A4B", result);
    }

    @Test
    public void should_return_0A2B_when_guess_number_given_answer_1234_inputGuess_2156() {
        List<Integer> answer = new LinkedList<>();
        answer.add(1);
        answer.add(2);
        answer.add(3);
        answer.add(4);
        List<Integer> inputGuess = new LinkedList<>();
        inputGuess.add(2);
        inputGuess.add(1);
        inputGuess.add(5);
        inputGuess.add(6);

        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);

        String result = guessNumber.guess(inputGuess);

        Assertions.assertEquals("0A2B", result);
    }

    @Test
    public void should_return_2A2B_when_guess_number_given_answer_1234_inputGuess_2134() {
        List<Integer> answer = new LinkedList<>();
        answer.add(1);
        answer.add(2);
        answer.add(3);
        answer.add(4);
        List<Integer> inputGuess = new LinkedList<>();
        inputGuess.add(2);
        inputGuess.add(1);
        inputGuess.add(3);
        inputGuess.add(4);

        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);

        String result = guessNumber.guess(inputGuess);

        Assertions.assertEquals("2A2B", result);
    }

    @Test
    public void should_return_1A1B_when_guess_number_given_answer_1234_inputGuess_2536() {
        List<Integer> answer = new LinkedList<>();
        answer.add(1);
        answer.add(2);
        answer.add(3);
        answer.add(4);
        List<Integer> inputGuess = new LinkedList<>();
        inputGuess.add(2);
        inputGuess.add(5);
        inputGuess.add(3);
        inputGuess.add(6);

        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);

        String result = guessNumber.guess(inputGuess);

        Assertions.assertEquals("1A1B", result);
    }
}
