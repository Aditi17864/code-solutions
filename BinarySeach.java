public class BinarySeach {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 90;
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                found = true;
                break;
            } 
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (found) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }
        
    }
}
