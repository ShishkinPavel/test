import java.util.Scanner;
// количество проходов головки жесткого диска между блоками памяти
// нужно ввести количество блоков, их номера в порядке расположения на диске, далее будет произведен расчет движений
// головки жесткого диска между блоками для восстановления удаленных данных
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int size = input.nextInt();
        int[] blocks = new int[size];
        System.out.println("Введите числа: ");
        for (int i = 0; i < size ; i++) {
            blocks[i] = input.nextInt();
        }
        int nextPosition, count = 0, position = 0;

        for (int i = 1; i <= blocks.length; i++) {
            nextPosition = findPosition(blocks, i);
            count += (Math.abs(position - nextPosition));
            position = nextPosition;
        }
        System.out.println(count);
    }

    private static int findPosition(int[] blocks, int block) {
        for (int i = 0; i < blocks.length; i++) {
            if (blocks[i] == block) return i;
        }
        return 0;
    }
}
