
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.LinkedList;
import java.util.List;

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

        List<Integer> inputGuess = new LinkedList<>();
        inputGuess.add(1);
        inputGuess.add(2);

        String result = gameProcess.guess(inputGuess);
        Assertions.assertEquals(gameProcess.getTimes(), 1);
        Assertions.assertEquals("1 2\tWrong Input, Input again\n", result);
    }

    @Test
    public void should_return_2A2B_and_time_is_1_when_guess_given_1243_with_answer1234() {
        List<Integer> answer = new LinkedList<>();
        answer.add(1);
        answer.add(2);
        answer.add(3);
        answer.add(4);
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GameProcess gameProcess = new GameProcess(answerGenerator);

        List<Integer> inputGuess = new LinkedList<>();
        inputGuess.add(1);
        inputGuess.add(2);
        inputGuess.add(4);
        inputGuess.add(3);

        String result = gameProcess.guess(inputGuess);
//        Assertions.assertEquals(1, gameProcess.getTimes());
        Assertions.assertEquals("1 2 4 3\t2A2B\n", result);
    }

    @Test
    public void should_return_4A0B_and_times_change_to_6_when_guess_given_1234_with_answer1234() {
        List<Integer> answer = new LinkedList<>();
        answer.add(1);
        answer.add(2);
        answer.add(3);
        answer.add(4);
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GameProcess gameProcess = new GameProcess(answerGenerator);

        List<Integer> inputNumber = new LinkedList<>();
        inputNumber.add(1);
        inputNumber.add(2);
        inputNumber.add(3);
        inputNumber.add(4);

        String result = gameProcess.guess(inputNumber);
        Assertions.assertEquals(6, gameProcess.getTimes());
        Assertions.assertEquals("1 2 3 4\t4A0B\n", result);
    }

    @Test
    public void should_return_end_when_times_change_to_6_given_1243_with_answer1234() {
        List<Integer> answer = new LinkedList<>();
        answer.add(1);
        answer.add(2);
        answer.add(3);
        answer.add(4);
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GameProcess gameProcess = new GameProcess(answerGenerator);

        List<Integer> inputNumber = new LinkedList<>();
        inputNumber.add(1);
        inputNumber.add(2);
        inputNumber.add(4);
        inputNumber.add(3);


        String result1 = gameProcess.guess(inputNumber);
        String result2 = gameProcess.guess(inputNumber);
        String result3 = gameProcess.guess(inputNumber);
        String result4 = gameProcess.guess(inputNumber);
        String result5 = gameProcess.guess(inputNumber);
        String result6 = gameProcess.guess(inputNumber);

        Assertions.assertEquals(6, gameProcess.getTimes());
        String result7 = gameProcess.guess(inputNumber);
        Assertions.assertEquals(6, gameProcess.getTimes());
        Assertions.assertEquals("end", result7);
    }

    @Test
    public void should_return_end_when_win_given_1243_first_1234_second_with_answer1234() {
        List<Integer> answer = new LinkedList<>();
        answer.add(1);
        answer.add(2);
        answer.add(3);
        answer.add(4);
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GameProcess gameProcess = new GameProcess(answerGenerator);

        List<Integer> inputNumber1 = new LinkedList<>();
        inputNumber1.add(1);
        inputNumber1.add(2);
        inputNumber1.add(4);
        inputNumber1.add(3);

        List<Integer> inputNumber2 = new LinkedList<>();
        inputNumber2.add(1);
        inputNumber2.add(2);
        inputNumber2.add(3);
        inputNumber2.add(4);

        gameProcess.guess(inputNumber1);
        Assertions.assertEquals(1, gameProcess.getTimes());
        gameProcess.guess(inputNumber2);
        Assertions.assertEquals(6, gameProcess.getTimes());
        String result = gameProcess.guess(inputNumber2);
        Assertions.assertEquals("end", result);
    }
}
