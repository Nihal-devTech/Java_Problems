public class july {
    public static void uniqChar(String s) {
        int charCount[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt( i )-'a');
            charCount[s.charAt(i) - 'a']++;

        }

    }

    public static void main(String args[]) {
        uniqChar("leetcode");
    }
}
