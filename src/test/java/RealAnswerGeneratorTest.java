import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RealAnswerGeneratorTest {
    @Test
    public void should_return_true_when_generate_answer_given_no_input_test_is_repeated() {
        RealAnswerGenerator realAnswerGenerator = new RealAnswerGenerator();
        int[] answer = realAnswerGenerator.generate();

        boolean result = true;
        for (int i = 0; i < answer.length; i++) {
            for (int j = i + 1; j < answer.length; j++) {
                if (answer[j] == answer[i]) {
                    result = false;
                    break;
                }
            }
        }

        Assertions.assertTrue(result);
    }

    @Test
    public void should_return_true_when_generate_answer_given_no_input_test_is_less_than_4() {
        RealAnswerGenerator realAnswerGenerator = new RealAnswerGenerator();
        int[] answer = realAnswerGenerator.generate();

        Assertions.assertTrue(answer.length == 4);
    }

    @Test
    public void should_return_true_when_generate_answer_given_no_input_test_is_at_range() {
        RealAnswerGenerator realAnswerGenerator = new RealAnswerGenerator();
        int[] answer = realAnswerGenerator.generate();

        boolean result = true;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] < 0 || answer[i] > 9) {
                result = false;
                break;
            }
        }

        Assertions.assertTrue(result);
    }
}
