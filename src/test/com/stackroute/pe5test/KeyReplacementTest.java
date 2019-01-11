package com.stackroute.pe5test;

import com.stackroute.pe5.KeyReplacement;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class KeyReplacementTest {
    private static KeyReplacement to;

    @BeforeClass
    public static void setup() {
        to = new KeyReplacement();
    }

    @AfterClass
    public static void teardown() {
        to = null;
    }

    @Test
    public void OccurenceSuccess() {
        Map<Object, String> map = new HashMap<Object, String>();
        map.put("More", "true");
        map.put("than", "false");
        Map<Object, String> res = new HashMap<Object, String>();
        res.put("More", "");
        res.put("than", "true");
        Map<Object, String> ans = to.replace(map);
        assertEquals(res, ans);
    }


    @Test
    public void OccurenceFailure() {
        Map<Object, String> map = new HashMap<Object, String>();
        map.put("More", "true");
        map.put("than", "false");
        Map<Object, String> res = new HashMap<Object, String>();
        res.put("More", "");
        res.put("than", "");
        Map<Object, String> ans = to.replace(map);
        assertNotEquals(res, ans);
    }

}
