import org.example.ListUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ListUtilsTest {
    @Test
    public void testDeleteKthElement() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));

        // Delete element at index 2 ("c")
        ListUtils.deleteKthElement(list, 2);

        List<String> expected = Arrays.asList("a", "b", "d");
        assertEquals(expected, list);
    }

    @Test
    public void testDeleteFirstElement() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30));
        ListUtils.deleteKthElement(list, 0);
        List<Integer> expected = Arrays.asList(20, 30);
        assertEquals(expected, list);
    }

    @Test
    public void testDeleteLastElement() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ListUtils.deleteKthElement(list, 3);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, list);
    }

    @Test
    public void testInvalidIndex() {
        List<String> list = new ArrayList<>(Arrays.asList("x", "y"));
        assertThrows(IndexOutOfBoundsException.class, () -> ListUtils.deleteKthElement(list, 5));
    }
}
