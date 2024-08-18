package sorter;

public class MergeSort implements Sorter {

    @Override
    public int[] sort(int[] values) {
        // mergesort implementation
        return values;
    }

    public int[] merge(int[] left, int[] right) {
        int[]temp = new int [left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length){
            if (left[i] < right[j]){
                temp[k++] = left[i++];
            }
            else {
                temp[k++] = right[j++];
            }
        }
        while (i < left.length){
            temp[k++] = left[i++];
        }
        while (j < right.length){
            temp[k++] = right[j++];
        }
        return temp;
    }
}