public class SuccessfulPairsOfSpellsAndPotions {
    public static void main(String[] args) {

        int [] r1 = {3,1,2};
        int [] r2 = {8,5,8};
        Solution solution = new Solution();
        int []res =solution.successfulPairs(r1,r2,16);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
