package other.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1, 0};

        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }

        }
    }
}
