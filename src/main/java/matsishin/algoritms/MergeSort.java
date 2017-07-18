package matsishin.algoritms;

public class MergeSort {

    public static void mergeSort(int[] ints, int min, int max) {
        if (max - min != 0) {
            if (max - min == 1) {
                if (ints[min] > ints[max])  swap(ints, min, max);
            } else {
                int mid = ((int) Math.floor((min + max) / 2));
                mergeSort(ints, min, mid);
                mergeSort(ints, mid + 1, max);
                merge(ints, min, max, mid);
            }
        }
    }

    private static void merge(int[] mas, int loverBond, int higherBond, int midlle) {
        int i = loverBond;
        while (i <= midlle) {
            if (mas[i] > mas[midlle + 1]) {
                swap(mas, i, midlle + 1);
                pushByValue(mas, midlle + 1, higherBond);
            }
            i++;
        }
    }

    private static void swap(int[] mas, int a, int b) {
        mas[a] = mas[a] ^ mas[b];
        mas[b] = mas[a] ^ mas[b];//b=a^b^b=a
        mas[a] = mas[a] ^ mas[b];//a=a^b^a=b
    }

    private static void pushByValue(int[] mas, int initialIndex, int maxAveliableIndex) {
        for (int i = initialIndex; i < maxAveliableIndex; i++) {
            if (mas[i] > mas[i + 1])
                swap(mas, i, i + 1);
        }
    }
}
