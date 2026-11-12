class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int n = aliceSizes.length;
        int m = bobSizes.length;

        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < n; i++) {

            sumA += aliceSizes[i];
        }
        for (int j = 0; j < m; j++) {
            sumB += bobSizes[j];

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int x = aliceSizes[i];
                int y = bobSizes[j];

                if (sumA - x + y == sumB - y + x) {
                    return new int[] { x, y };
                }
            }
        }

        return new int[] {};

    }
}

//  alice and bob has diffn no of candies given in the alicesizes and bobsizes 
//  they are friends and he want to exchange own product 
// after exchange both have same total amount of candy 
// total amount of candy a person has is the sum of the number of candies in each box they have
//  return an integr array 