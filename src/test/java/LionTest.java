import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline felineMock;

    @Test
    public void getKittensTest() throws Exception {
        Mockito.when(felineMock.getKittens()).thenReturn(3);
        Lion lion = new Lion(felineMock, "Самец");
        assertEquals(3, lion.getKittens());
    }

    @Test
    public void testDoesHaveManeMale() throws Exception {
        Lion maleLion = new Lion(felineMock, "Самец");
        assertEquals(true, maleLion.doesHaveMane());
    }

    @Test
    public void testDoesHaveManeFemale() throws Exception {
        Lion femaleLion = new Lion(felineMock, "Самка");
        assertEquals(false, femaleLion.doesHaveMane());
    }

    @Test
    public void invalidSexTest() throws Exception {
        try {
            new Lion(felineMock, "Неизвестный пол");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion(felineMock, "Самец");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
