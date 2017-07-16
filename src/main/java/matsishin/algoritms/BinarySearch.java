package matsishin.algoritms;

public class BinarySearch {

    public static int ordinaryBinarySearch(int[] mass, int target) {
        int lowerBound = 0;
        int higherBound = mass.length - 1;
        while (lowerBound <= higherBound) {
            int middle = lowerBound + (higherBound - lowerBound) / 2;
            if (target < mass[middle]) higherBound = middle - 1;
            else if (target > mass[middle]) lowerBound = middle + 1;
            else return middle;
        }
        return -1;
    }

    public static int newBinarySearch(int[] mass, int target) {
        int lowerBound = 0;
        int higherBound = mass.length - 1;
        while (lowerBound <= higherBound) {
            int middle = lowerBound + (higherBound - lowerBound) / 2;

            if (mass[lowerBound] > mass[higherBound]) {

                if (mass[lowerBound] < mass[middle]) {

                    if (target < mass[middle] && target >= mass[lowerBound]) {
                        higherBound = middle - 1;
                    } else if (mass[middle] != target) lowerBound = middle + 1;else return middle;
                } else {
                    if (target > mass[middle] && target <= mass[higherBound]) {
                        lowerBound = middle + 1;
                    } else if (mass[middle] != target) higherBound = middle - 1;else return middle;
                }
            } else {
                if (target < mass[middle]) higherBound = middle - 1;
                else if (target > mass[middle]) lowerBound = middle + 1;
                else return middle;
            }
        }
        return -1;
    }


}
