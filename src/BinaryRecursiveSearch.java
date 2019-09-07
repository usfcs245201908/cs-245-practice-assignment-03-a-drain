public class BinaryRecursiveSearch implements Practice03Search {

    public String searchName() {
        return "Binary Recursive Search";
    }

    public int search(int arr[], int target, int low, int high) {
        // When high < low, we know the target is not in the array
        if (high >= low) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid; // True if number has been found; returns index of found number
            if (arr[mid] > target) return search(arr, target, low, mid - 1); // Search subset
            return search(arr, target, mid+1 ,high);
        }
        return -1;
    }

    public int search(int[]a, int target){
        return search(a, target, 0, a.length-1);
    }

    public static void main(String[] args){
        BinaryRecursiveSearch recursiveSearch = new BinaryRecursiveSearch();
        int[] a = {1,2,4,5,6,100,134};
        System.out.println(recursiveSearch.search(a, 100));
    }
}
