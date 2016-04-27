package other.sorting;

public class BubbleSortDoWhile {
    public static void main(String[] args) {
        Integer[] arr = {6, 5, 4, 3, 2, 1, 0};
        boolean sorted = false;

        do {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                else if (i == 0) {
                    sorted = true;
                }
            }
        } while (!sorted);
    }
}
