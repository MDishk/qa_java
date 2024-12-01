import com.example.LionAlex;
import com.example.Feline;
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

        @Test
        public void testGetKittens() throws Exception {
            LionAlex alex = new LionAlex(felineMock);
            assertEquals(0, alex.getKittens());
        }

        @Test
        public void testGetFriends() throws Exception {
            LionAlex alex = new LionAlex(felineMock);
            assertEquals(List.of("Марти", "Глория", "Мелман"), alex.getFriends());
        }

        @Test
        public void testGetPlaceOfLiving() throws Exception {
            LionAlex alex = new LionAlex(felineMock);
            assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
        }

        @Test
        public void testGetFood() throws Exception {
            LionAlex alex = new LionAlex(felineMock);
            when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            assertEquals(List.of("Животные", "Птицы", "Рыба"), alex.getFood());
        }

        @Test
        public void testDoesHaveMane() throws Exception {
            LionAlex alex = new LionAlex(felineMock);
            assertEquals(true, alex.doesHaveMane());
        }
    }
