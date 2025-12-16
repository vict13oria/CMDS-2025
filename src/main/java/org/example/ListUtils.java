package org.example;

import java.util.List;

public class ListUtils {

    /**
     * Deletes the k-th element (0-based index) from the list.
     *
     * @param list the list from which to delete
     * @param k the index to remove
     * @throws IndexOutOfBoundsException if k is invalid
     */
    public static <T> void deleteKthElement(List<T> list, int k) {
        if (k < 0 || k >= list.size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + k);
        }
        list.remove(k);
    }
}

