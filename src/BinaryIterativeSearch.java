public class BinaryIterativeSearch implements Practice03Search {

    public String searchName() {
        return "Binary Iterative Search";
    }

    /**
     * Binary Search iterative implementation
     * @param a Array to search
     * @param target Target number to search for in array a
     * @return target number if found, -1 if not
     */
    public int search(int[] a, int target){
        int low = 0;
        int high = a.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(a[mid] == target){
                return mid;
            }
            if(target > a[mid]){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        BinaryIterativeSearch search = new BinaryIterativeSearch();
        int[] a = {1, 5, 6, 10, 3};
        System.out.println(search.search(a, 10 ));
    }
}
