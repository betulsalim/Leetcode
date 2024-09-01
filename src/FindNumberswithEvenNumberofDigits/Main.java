class Main {
    public int findNumbers(int[] nums) {
        int count = 0;

        for(int i =0; i<nums.length; i++)
        {
            int div = nums[i];
            int digitCount = 0;

            while (div > 0)
            {
                div = div / 10;
                digitCount++;
            }


            if(digitCount % 2 == 0)
            {
                count++;
            }
        }

        return count;
    }
}