package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class UpdateAndEmptyArrayTest {
    private static UpdateAndEmptyArray to;

    @BeforeClass
    public static void setup() {
        to = new UpdateAndEmptyArray();
    }

    @AfterClass
    public static void teardown() {
        to = null;
    }

    @Test
    public void modify() {
        List<String> a=new ArrayList<>();
        List<String> b=new ArrayList<>();
        assertEquals(a,to.modify(a,b));
    }
}