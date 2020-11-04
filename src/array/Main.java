package array;
import java.util.Arrays;


    public class Main {
        private static String ExceptionResult;

        public static void main(String[] args) {


            System.out.println("\r\n1 - задание");
            int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = arr1[i] == 1 ? 0 : 1;
                System.out.print(arr1[i] + " ");
            }


            System.out.println("\r\n2 - задание");
            int[] massiv = new int[8];
            for (int i = 0; i < massiv.length; i++) {
                massiv[i] = 3 * i;
                System.out.print(massiv[i] + " ");


            }

            //1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1
            System.out.println("\r\n3 - задание");
            int[] massivnuy = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < massivnuy.length; i++) {

                if (massivnuy[i] < 6) {
                    massivnuy[i] *= 2;
                    System.out.print(massivnuy[i] + " ");

                }


            }

            /*System.out.println("\r\n4 - задание");

            int[][] dvoechka=new int[6][6];

            for(int i=0; i< dvoechka.length;i++){
                for(int j=i; j< dvoechka.length-1;j++){



                }*/
            System.out.println("\r\n4 - задание");
            int[][] dvoechka = new int[7][7];
            for (int i = 0; i < dvoechka.length; i++) {
                for (int j = 0, j2 = dvoechka[i].length; j < dvoechka[i].length; j++, j2--) {
                    if (i == j || i == (j2 - 1)) dvoechka[i][j] = 1;
                    System.out.print(dvoechka[i][j] + " ");
                }
                System.out.print("\r\n");


            }

            System.out.println("\r\n5 - задание");
            int[] sort = {6, 9, 0, 1, 8};
            System.out.println(Arrays.toString(sort));//массив до сортировки
            Arrays.sort(sort);
            System.out.println(Arrays.toString(sort));//массив после сортировки


            System.out.println("Максимальный символ  " + sort[4]);// первый 'лемент массива имеет номер 0
            System.out.println("Минимальный символ  " + sort[0]);


            int[] metmass = {10, 1, 4, 6, 23, 0};

            boolean SumRes = Result(metmass);

            System.out.println("Результат" + SumRes);


            int[] sdvigMass = {15, 12, 4, 6, 8, 234, 1, 90, 4, 3};
            int sdvig = 4;

            int Sdvig = Otvet(sdvigMass, sdvig);


        }


        private static boolean Result(int[] arrParam) {
            int leftSum, rightSum;
            for (int i = 0; i < arrParam.length + 1; i++) {

                leftSum = 0;
                rightSum = 0;

                for (int j = 0; j < i; j++) {
                    leftSum += arrParam[j];

                }
                for (int j = i; j < arrParam.length; j++) {
                    rightSum = arrParam[j];

                }
                if (leftSum == rightSum) {
                    return true;
                }

            }
            return false;


        }

        private static int Otvet(int[] sdvigMass, int sdvig) {
            for (int i : sdvigMass)

                System.out.print(i + " ");
            System.out.println("\r\n");

            if (sdvig > 0) {
                for (int x = 0; x < sdvig; x++) {
                    int buf = sdvigMass[sdvigMass.length - 1];
                    if (sdvigMass.length - 1 >= 0) {
                        System.arraycopy(sdvigMass, 0, sdvigMass, 1, sdvigMass.length - 1);
                        sdvigMass[0] = buf;
                    }
                    for (int i : sdvigMass) {
                        System.out.print(i + " ");
                        System.out.println(" ");
                        {
                        }
                    }
                    if (sdvig < 0) {
                        for (int y = 0; y > sdvig; y--) {
                            int buyf = sdvigMass[0];
                            System.arraycopy(sdvigMass, 1, sdvigMass, 0, sdvigMass.length - 1);
                            sdvigMass[sdvigMass.length - 1] = buyf;

                            for (int i : sdvigMass)
                                System.out.print(i + " ");
                            System.out.print("\r\n");
                        }
                    }
                }


            }
           return sdvig;


        }
    }
