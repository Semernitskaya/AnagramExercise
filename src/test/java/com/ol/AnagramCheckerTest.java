package com.ol;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Semernitskaya on 12.04.2019.
 */
public class AnagramCheckerTest {

    private AnagramChecker checker = new AnagramChecker();

    @DataProvider
    public Object[][] getTestData() {
        return new Object[][]{
                {null, null, false},
                {null, "some_string", false},
                {"a", "aa", false},
                {"a", "", false},
                {"anagram", "nagarat", false},

                {"anagram", "nagaram", true},
                {"anagram", "margana", true},
                {"a", "a", true},
                {"", "", true},
        };
    }

    @Test(dataProvider = "getTestData")
    public void testIsAnagram(String str1, String str2, boolean expectedResult) {
        assertEquals(checker.isAnagram(str1, str2), expectedResult);
    }
}