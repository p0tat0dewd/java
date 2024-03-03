

public class arr {

    public static void main(String[] args) {
        double[][] ir_array = new double [3][];
        ir_array[0] = new double[5];
        ir_array[1] = new double[3];
        ir_array[2] = new double[2];
        for (int i = 0; i < 5; i++) {
            ir_array[0][i] = (i + 1) * 10;
        }

        for (int i = 0; i < 3; i++) {
            ir_array[1][i] = (i + 1) * 5;
        }

        for (int i = 0; i < 2; i++) {
            ir_array[2][i] = (i + 1) * 2;
        }
        System.out.println("ir_array[0][4] = " + ir_array[0][4]);
        System.out.println("ir_array[1][2] = " + ir_array[1][2]);
        System.out.println("ir_array[2][1] = " + ir_array[2][1]);
        System.out.println("");
        System.out.println("Iterating Through the Ragged Array");
        for (int arrayofArrayIndex = 0;
             arrayofArrayIndex < ir_array.length;
             arrayofArrayIndex++) {

            for (int ArrayOfDoubleIndex = 0;
                 ArrayOfDoubleIndex < ir_array[arrayofArrayIndex].length;
                 ArrayOfDoubleIndex++) {
                System.out.print(
                        ir_array[arrayofArrayIndex][ArrayOfDoubleIndex]
                                + " ");
            }
            System.out.println("");
        }
    }
}