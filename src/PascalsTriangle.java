public class PascalsTriangle {

    public static void main(String[] args) {
        System.out.println("Pascals's triangle: "+ pascalsTriangle(6));
    }

    private static int[][] pascalsTriangle(int n) {
        int[][] intArrOuter = new int[n][];
        int i=0;

        for(;i<n; i++){
            intArrOuter[i] = new int[i+1];
            intArrOuter[i][0] = 1;
            for(int j = 0 ; j<i; j++){
                intArrOuter[i][j] = intArrOuter[i][j] + intArrOuter[i][j];
            }

        intArrOuter[i][i] = 1;
        }
       // forLoopPrint(intArrOuter);
        System.out.println(intArrOuter[2][1]);
        return intArrOuter;
    }

    private static void forLoopPrint(int[][] intArrOuter) {
        for (int i = 0; i < intArrOuter.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(intArrOuter[i][j]);
            }
            System.out.println(""+"/n");
        }
    }}
