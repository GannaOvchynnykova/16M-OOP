public class Exercise {
    public static void main(String[] args) {
        int [] newArray = CoctailSort.createArray(10);
        int [] secondArray = new int[]{100, 5, 36, 56, 90, 3, 5, 68};
        int [] defaultArray = new int[10];

        int[] idealArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int [] newUnsortedArray = unSortArray(idealArray);
        CoctailSort.myPrint(newUnsortedArray);
        //unSortArray(idealArray);
    }

    private static int[] unSortArray(int[] idealArray) {
        // y nas esto sort array
        //nado peremeshat randomno
        // 1. sozdadim new array tot length
        //2. V nego bydem perepisivaem dannie
        //3. po ishodnomy array mi idem fori
        //4. generiryem slychainoe chislo v diaposone length( Math random)
        //5. esli indeks slychainogo chisla v new array est+, to generiryem chislo snova
        int [] output = new int[idealArray.length];
        int count = 0;
        for (int i = 0; i < idealArray.length ; i++) {
            int temp = generatorRandomIndex(idealArray.length);
            while (output[temp] != 0){
                count++;
                temp = generatorRandomIndex(idealArray.length);
            }
            output[temp] = idealArray[i];
        }
        System.out.println("Kolvo ras " + count);
        return output;
    }

    private static int generatorRandomIndex(int diaposon) {
        return (int) (Math.random()*diaposon);
    }
}
