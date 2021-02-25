import java.util.Scanner;

public class Optional {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //Citirea numarului de la tastatura
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti numarul intreg dorit:");
        int num =scan.nextInt(); //cere int
        scan.close();
        System.out.println("Numarul introdus este: " + num);

        //Cream matricea nxn
        int i,j;
        int[][] m = new int[num][num];
        for (i=0;i<num;i++) {
            for (j = 0; j < num; j++) {
                if (i == j)
                    m[i][j] = 0;
                else if(i<j) {
                    m[i][j] = (int) (Math.random() * 2);
                    m[j][i] = m[i][j];
                }
            }
        }

        /*for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        } */

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);


    }
}
