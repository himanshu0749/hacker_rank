 public static List<Integer> largestPermutation(int k, List<Integer> array) {
        int n = array.size();
        // Create a hashmap to store the current index of each element
        Map<Integer, Integer> positionMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            positionMap.put(array.get(i), i);
        }
        for (int i = 0; i < n && k > 0; i++) {
            // The value that should be at this position in the largest permutation
            int expectedValue = n - i;
            // If the expected value is already in the current position, continue
            if (array.get(i) == expectedValue) {
                continue;
            }
            // Index of the expected value
            int maxIndex = positionMap.get(expectedValue);
            // Swap the elements
            int temp = array.get(i);
            array.set(i, expectedValue);
            array.set(maxIndex, temp);
            positionMap.put(temp, maxIndex);
            positionMap.put(expectedValue, i);
            k--;
        }
        
        return array;
    }
    
   
}        
