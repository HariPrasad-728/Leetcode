class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();

        int i = 0;
        int j = costs.length - 1;

        // Add first candidates workers
        while (i <= j && left.size() < candidates) {
            left.offer(costs[i]);
            i++;
        }

        // Add last candidates workers
        while (i <= j && right.size() < candidates) {
            right.offer(costs[j]);
            j--;
        }

        long totalCost = 0;

        // Hire exactly k workers
        for (int session = 0; session < k; session++) {

            if (right.isEmpty() ||
                (!left.isEmpty() && left.peek() <= right.peek())) {

                totalCost += left.poll();

                // Add next worker from the left
                if (i <= j) {
                    left.offer(costs[i]);
                    i++;
                }

            } else {

                totalCost += right.poll();

                // Add next worker from the right
                if (i <= j) {
                    right.offer(costs[j]);
                    j--;
                }
            }
        }

        return totalCost;
    }
}