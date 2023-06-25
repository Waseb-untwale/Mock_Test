public class problem2 {
    public static int firstUniqChar(String s) {
        int[] frequency = new int[26]; // Array to store character frequency
        
        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }
        
        // Find the index of the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        return -1; // Return -1 if no unique character is found
    }
    
    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + firstUniqChar(s1));
        
        String s2 = "loveleetcode";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + firstUniqChar(s2));
        
        String s3 = "aabb";
        System.out.println("Input: " + s3);
        System.out.println("Output: " + firstUniqChar(s3));
    }
}

   
