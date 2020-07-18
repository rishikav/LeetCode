// Pascal's Triangle

// Input: 5
// Output:
// [
//      [1],
//     [1,1],
//    [1,2,1],
//   [1,3,3,1],
//  [1,4,6,4,1]
// ]


class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> pascal = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return pascal;
        }
        pascal.add(new ArrayList<>());
        pascal.get(0).add(1);
        int k = 1;
        for (int i = 1; i< numRows; i++) {
            List<Integer> layer = new ArrayList<Integer>();
            List<Integer> prevLayer = pascal.get(i-1);
            layer.add(1);
            for (int j = 1; j< i; j++) {
                layer.add(prevLayer.get(j-1) + prevLayer.get(j));
            }
            layer.add(1);
            pascal.add(layer);

            }

        
        return pascal;
        
    }
}