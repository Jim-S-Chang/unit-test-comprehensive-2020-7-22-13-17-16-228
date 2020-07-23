
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameProcessTest {
    @Test
    public void should_return_output_strings_when_start_game_given_start() {
        GameProcess gameProcess = new GameProcess();

        String result = gameProcess.start();

        Assertions.assertEquals("Input\tOutput\t", result);
    }
}
