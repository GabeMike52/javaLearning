public class BinarySearch {
    static int binarySearch(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;
        while(low <= high) {
            int mid = (low + high)/2;
            int guess = list[mid];
            if(guess == item) {
                return mid;
            } else if(guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return item;
    }
    public static void main(String args[]) {
        int[] list = new int[10];
        for(int i = 0; i < 10 ; i++) {
            list[i] = i + 1;
        }
        int item = 4;
        System.out.println(binarySearch(list, item));
    }
}