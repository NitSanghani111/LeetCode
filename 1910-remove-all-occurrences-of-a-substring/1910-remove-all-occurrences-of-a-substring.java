class Solution {
    public String removeOccurrences(String s, String part) {
        // Loop until the string contains the substring 'part'
        while (s.contains(part)) {
            // Replace the first occurrence of 'part' with an empty string
            s = s.replaceFirst(part, "");
        }
        // Return the modified string after all occurrences of 'part' have been removed
        return s;
    }
}
