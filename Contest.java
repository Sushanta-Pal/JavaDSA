public class Contest {
    public static void main(String[] args) {
        int arr[]={10,100};
        System.out.println(maximumStrongPairXOR(arr));
    }
    // public static int maximumStrongPairXor(int[] nums) {
    //     int maxXor=0;
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i;j<nums.length;j++){
    //             if (Math.abs(nums[i]-nums[j])<=Math.min(nums[i], nums[j])) {
    //                 maxXor = Math.max(maxXor, nums[i]^nums[j]);
    //             }
                
    //         }
    //     }
    //     return maxXor;
    // }
    public static int maximumStrongPairXOR(int[] nums) {
        TrieNode root = new TrieNode();

        int maxXor = 0;
        for (int num : nums) {
            insert(root, num);
            maxXor = Math.max(maxXor, findMaxXor(root, num));
        }

        return maxXor;
    }

    private static void insert(TrieNode root, int num) {
        TrieNode node = root;

        for (int i = 31; i >= 0; i--) {
            int bit = (num >>> i) & 1;
            if (node.children[bit] == null) {
                node.children[bit] = new TrieNode();
            }
            node = node.children[bit];
        }
    }

    private static int findMaxXor(TrieNode root, int num) {
        TrieNode node = root;
        int maxXor = 0;

        for (int i = 31; i >= 0; i--) {
            int bit = (num >>> i) & 1;
            int complementBit = 1 - bit;

            if (node.children[complementBit] != null) {
                maxXor |= (1 << i);
                node = node.children[complementBit];
            } else {
                node = node.children[bit];
            }
        }

        return maxXor;
    }

    static class TrieNode {
        TrieNode[] children = new TrieNode[2];
    }
}
    



