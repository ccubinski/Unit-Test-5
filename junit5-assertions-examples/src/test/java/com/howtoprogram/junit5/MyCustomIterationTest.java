package com.howtoprogram.junit5;
import java.io.*;
import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.fail;

public class MyCustomIterationTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private LoopsPractice myLP1; //Default

    @BeforeAll
    public void setUp() {
        myLP1 = new LoopsPractice();
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    public void tearDown() {
        myLP1 = null;
        System.setOut(originalOut);
    }

    //racecar - True
    @Test
    public void testPalindrome1() {
        //expected, actual
        boolean expected = true;
        boolean actual = myLP1.isPalindrome("racecar");
        assertEquals(expected, actual);
    }

    //dad - True
    @Test
    public void testPalindrome2() {
        //expected, actual
        boolean expected = true;
        boolean actual = myLP1.isPalindrome("dad");
        assertEquals(expected, actual);
    }

    //B - True
    @Test
    public void testPalindrome3() {
        //expected, actual
        boolean expected = true;
        boolean actual = myLP1.isPalindrome("B");
        assertEquals(expected, actual);
    }

    //hello - false
    @Test
    public void testPalindrome4() {
        //expected, actual
        boolean expected = false;
        boolean actual = myLP1.isPalindrome("hello");
        assertEquals(expected, actual);
    }

    //Racecar - false
    @Test
    public void testPalindrome5() {
        //expected, actual
        boolean expected = false;
        boolean actual = myLP1.isPalindrome("Racecar");
        assertEquals(expected, actual);
    }

    //37 - 100101
    @Test
    public void testDecToBin1() {
        //expected, actual
        String expected = "100101";
        String actual = myLP1.decToBin(37);
        assertEquals(expected, actual);
    }

    //64 - 1000000
    @Test
    public void testDecToBin2() {
        //expected, actual
        String expected = "1000000";
        String actual = myLP1.decToBin(64);
        assertEquals(expected, actual);
    }

    //0 - 0
    @Test
    public void testDecToBin3() {
        //expected, actual
        String expected = "0";
        String actual = myLP1.decToBin(0);
        assertEquals(expected, actual);
    }

    //1 - 1
    @Test
    public void testDecToBin4() {
        //expected, actual
        String expected = "1";
        String actual = myLP1.decToBin(1);
        assertEquals(expected, actual);
    }

    //2 - 10
    @Test
    public void testDecToBin5() {
        //expected, actual
        String expected = "10";
        String actual = myLP1.decToBin(2);
        assertEquals(expected, actual);
    }

    //"abcddef", "c", true
    @Test
    public void testUniqueChar1() {
        //expected, actual
        boolean expected = true;
        boolean actual = myLP1.uniqueChar("abcddef", "c");
        assertEquals(expected, actual);
    }

    //"abcddef", "d", false
    @Test
    public void testUniqueChar2() {
        //expected, actual
        boolean expected = false;
        boolean actual = myLP1.uniqueChar("abcddef", "d");
        assertEquals(expected, actual);
    }

    //"llabcll", "l", false
    @Test
    public void testUniqueChar3() {
        //expected, actual
        boolean expected = false;
        boolean actual = myLP1.uniqueChar("llabcll", "l");
        assertEquals(expected, actual);
    }

    //"abcdedcbabcdedcbabcdde", "b", true
    @Test
    public void testUniqueChar4() {
        //expected, actual
        boolean expected = true;
        boolean actual = myLP1.uniqueChar("abcdedcbabcdedcbabcdde", "b");
        assertEquals(expected, actual);
    }

    //"abcdedcbabcdedcbabcdde", "d", false
    @Test
    public void testUniqueChar5() {
        //expected, actual
        boolean expected = false;
        boolean actual = myLP1.uniqueChar("abcdedcbabcdedcbabcdde", "d");
        assertEquals(expected, actual);
    }

    //"9123456", 0
    @Test
    public void testFindPeakIndex1() {
        //expected, actual
        int expected = 0;
        int actual = myLP1.findPeakIndex("9123456");
        assertEquals(expected, actual);
    }

    //"1238456", 3
    @Test
    public void testFindPeakIndex2() {
        //expected, actual
        int expected = 3;
        int actual = myLP1.findPeakIndex("1238456");
        assertEquals(expected, actual);
    }

    //"123343999999", 2
    @Test
    public void testFindPeakIndex3() {
        //expected, actual
        int expected = 2;
        int actual = myLP1.findPeakIndex("123343999999");
        assertEquals(expected, actual);
    }

    //"12343999999", 3
    @Test
    public void testFindPeakIndex4() {
        //expected, actual
        int expected = 3;
        int actual = myLP1.findPeakIndex("12343999999");
        assertEquals(expected, actual);
    }

    //"123456789", 8
    @Test
    public void testFindPeakIndex5() {
        //expected, actual
        int expected = 8;
        int actual = myLP1.findPeakIndex("123456789");
        assertEquals(expected, actual);
    }

    //"128", true
    @Test
    public void testMagicalNumber1() {
        //expected, actual
        boolean expected = true;
        boolean actual = myLP1.magicalNumber(128);
        assertEquals(expected, actual);
    }

    //"127", false
    @Test
    public void testMagicalNumber2() {
        //expected, actual
        boolean expected = false;
        boolean actual = myLP1.magicalNumber(127);
        assertEquals(expected, actual);
    }

    //"102", false
    @Test
    public void testMagicalNumber3() {
        //expected, actual
        boolean expected = false;
        boolean actual = myLP1.magicalNumber(102);
        assertEquals(expected, actual);
    }

    //"0", false
    @Test
    public void testMagicalNumber4() {
        //expected, actual
        boolean expected = false;
        boolean actual = myLP1.magicalNumber(0);
        assertEquals(expected, actual);
    }

    //"2222", true
    @Test
    public void testMagicalNumber5() {
        //expected, actual
        boolean expected = true;
        boolean actual = myLP1.magicalNumber(2222);
        assertEquals(expected, actual);
    }

}