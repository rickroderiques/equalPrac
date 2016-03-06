package com.rick.cput;

import static org.junit.Assert.*;

import org.hamcrest.core.Is;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Rick on 06-Mar-16.
 */
public class equalPracTest {

    @Test
    public void testIntEqual() throws Exception {
        int a = 3;
        int b = 3;


        boolean expected = true;
        boolean actual =   equalPrac.intEqual(a,b);

        assertEquals(expected, actual);
    }
}