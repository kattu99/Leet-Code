/* 
Suppose you have a long flowerbed in which some of the plots are planted and some are not. However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.

Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.

Note:
1. The input array won't violate no-adjacent-flowers rule.
2. The input array size is in the range of [1, 20000].
3. n is a non-negative integer which won't exceed the input array size.

*/


class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int[] duplicate = flowerbed;
        if (duplicate.length>1) {
            for (int i=0; i<duplicate.length;i++) {
                    if (i == 0 && duplicate[i]==0 && duplicate[i+1] == 0) {
                        count += 1;
                        duplicate[i] = 1;
                    }
                    else if (i == duplicate.length-1 && duplicate[i]==0 && duplicate[i-1] == 0) {
                        count += 1;
                        duplicate[i] = 1;
                    }
                    else if(i != 0 && i !=duplicate.length-1) {
                        if(duplicate[i+1] == 0 && duplicate[i-1] == 0 && duplicate[i] == 0) {     
                            count += 1;
                            duplicate[i] = 1;
                        }
                    }
                }
        }
        else {
            if (duplicate[0] == 0) {
                count = 1;
            }
        }
        if (n>count) {
            return false;
        }
        else {
            return true;
        }
    }
}