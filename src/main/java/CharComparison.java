public class CharComparison {
    /**
     * Given an array of char, determine if the array A belongs to the left or to the right of char array B lexigraphically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     * cat < car < care
     * You will need to compare an index of both arrays against each other as you iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
     */
    public int compare(char[] a, char[] b){
        int minLength = Math.min(a.length, b.length); // Find the minimum length of arrays
        
        for (int i = 0; i < minLength; i++) {
            if (a[i] < b[i]) {
                return -1; // A is less than B
            } else if (a[i] > b[i]) {
                return 1;  // A is greater than B
            }
            // If characters at the current index are equal, continue to the next index
        }
        
        // If we reach this point, the common prefix is identical, so check the lengths
        if (a.length < b.length) {
            return -1; // A is a prefix of B, so A is less than B
        } else if (a.length > b.length) {
            return 1;  // B is a prefix of A, so A is greater than B
        }
        
        return 0; // Arrays are identical
    }
}
