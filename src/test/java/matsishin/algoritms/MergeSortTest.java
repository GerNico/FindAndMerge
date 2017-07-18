package matsishin.algoritms;

import org.junit.Test;

import java.util.Arrays;

import static matsishin.algoritms.MergeSort.mergeSort;
import static org.junit.Assert.*;


public class MergeSortTest {

    @Test
    public void simpleTest(){
        int[] mas={371, 128, 309, 406, 952, 163, 720, 508, 379, 975, 3, 225, 309, 478,
        280, 328, 562, 996, 254, 298};
        int[] expectedMas={3, 128, 163, 225, 254, 280, 298, 309, 309, 328, 371, 379, 406, 478,
        508, 562, 720, 952, 975, 996};
        mergeSort(mas,0,mas.length-1);
        assertEquals(mas.length,expectedMas.length);
        for (int i = 0; i < mas.length; i++) {
            assertEquals(mas[i],expectedMas[i]);
        }
    }

}