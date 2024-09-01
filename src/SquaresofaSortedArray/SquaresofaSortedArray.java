class SquaresofaSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] numArray = new int[nums.length];

        for(int i = 0; i <nums.length; i++)
        {
            numArray[i] = nums[i] * nums[i];
        }
        for(int j = 0; j < numArray.length - 1; j++)
        {
            for(int i = 0; i < numArray.length - 1; i++)
            {
                int temp;
                if (numArray[i] > numArray[i+1])
                {
                    temp = numArray[i];
                    numArray[i] = numArray[i+1];
                    numArray[i+1] = temp;
                }
            }
        }
        //Arrays.sort(numArray)
        return numArray;
    }
}
