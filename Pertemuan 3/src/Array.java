public class Array {
    public static void main(String[] args) {
        // One Dimensional Arrays
        int[] firstArray = {2, 5, 3};
        int[] secondArray = {9, 5, 3};
        int[] thirdArray = {2, 4, 9};
        int[] fourthArray = {10, 11, 12};
        int[] fifthArray = {13, 14, 15};
        int[] sixthArray = {16, 17, 18};
        int[] seventhArray = {19, 20, 21};
        int[] eighthArray = {22, 23, 24};
        int[] ninthArray = {25, 26, 27};

        // Array 2 Dimensi
        int[][] twoDimensionalArray1 = {firstArray, secondArray, thirdArray};
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};

        // Array 3 Dimensi
        int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};

        // Loop
        for (int i = 0; i < threeDimensionalArray.length; i++) {
            System.out.print("{");
            for (int j = 0; j < threeDimensionalArray[i].length; j++) {
                System.out.print("{");
                for (int k = 0; k < threeDimensionalArray[i][j].length; k++) {
                    System.out.print(threeDimensionalArray[i][j][k] + " ");
                }
                System.out.print("} ");
            }
            System.out.println("}");
        }
    }
}

