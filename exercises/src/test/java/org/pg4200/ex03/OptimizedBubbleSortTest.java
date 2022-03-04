package org.pg4200.ex03;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptimizedBubbleSortTest {

    //array.clone()
    String[] firstArray = new String[] {"c", "b", "a", "d", "e", "f"};
    private OptimizedBubbleSort sorter = new OptimizedBubbleSort();

    private class StringComparator implements Comparator<String>{
        @Override
        public int compare (String s1, String s2){
            return s1.compareTo(s2);
        }
    }

    @Test
    public void testSorted(){
        String[] array = firstArray.clone();

        sorter.sort(array, new StringComparator(), false);

        assertEquals("a", array[0]);
        assertEquals("b", array[1]);
        assertEquals("c", array[2]);
        assertEquals("d", array[3]);
        assertEquals("e", array[4]);
        assertEquals("f", array[5]);

    }

    @Test
    public void testOptimized(){
        String[] array = firstArray.clone();

        sorter.sort(array, new StringComparator(), true);

        assertEquals("a", array[0]);
        assertEquals("b", array[1]);
        assertEquals("c", array[2]);
        assertEquals("d", array[3]);
        assertEquals("e", array[4]);
        assertEquals("f", array[5]);

    }

    @Test
    public void testGameUsers(){

        GameUser a = new GameUser("a", 10);
        GameUser b = new GameUser("b", 5);
        GameUser c = new GameUser("c", 2);
        GameUser d = new GameUser("d", 5);

        GameUser[] array = {a,b,c,d};

        sorter.sort(array, new GameUserComparator(), true);

        assertEquals("c", array[0].getUserId());
        assertEquals("b", array[1].getUserId());
        assertEquals("d", array[2].getUserId());
        assertEquals("a", array[3].getUserId());
    }
}
