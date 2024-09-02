class DublicateZeros {
    public void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length = arr.length - 1;

        // Step 1: Find the number of zeros to be duplicated
        for (int left = 0; left <= length - possibleDups; left++) {
            if (arr[left] == 0) {
                // Edge case: if a zero is found at the boundary, it won't be duplicated
                if (left == length - possibleDups) {
                    arr[length] = 0; // Just copy it without duplication
                    length -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        // Step 2: Start from the end and shift elements
        int last = length - possibleDups;

        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0; // Duplicate zero
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }
}