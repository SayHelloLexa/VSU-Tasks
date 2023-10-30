import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int arr [] = ArrayUtils.readIntArrayFromConsole();
        int sum = 0;
        if (check(arr) == true){
            System.out.println(Arrays.toString(arr));
            System.out.println(indexOfMaxChet(arr) + " " + arr[indexOfMaxChet(arr)]);
            System.out.println(indexOfMaxNechet(arr) + " " + arr[indexOfMaxNechet(arr)]);
            System.out.println(sum(arr));

        } else System.out.println("ошибка");
    }
    public static int indexOfMaxChet(int[] arr) {
        if (arr == null || arr.length == 0)
            return -1;

        int indexMaxChet = 0;  // индекс максимального элемента
        // (за максимум вначале принимаем
        //  первый [0] элемент массива)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                // если нашли элемент
                // больше запомненного максимума
                indexMaxChet = i;
            }
        }

        return indexMaxChet;
    }
    public static int indexOfMaxNechet(int[] arr) {
        if (arr == null || arr.length == 0)
            return -1;

        int indexMaxNechet = 0;  // индекс максимального элемента
        // (за максимум вначале принимаем
        //  первый [0] элемент массива)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                // если нашли элемент
                // больше запомненного максимума
                indexMaxNechet = i;
            }
        }

        return indexMaxNechet;
    }
    public static boolean check(int [] arr){
        for (int i=0; i < arr.length; i++)
            if (arr[i] % 2 == 0) {
                return true;
            }
        return false;
    }
    public static int sum(int[] arr){
        int sum = 0;
        for (int x = indexOfMaxChet(arr)+1; x < indexOfMaxNechet(arr); x ++){
            sum += arr[x];
//            System.out.println(x);
        }
        return sum;
    }

}
