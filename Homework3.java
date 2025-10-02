import java.util.Scanner;

class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 0;
        int i;

        System.out.println("입력 받을 정수의 개수 : ");
        size = sc.nextInt();

        int[] num = new int[size];

        System.out.println("정수 입력 : ");
        for(i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        int min; int max;
        min = max = num[0];

        for(i = 0; i < size; i++) {
            if (min > num[i])
                min = num[i];
            if (max < num[i])
                max = num[i];
        }

        System.out.printf("최대값 : %d\n", max);
        System.out.printf("최소값 : %d\n", min);
    }
}