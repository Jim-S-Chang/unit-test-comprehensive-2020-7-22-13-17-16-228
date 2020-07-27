import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RealAnswerGenerator implements AnswerGenerator {
    @Override
    public List generate() {
        List<Integer> answer = new LinkedList<>();
        int n = 10;
        Random rand = new Random();
        boolean[] bool = new boolean[n];
        int randInt = 0;
        for (int i = 0; i < 4; i++) {
            do {
                randInt = rand.nextInt(n);
            } while (bool[randInt]);
            bool[randInt] = true;
            answer.add(randInt);
        }
        return answer;
    }
}
