import java.util.Scanner;
public class task51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        int[] arr = new int[j];
        addElementsToArr(arr);
        System.out.println(solution(arr));
    }
    public static void addElementsToArr(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения для массива: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Элемент " + i + ": ");
            arr[i] = scanner.nextInt();
        }
    }
    public static int solution(int[] arr){
        int count = 0;
        int number = 1;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    for (int j2 = 0; j2 < arr.length; j2++) {
                        if(j2 != i && i != number  && j != j2){
                            if ((arr[j] + arr[j2]) == arr[i]) {
                                count++;
                                number = i;
                                System.out.println(arr[i] + " " + i + " - yes: " + arr[j]
                                        + "[" + j + "] + " + arr[j2] + "[" + j2
                                        + "]");

                            }
                        }
                    }

                }
            }


        }

        return count;
    }
}
// 1, 0, 2, 4, 3, 10, 8, 2, 3