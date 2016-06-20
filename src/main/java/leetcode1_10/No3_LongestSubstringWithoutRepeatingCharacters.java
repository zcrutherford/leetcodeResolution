package leetcode1_10;import java.util.HashMap;import java.util.HashSet;import java.util.Map;import java.util.Set;/** * No3_LongestSubstringWithoutRepeatingCharacters * https://leetcode.com/problems/longest-substring-without-repeating-characters/ * * @Author zc * @Create 2016-06-20-15:52 */public class No3_LongestSubstringWithoutRepeatingCharacters {    public int lengthOfLongestSubstring(String s) {        String subString = "";        int max = 0;        char[] cs = s.toCharArray();        for(char c : cs) {            int index = subString.indexOf(c);            if(index == -1) {                subString = subString + c;            } else {                max = Math.max(max,subString.length());                subString = subString.substring(index + 1) + c;            }        }        max = Math.max(max,subString.length());        return max;    }}