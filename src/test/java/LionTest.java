import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
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

    Lion lion;

    @Before
    public void initLion() throws Exception {
        lion = new Lion(felineMock, "самец");
    }

    @Test
    public void getKittensTest() {
        Mockito.when(felineMock.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void doesHaveManeMaleTest() {
        assertEquals(true, lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeFemaleTest() throws Exception {
        lion = new Lion(felineMock, "самка");
        assertEquals(false, lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void doesHaveManeNotLionTest() throws Exception {
        lion = new Lion(felineMock, "Неизвестный пол");
        lion.doesHaveMane();
    }

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
