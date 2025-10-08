class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
         int i = 0, j = 0;
       int[] res = new int[spells.length];
        while (i < spells.length) {

            if((long) spells[i] * potions[j] >= success){
                res[i] = res[i] + 1;
            }
            j = (j == potions.length - 1) ? 0 : j + 1;
            if (j == 0) i++;
        }
    return res;}
}
