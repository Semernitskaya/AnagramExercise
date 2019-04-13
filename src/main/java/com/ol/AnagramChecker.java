package com.ol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * Created by Semernitskaya on 12.04.2019.
 */
public class AnagramChecker {

    final Logger logger = LoggerFactory.getLogger(AnagramChecker.class);

    public boolean isAnagram(String str1, String str2) {
        logger.info("Checking anagram for strings [{}] and [{}]", str1, str2);
        if (str1 == null || str2 == null) {
            logger.warn("Null string can't be an anagram");
            return false;
        }
        if (str1.length() != str2.length()) {
            logger.info("Strings have different length");
            return false;
        }
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }
        return true;
    }
}
