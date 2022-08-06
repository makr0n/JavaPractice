public class Homework1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0, 6, 0, 6, 6};
        int duplicatesCount = 0;
        int indexCount = arr.length - 1;
        //Посчитаем количество нулей которые необходимо продублировать
        for (int i = 0; i <= indexCount - duplicatesCount; i++) {
            if (arr[i] == 0) {
                duplicatesCount++;
            }
        }
        int end = indexCount - duplicatesCount;
        for (int i = end; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + duplicatesCount] = 0;
                duplicatesCount--;
                arr[i + duplicatesCount] = 0;
            } else {
                arr[i + duplicatesCount] = arr[i];
            }
        }
        printArray(arr);
    }
    static public void printArray (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
