
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

        int[]  inputNumber = {1,2};

        String result = gameProcess.guess(inputNumber);

        Assertions.assertEquals("1 2\tWrong Input, Input again\n", result);
    }
}
