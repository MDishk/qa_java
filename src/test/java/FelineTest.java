import static org.junit.Assert.*;
import com.example.Feline;
import org.junit.Test;
import java.util.List;

public class FelineTest {

        Feline feline = new Feline();

    @Test
    public void eatMeatTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyTest() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensTest() {
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensCountTest() {
        int expected = 2;
        int actual = feline.getKittens(2);
        assertEquals(expected, actual);
    }
}