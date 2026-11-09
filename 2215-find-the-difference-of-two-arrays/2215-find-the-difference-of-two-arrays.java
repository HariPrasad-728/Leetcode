class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
         Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Store nums1 elements
        for (int num : nums1) {
            set1.add(num);
        }

        // Store nums2 elements
        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Find elements present only in nums1
        for (int num : set1) {
            if (!set2.contains(num)) {
                list1.add(num);
            }
        }

        // Find elements present only in nums2
        for (int num : set2) {
            if (!set1.contains(num)) {
                list2.add(num);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();

        answer.add(list1);
        answer.add(list2);

        return answer;
    }
}