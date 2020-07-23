import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InputLegalTest {
    @Test
    void should_return_false_when_judge_input_legal_given_1123() {
        int[] inputNumbers = {1, 1, 2, 3};
        InputLegal inputLegal = new InputLegal();

        boolean isLegal = inputLegal.isLegal(inputNumbers);

        Assertions.assertFalse(isLegal);
    }

    @Test
    void should_return_false_when_judge_input_legal_given_12() {
        int[] inputNumbers = {1, 2};
        InputLegal inputLegal = new InputLegal();

        boolean isLegal = inputLegal.isLegal(inputNumbers);

        Assertions.assertFalse(isLegal);
    }

    @Test
    void should_return_false_when_judge_input_legal_given_12310() {
        int[] inputNumbers = {1, 2, 3, 10};
        InputLegal inputLegal = new InputLegal();

        boolean isLegal = inputLegal.isLegal(inputNumbers);

        Assertions.assertFalse(isLegal);
    }
}
