import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class InputLegalTest {
    @Test
    void should_return_false_when_judge_input_legal_given_1123() {
        List<Integer> inputGuess = new LinkedList<>();
        inputGuess.add(1);
        inputGuess.add(1);
        inputGuess.add(2);
        inputGuess.add(3);
        InputLegal inputLegal = new InputLegal();

        boolean isLegal = inputLegal.isLegal(inputGuess);

        Assertions.assertFalse(isLegal);
    }

    @Test
    void should_return_false_when_judge_input_legal_given_12() {
        List<Integer> inputGuess = new LinkedList<>();
        inputGuess.add(1);
        inputGuess.add(2);
        InputLegal inputLegal = new InputLegal();

        boolean isLegal = inputLegal.isLegal(inputGuess);

        Assertions.assertFalse(isLegal);
    }

    @Test
    void should_return_false_when_judge_input_legal_given_12310() {
        List<Integer> inputGuess = new LinkedList<>();
        inputGuess.add(1);
        inputGuess.add(2);
        inputGuess.add(3);
        inputGuess.add(10);
        InputLegal inputLegal = new InputLegal();

        boolean isLegal = inputLegal.isLegal(inputGuess);

        Assertions.assertFalse(isLegal);
    }

    @Test
    void should_return_true_when_judge_input_legal_given_1234() {
        List<Integer> inputGuess = new LinkedList<>();
        inputGuess.add(1);
        inputGuess.add(2);
        inputGuess.add(3);
        inputGuess.add(4);
        InputLegal inputLegal = new InputLegal();

        boolean isLegal = inputLegal.isLegal(inputGuess);

        Assertions.assertTrue(isLegal);
    }
}
