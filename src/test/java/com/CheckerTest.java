package com;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CheckerTest {
    private Checker checker;

    @Before
    public void setUp() throws Exception {
        this.checker = new Checker();
    }

    @Test
    public void testCheckParenthesesOrder() {
        String initialStringWithRightOrder = "{{[cc(c)ggg]}ssss}";
        String initialStringWithWrongOrder = "{{[cc(c)ggg]}ssss}{";

        assertTrue(checker.checkParenthesesOrder(initialStringWithRightOrder));
        assertFalse(checker.checkParenthesesOrder(initialStringWithWrongOrder));
    }
}
