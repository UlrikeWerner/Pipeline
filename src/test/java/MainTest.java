import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void returnSumFromTwoNumbers() {
        int a = 3;
        int b = 5;

        int actual = Main.sumOfTwoNumbers(a, b);

        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

}
