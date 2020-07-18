// Pascal's Triangle II

// Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.

// Note that the row index starts from 0.

// Input: 3
Output: [1,3,3,1]

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal = new ArrayList<List<Integer>>();
        
        pascal.add(new ArrayList<>());
        pascal.get(0).add(1);
        if (rowIndex == 0) {
            return pascal.get(0);
        }
        int k = 1;
        for (int i = 1; i<= rowIndex; i++) {
            List<Integer> layer = new ArrayList<Integer>();
            List<Integer> prevLayer = pascal.get(i-1);
            layer.add(1);
            for (int j = 1; j< i; j++) {
                layer.add(prevLayer.get(j-1) + prevLayer.get(j));
            }
            layer.add(1);
            pascal.add(layer);

            }

        return pascal.get(rowIndex);
    }
}