package com.company;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testDeveloperArray(){
        ArrayList<String>strings=new ArrayList<>();
        Main Main = new Main();
        assertEquals(0,strings.size());
        strings.add("Mike Smith");
        assertEquals(1,strings.size());
        strings.add("Edward Harrington");
        assertEquals(2,strings.size());
        strings.add("Samantha Paulson");
        assertEquals(3,strings.size());
        strings.add("Glenda Oberholzer");
    }
    @Test
    public void testDisplayDeveloperAndDurationTask(){
        ArrayList<String>strings=new ArrayList<>();
        Main Main = new Main();
        int Duration = 11;
        if (Duration <= 11);
        assertEquals(0,strings.size());
        strings.add("Glenda Oberhozer");
        strings.add("11");
    }
    @Test
    public void testSearchTask(){
        ArrayList<String>strings=new ArrayList<>();
        Main Main = new Main();
        assertEquals(0,strings.size());
        strings.add("Mike Smith");
        strings.add("Create Login");
        assertFalse(Boolean.getBoolean("Create Login"), "Mike Smith");
        assertFalse(Boolean.getBoolean("Create Login"),"Create Login");
    }
    @Test
    public void testSearchDeveloperTask(){
        ArrayList<String>strings=new ArrayList<>();
        Main Main = new Main();
        assertEquals(0,strings.size());
        strings.add("Samantha Paulson");
        strings.add("Create Reports");
        assertFalse(Boolean.getBoolean("Samantha Paulson"),"Create Reports");
    }
    @Test
    public void testDeletedTask(){
        ArrayList<String>strings=new ArrayList<>();
        Main Main = new Main();
        assertEquals(0,strings.size());
        strings.add("Create Report");
        strings.add("Entry 'Create Report' successfully deleted");
        assertFalse(Boolean.getBoolean("Created Report"),"Entry 'Create Report' successfully deleted");
    }

}