// Prison Cells After N Days
// There are 8 prison cells in a row, and each cell is either occupied or vacant.

// Each day, whether the cell is occupied or vacant changes according to the following rules:

// If a cell has two adjacent neighbors that are both occupied or both vacant, then the cell becomes occupied.
// Otherwise, it becomes vacant.

// Input: cells = [0,1,0,1,1,0,0,1], N = 7
// Output: [0,0,1,1,0,0,0,0]

class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int[] cellCopy = new int[cells.length];

        for (int i=0; i<N; i++) {
            System.arraycopy(cells, 0, cellCopy, 0,cells.length);
            cells[0] = 0;
            for (int j=1; j<=cells.length-2; j++) {

                cells[j] = cellCopy[j-1] == cellCopy[j+1] ? 1 : 0;
            }
            cells[cells.length-1] = 0;
        }

        return cells;
    }
}
