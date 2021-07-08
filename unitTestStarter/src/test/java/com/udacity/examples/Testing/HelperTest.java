package com.udacity.examples.Testing;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HelperTest {

    @Test
    public void verify_getCount()
    {
        List<String> list= Arrays.asList("123"," ","245");
        final long count= Helper.getCount(list);
        assertEquals(3, count);

    }

    @Test
    public void verify_getstats()
    {
        List<Integer> yrsOfExperience = Arrays.asList(2,4,9);
        List<Integer> squaredVal=Arrays.asList(4,16,81);
        List<Integer> squaredlist=Helper.getSquareList(yrsOfExperience);
        assertEquals(squaredVal,squaredlist);
    }

    @Test
    public void verify_getMergedList()
    {
        List<String> empName=Arrays.asList("abc","34","sda");
        List<String> mergedList=Arrays.asList("abc,34,sda");
        assertEquals("abc, 34, sda",Helper.getMergedList(empName));
    }

    @Test
    public void verify_getStringsOfLength3()
    {
        List<String> arr=Arrays.asList("abc","def","abcd");
        assertEquals(2,Helper.getStringsOfLength3(arr));
    }
}
