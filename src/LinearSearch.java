public class LinearSearch implements Practice03Search {

    public String searchName() {
        return "Linear Search";
    }

    public int search(int[] a, int target){
        for(int i=0; i< a.length-1; i++){
            if(a[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        LinearSearch linearSearch = new LinearSearch();
        int[] a = {1, 10, 100, 10000, 5};
        System.out.println(linearSearch.search(a, 1));
    }
}
