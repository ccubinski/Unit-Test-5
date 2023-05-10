package com.howtoprogram.junit5;
/**
 * Write a description of class LoopsPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopsPractice
{

    public boolean isPalindrome(String phrase)
    {
        int length = phrase.length();
        for(int index = 0; index < length / 2; index++)
        {
            if(!phrase.substring(index, index + 1).equals(phrase.substring(length - 1 - index, length - index)))
                return false;

        }
        return true;    
    }

    public String decToBin(int baseTen)
    {
        /*
        if (baseTen == 0)
        return "0";
        int n = 0;
        int exp = 1;
        while(exp <= baseTen)
        {   n++;
        exp *= 2;
        }
        exp /= 2;

        String result = "";

        for(int count = 0; count < n; count++)
        {
        if(baseTen / exp >= 1)
        {
        result += "1";
        baseTen -= exp;
        }
        else
        result += "0";

        exp /= 2;

        }
         */
        String result = "";

        int num = baseTen;
        
        if(num == 0)
        {
            return "0";
        }

        while(num > 0)
        {
            if(num % 2 == 1)
                result = "1" + result;
            else
                result = "0" + result;
            num /= 2;
        }

        return result;   
    }

    public boolean uniqueChar(String keyword, String loneChar)
    {

        for(int index = 1; index < keyword.length(); index++)
        {
            String current = keyword.substring(index, index + 1);
            String previous = keyword.substring(index - 1, index);

            if(current.equals(loneChar) && current.equals(previous))
                return false;
        }

        return true;
    }

    public int findPeakIndex(String peak)
    {
        int peakTarget = Integer.parseInt(peak.substring(0,1));
        int neighborL = 0;
        int neighborR = Integer.parseInt(peak.substring(1,2));
        if(peakTarget >= neighborR)
            return 0;

        for(int index = 1; index < peak.length() - 1; index++)
        {
            peakTarget = Integer.parseInt(peak.substring(index, index +1));
            neighborL = Integer.parseInt(peak.substring(index - 1, index));
            neighborR = Integer.parseInt(peak.substring(index + 1, index + 2));
            if(peakTarget >= neighborL && peakTarget >= neighborR)
                return index;
        }       
        return peak.length() - 1;
    }

    public boolean magicalNumber(int magic)
    {
        int num = magic;

        if(num == 0)
            return false;

        while (num > 0)
        {
            if(num % 10 == 0 || magic % (num % 10) != 0)
                return false;

            num = num / 10;
        }
        return true;

    }
}