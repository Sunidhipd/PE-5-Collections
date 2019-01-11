package com.stackroute.pe5test;

import com.stackroute.pe5.StringMoreThan2;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

    public class StringMoreThan2Test {
        private static StringMoreThan2 to;

        @BeforeClass
        public static void setup() {
            to = new StringMoreThan2();
        }

        @AfterClass
        public static void teardown() {
            to = null;
        }

        @Test
        public void OccurenceSuccess() {
            String s = "More than More words";
            Map<String, String> res = new HashMap<String, String>();
            res.put("More","true");
            res.put("than","false");
            res.put("words","false");
            Map<String,String> ans = to.More(s);
            assertEquals(res, ans);
        }

        @Test
        public void OccurenceFailure() {
            String s = "Hello there hello";
            Map<String, String> res = new HashMap<String, String>();
            res.put("More","true");
            res.put("than","false");
            res.put("words","false");
            Map<String, String> ans = to.More(s);
            assertNotEquals(res, ans);
        }

        @Test
        public void OccurenceEmpty() {
            String s = "";
            Map<String,String> res = new HashMap<String, String>();
            res.put("", "false");
            Map<String, String> ans = to.More(s);
            assertEquals(res, ans);

        }

    }
