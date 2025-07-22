import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxServiceTest {
    @Test

    public void shouldFindMax() {
        MaxService serice = new MaxService();

        int a = 5;
        int b = 3;

        int expectd = a;
        int actual = serice.max(a, b);

        Assertions.assertEquals(expectd, actual);
    }

}
