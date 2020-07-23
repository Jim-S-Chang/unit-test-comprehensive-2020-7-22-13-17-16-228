import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GuessNumberTest {
    @Test
    public void should_return_4A0B_when_guess_number_given_answer_1234_inputGuess_1234() {
        int[] answer = {1,2,3,4};
        int[] inputGuess = {1,2,3,4};

        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);

        String result = guessNumber.guess(inputGuess);

        Assertions.assertEquals("4A0B", result);
    }

    @Test
    public void should_return_0A0B_when_guess_number_given_answer_1234_inputGuess_5678() {
        int[] answer = {1,2,3,4};
        int[] inputGuess = {5,6,7,8};

        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);

        String result = guessNumber.guess(inputGuess);

        Assertions.assertEquals("0A0B", result);
    }

    @Test
    public void should_return_2A0B_when_guess_number_given_answer_1234_inputGuess_1278() {
        int[] answer = {1,2,3,4};
        int[] inputGuess = {1,2,7,8};

        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);

        String result = guessNumber.guess(inputGuess);

        Assertions.assertEquals("2A0B", result);
    }
}
