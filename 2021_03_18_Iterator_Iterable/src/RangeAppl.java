public class RangeAppl {
    public static void main(String[] args) {
        int min = 11;
        int max = 25;
        Range range = new Range(min, max);

        for (Integer x: range){
            System.out.print(x + " ");
        }

        //RangeIterator ri = new RangeIterator(range);
        //while (ri.hasNext()){
           // System.out.print(ri.next() + " ");
       // }
    }
}
