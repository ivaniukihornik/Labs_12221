import java.util.Arrays;

// Variant 7:
// реалізувати алгоритм для вставки елемента в конкретну позицію в масиві.
public class PasteToArray {
    public static void insertElementToArray(int[] array, int element, int index) {
        int minValidIndex = 0;
        int maxValidIndex = array.length - 1;
        boolean insertCondition = index >= minValidIndex && index <= maxValidIndex;
        if (insertCondition) {
            array[index] = element;
        }
    }

    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int newElement = 10;
        int validIndexOfNewElement = 5;
        int invalidIndexOfNewElement1 = -1;
        int invalidIndexOfNewElement2 = 9;

        System.out.println("Initial array: " + Arrays.toString(intArray));

        insertElementToArray(intArray, newElement, invalidIndexOfNewElement1);
        System.out.println("Array after attempt of inserting new element to index less than minimal available: " +
                Arrays.toString(intArray));

        insertElementToArray(intArray, newElement, invalidIndexOfNewElement2);
        System.out.println("Array after attempt of inserting new element to index bigger than minimal available: " +
                Arrays.toString(intArray));

        insertElementToArray(intArray, newElement, validIndexOfNewElement);
        System.out.println("Array after inserting new element to good index: " + Arrays.toString(intArray));
    }
}
