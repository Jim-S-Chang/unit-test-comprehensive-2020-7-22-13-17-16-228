import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RealAnswerGeneratorTest {
    @Test
    public void should_return_true_when_generate_answer_given_no_input_test_is_repeated() {
        RealAnswerGenerator realAnswerGenerator = new RealAnswerGenerator();
        List<Integer> answer = realAnswerGenerator.generate();

        boolean result = true;
        for (int i = 0; i < answer.size(); i++) {
            for (int j = i + 1; j < answer.size(); j++) {
                if (answer.get(j) == answer.get(i)) {
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
        List<Integer> answer = realAnswerGenerator.generate();

        Assertions.assertTrue(answer.size() == 4);
    }

    @Test
    public void should_return_true_when_generate_answer_given_no_input_test_is_at_range() {
        RealAnswerGenerator realAnswerGenerator = new RealAnswerGenerator();
        List<Integer> answer = realAnswerGenerator.generate();

        boolean result = true;
        for (int i = 0; i < answer.size(); i++) {
            if (answer.get(i) < 0 || answer.get(i) > 9) {
                result = false;
                break;
            }
        }

        Assertions.assertTrue(result);
    }
}
