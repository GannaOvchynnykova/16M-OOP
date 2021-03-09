public class Count {
    public static void main(String[] args) {
        //Given a non-negative int n,
        // return the count of the occurrences of 7 as a digit,
        // so for example 717 yields 2. (no loops).
        // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
        // while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
        //Дано положительное целочисленное N.
        // Верните количество семёрок в числе.
        // 717 - вернёт 2.
        // Обратите внимание, что модуло 10 даёт вам правую цифру(126 % 10 равно 6),
        // а деление на 10 удалит правую цифру(126 / 10 равно 12).
        // Авторы задачи были к нам слишком добры и практически решили её прямов условии.
        System.out.println(count7(717));// → 2
        System.out.println(count7(7));// → 1
        System.out.println(count7(123));// → 0
        System.out.println(count7(71877));// → 3
    }

    private static int count7(int n) {
        int count = 0;
        if (n % 10 == 7) {
            count++;
        }
        if ((n / 10) % 10 == 7) {
            count++;
        }
        if (firstNumber(n / 10) == 7) {
            count++;
        }
        return count;
    }

    private static int firstNumber(int i) {
        if (i / 10 == 0)
            return i;
        return   firstNumber(i / 10);
    }
}
