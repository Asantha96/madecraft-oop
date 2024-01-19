import org.junit.Test;
import static org.junit.Assert.*;
public class BetterArrayListTest {
    @Test
    public void testPop(){
        BetterArrayList<Integer> betterArrayList = new BetterArrayList<>();

        betterArrayList.add(1);
        betterArrayList.add(30);
        betterArrayList.add(11);

        assertEquals("[1, 30, 11]", betterArrayList.toString());

        int poppedElement = betterArrayList.pop();
        assertEquals(11, poppedElement);
        assertEquals("[1, 30]", betterArrayList.toString());


    }
    @Test(expected = IllegalArgumentException.class)
    public void testPopEmptyList(){
        BetterArrayList<Integer> emptyList = new BetterArrayList<>();
        emptyList.pop();
    }

    public static void main(String[] args) {
        BetterArrayListTest betterArrayListTest = new BetterArrayListTest();
        betterArrayListTest.testPop();
        betterArrayListTest.testPopEmptyList();
    }
}
