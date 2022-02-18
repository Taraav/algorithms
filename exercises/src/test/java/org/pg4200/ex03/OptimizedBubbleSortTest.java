package org.pg4200.ex03;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptimizedBubbleSortTest {

    //array.clone()
    String[] array = new String[] {"c", "b", "a", "d", "e", "f"};
    private OptimizedBubbleSort sort = new OptimizedBubbleSort();

    private class StringComparator implements Comparator<String>{
        @Override
        public int compare
    }

    @Test
    public void testSorted(){
        String[] newArray = new String[] {"c", "b", "a", "d", "e", "f"};

        int number = sort.sort(array);

        assertEquals("a", array[0]);
        assertEquals("b", array[1]);
        assertEquals("c", array[2]);
        assertEquals("d", array[3]);
        assertEquals("e", array[4]);
        assertEquals("f", array[5]);

    }
}
