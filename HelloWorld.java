class HelloWorld {

    private static void printMatrix2D(int arr[][]) {
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 

        int row = 3, cols = 5;
        int matrix[][] = new int[row][cols];
        printMatrix2D(matrix);
    }
}
