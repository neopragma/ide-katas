package com.neopragma.idekatas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongConditionalTest {

    private LongConditional longConditional;

    @Before
    public void beforeEach() {
        longConditional = new LongConditional();

    }

    @Test
    public void strings_that_start_with_ABC_are_Category_A_in_the_0_to_9_range_when_boolean_is_true() {
        assertEquals("Category A", longConditional.method1("ABCDEF", 5, true));
    }

    @Test
    public void strings_that_do_not_start_with_ABC_are_Category_B_in_the_0_to_9_range_when_boolean_is_true() {
        assertEquals("Category B", longConditional.method1("BCDEF", 5, true));
    }

    @Test
    public void strings_that_start_with_ABC_are_Category_C_in_the_0_to_9_range_when_boolean_is_false() {
        assertEquals("Category C", longConditional.method1("ABCDEF", 5, false));
    }

    @Test
    public void strings_that_do_not_start_with_ABC_are_Category_D_in_the_0_to_9_range_when_boolean_is_false() {
        assertEquals("Category D", longConditional.method1("BCDEF", 5, false));
    }

    @Test
    public void strings_that_start_with_ABC_are_Category_E_in_the_10_to_19_range_when_boolean_is_true() {
        assertEquals("Category E", longConditional.method1("ABCDEF", 15, true));
    }

    @Test
    public void strings_that_do_not_start_with_ABC_are_Category_F_in_the_10_to_19_range_when_boolean_is_true() {
        assertEquals("Category F", longConditional.method1("BCDEF", 15, true));
    }

    @Test
    public void strings_that_start_with_ABC_are_Category_G_in_the_10_to_19_range_when_boolean_is_false() {
        assertEquals("Category G", longConditional.method1("ABCDEF", 15, false));
    }

    @Test
    public void strings_that_do_not_start_with_ABC_are_Category_H_in_the_10_to_19_range_when_boolean_is_false() {
        assertEquals("Category H", longConditional.method1("BCDEF", 15, false));
    }

    @Test(expected=IllegalArgumentException.class)
    public void null_input_string_results_in_IllegalArgumentException() {
        longConditional.method1(null, 1, true);
    }

    @Test(expected=IllegalArgumentException.class)
    public void empty_input_string_results_in_IllegalArgumentException() {
        longConditional.method1("", 1, true);
    }

    @Test(expected=IllegalArgumentException.class)
    public void intArg_below_zero_results_in_IllegalArgumentException() {
        longConditional.method1("ABCDE", -1, true);
    }

    @Test(expected=IllegalArgumentException.class)
    public void intArg_above_19_results_in_IllegalArgumentException() {
        longConditional.method1("ABCDE", 20, true);
    }
}

