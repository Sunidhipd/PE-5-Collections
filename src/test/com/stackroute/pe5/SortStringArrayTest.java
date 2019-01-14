package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SortStringArrayTest {
    private static SortStringArray srt;

    @BeforeClass
    public static void setup(){
        srt= new SortStringArray();
    }

    @AfterClass
    public static void teardown(){
        srt=null;
    }

    @Test
    public void sortStringSuccess() {
        String s="Hello ram there you are!";
        List<String> w=new ArrayList<String>();
        w.add("Hello");
        w.add("are!");
        w.add("ram");
        w.add("there");
        w.add("you");
        List<String> f=srt.Sort(s);
        assertEquals(w,f);
    }

    @Test
    public void sortStringFailure() {
        String s="Hello ram there you are!";
        List<String> w=new ArrayList<String>();
        w.add("Hello");
        w.add("are!");
        w.add("ram");
        w.add("there");
        List<String> f=srt.Sort(s);
        assertNotEquals(w,f);
    }

    @Test
    public void sortStringNotNull() {
        String s="";
        List<String> w=new ArrayList<String>();
        w.add("");
        List<String> f=srt.Sort(s);
        assertEquals(w,f);
    }
    @Test
    public void sortStringNull() {
        String s="";
        List<String> w=new ArrayList<String>();
        w.add("Wrong");
        List<String> f=srt.Sort(s);
        assertNotEquals(w,f);
    }

}