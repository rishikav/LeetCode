// Kth Largest Element in an Array

Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        while (n>(nums.length-k)) {
            n--;
        }
        return nums[n];
    }
}

class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        for(int i=k-1;i>=0;i--){
            heapify(nums,k,i);
        }
        
        
        for(int i=k;i<nums.length;i++){
            if(nums[i]>nums[0]){
                nums[0]=nums[i];
                heapify(nums,k,0);
            }
        }
        
        return nums[0];
    }
    
    
    void heapify(int[] arr, int n, int i){
        int smallest = i;
        int left = 2*i +1;
        int right = 2*i +2;
        
        if(left<n && arr[left]<arr[smallest]){
            smallest=left;
        }
        if(right<n && arr[right]<arr[smallest]){
            smallest=right;
        }
        if(smallest!=i){
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
            heapify(arr,n,smallest);
        }
    }
}