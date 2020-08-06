// Flower Planting With No Adjacent

// You have N gardens, labelled 1 to N.  In each garden, you want to plant one of 4 types of flowers.

// paths[i] = [x, y] describes the existence of a bidirectional path from garden x to garden y.

// Also, there is no garden that has more than 3 paths coming into or leaving it.

// Your task is to choose a flower type for each garden such that, for any two gardens connected by a path, they have different types of flowers.

// Return any such a choice as an array answer, where answer[i] is the type of flower planted in the (i+1)-th garden.  The flower types are denoted 1, 2, 3, or 4.  It is guaranteed an answer exists.

 

// Example 1:

// Input: N = 3, paths = [[1,2],[2,3],[3,1]]
// Output: [1,2,3]
// Example 2:

// Input: N = 4, paths = [[1,2],[3,4]]
// Output: [1,2,1,2]
// Example 3:

// Input: N = 4, paths = [[1,2],[2,3],[3,4],[4,1],[1,3],[2,4]]
// Output: [1,2,3,4]


class Solution {
    public int[] gardenNoAdj(int N, int[][] paths) {
        
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        
        for (int i = 1; i<=N; i++) {
            map.put(i,new HashSet<Integer>());
        }
        
        for (int i = 0; i<paths.length; i++) {
            map.get(paths[i][0]).add(paths[i][1]);
            map.get(paths[i][1]).add(paths[i][0]);
        }
        
        int result[] = new int[N];
        
        for (int i = 1; i <=N; i++) {
            HashSet<Integer> neighbour = new HashSet<>();
            System.out.println("i "+map.get(i));
            for (int n : map.get(i)) {
                neighbour.add(result[n-1]);
            }
            for (int j = 1; j<=4; j++) {
                if(!neighbour.contains(j)) {
                    result[i-1] = j;
                    break;
                }
            }
        }
        return result;
    }
}