
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GameProcessTest {
    @Test
    public void should_return_output_strings_when_start_game_given_start() {
        GameProcess gameProcess = new GameProcess();

        String result = gameProcess.start();

        Assertions.assertEquals("Input\tOutput\n", result);
    }

    @Test
    public void should_return_wrong_string_and_time_is_1_when_guess_given_12() {
        GameProcess gameProcess = new GameProcess();

        int[] inputNumber = {1, 2};

        String result = gameProcess.guess(inputNumber);
        Assertions.assertEquals(gameProcess.getTimes(), 1);
        Assertions.assertEquals("1 2\tWrong Input, Input again\n", result);
    }

    @Test
    public void should_return_2A2B_and_time_is_1_when_guess_given_1243_with_answer1234() {
        int[] answer = {1,2,3,4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GameProcess gameProcess = new GameProcess(answerGenerator);

        int[] inputNumber = {1, 2,4,3};

        String result = gameProcess.guess(inputNumber);
        Assertions.assertEquals(gameProcess.getTimes(), 1);
        Assertions.assertEquals("1 2 4 3\t2A2B\n", result);
    }

    @Test
    public void should_return_4A0B_and_times_change_to_6_when_guess_given_1234_with_answer1234() {
        int[] answer = {1,2,3,4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GameProcess gameProcess = new GameProcess(answerGenerator);

        int[] inputNumber = {1, 2,4,3};

        String result = gameProcess.guess(inputNumber);
        Assertions.assertEquals(gameProcess.getTimes(), 6);
        Assertions.assertEquals("1 2 4 3\t4A0B\n", result);
    }
}
