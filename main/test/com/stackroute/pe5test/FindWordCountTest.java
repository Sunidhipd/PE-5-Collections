package com.stackroute.pe5test;

import com.stackroute.pe5main.FindWordCount;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class FindWordCountTest {
    private static FindWordCount to;

    @BeforeClass
    public static void setup() {
        to = new FindWordCount();
    }

    @AfterClass
    public static void teardown() {
        to = null;
    }

    @Test
    public void OccurenceSuccess() {
        String s = "Using HashMaps in Java Programs:";
        Map<String, Integer> res = new HashMap<String, Integer>();
        res.put("Java", 1);
        res.put("in", 2);
        res.put("Using", 1);
        res.put("Programs", 1);
        res.put("HashMaps", 1);
        Map<String, Integer> ans = to.count(s);
        assertNotEquals(res, ans);
    }

    @Test
    public void OccurenceFailure() {
        String s = "Using HashMaps in Java Programs";
        Map<String, Integer> res = new HashMap<String, Integer>();
        res.put("Programs", 1);
        res.put("Java", 1);
        res.put("in", 2);
        res.put("Using", 1);
        res.put("HashMaps", 1);
        Map<String, Integer> ans = to.count(s);
        assertEquals(res, ans);
    }

    @Test
    public void OccurenceEmpty() {
        String s = "";
        Map<String, Integer> res = new HashMap<String, Integer>();
        res.put("", 1);
        Map<String, Integer> ans = to.count(s);
        assertEquals(res, ans);

    }

}