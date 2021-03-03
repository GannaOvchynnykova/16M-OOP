public class Recursion {
    //We have bunnies standing in a line, numbered 1, 2, … The odd bunnies (1, 3, ..) have the normal 2 ears.
    // The even bunnies (2, 4, ..) we’ll say have 3 ears, because they each have a raised foot.
    // Recursively return the number of “ears” in the bunny line 1, 2, … n (without loops or multiplication).
    //У нас есть очередь из кроликов и мы получаем количество стоящих в этой очереди кроликов.
    // У нечётных кроликов по два уха. А у чётных кроликов вроде как по три уха.
    // Это из-за того, что они все подняли ногу. Посчитайте количество видимых нами “ушей”.
    // Не использовать циклы или умножение.
    public static void main(String[] args) {
        System.out.println(bunnyEars2(0)); //0
        System.out.println(bunnyEars2(1));//→ 2
        System.out.println(bunnyEars2(2));//→ 5

        System.out.println(bunnyEars(0)); //0
        System.out.println(bunnyEars(1));//→ 2
        System.out.println(bunnyEars(2));//→ 5
    }

    private static int bunnyEars(int rabbit) {
        if (rabbit == 0) return 0;
        if (rabbit == 1) return 2;
        return 5 + bunnyEars(rabbit-2);
    }

    private static int bunnyEars2(int rabbit) {
        if (rabbit % 2 == 0){
            return rabbit/2 * (2 + 3);
        }else {
            return rabbit/2 * (2 + 3) +2;
        }
    }
}
