 class Mergesor {

    static void merge(int arr[], int st, int mid, int end) {

        int i = st;
        int j = mid + 1;
        int k = 0;

        int temp[] = new int[end - st + 1];

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // copy back to original array
        for (int x = 0; x < temp.length; x++) {
            arr[st + x] = temp[x];
        }
    }

    static void mergesort(int arr[], int st, int end) {
        if (st < end) {
            int mid = (st + end) / 2;

            mergesort(arr, st, mid);
            mergesort(arr, mid + 1, end);

            merge(arr, st, mid, end);
        }
    }

    public static void main(String args[]) {

        int arr[] = {9, 8, 7, 5, 2};

        mergesort(arr, 0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
