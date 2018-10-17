package com;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergerTest {
    private Merger merger;

    @Before
    public void setUp() throws Exception {
        merger = new Merger();
    }

    @Test
    public void testMergeTwoSortedArrays() {
        int[] firstSortedArray = {1, 3, 6, 8, 9};
        int[] secondSortedArray = {1, 2, 4, 5};

        int[] expectedCombinedArray = {1, 1, 2, 3, 4, 5, 6, 8, 9};

        assertTrue(Arrays.equals(expectedCombinedArray, merger.mergeTwoSortedArrays(firstSortedArray, secondSortedArray)));
    }
}
