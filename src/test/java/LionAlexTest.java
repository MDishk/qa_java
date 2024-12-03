import com.example.LionAlex;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    private Feline felineMock;

    LionAlex alex;

    @Before
    public void initLionAlex() throws Exception {
        alex = new LionAlex(felineMock);
    }

    @Test
    public void getKittensTest() {
        assertEquals(0, alex.getKittens());
    }

    @Test
    public void getFriendsTest() {
        assertEquals(List.of("Марти", "Глория", "Мелман"), alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() {
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void getFoodTest() throws Exception {
        when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), alex.getFood());
    }

    @Test
    public void doesHaveManeTest() {
        assertEquals(true, alex.doesHaveMane());
    }
}