import java.util.Scanner;

public class LinearEquationSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan konstanta dan hasil setiap persamaan:");
        System.out.print("a1x + b1y + c1z = d1\na2x + b2y + c2z = d2\na3x + b3y + c3z = d3\n");
        System.out.print("Masukkan nilai a1, b1, c1, dan d1 pada persamaan pertama: \n");
        System.out.print("a1 : ");
        double a1 = input.nextDouble();
        System.out.print("b1 : ");
        double b1 = input.nextDouble();
        System.out.print("c1 : ");
        double c1 = input.nextDouble();
        System.out.print("d1 : ");
        double d1 = input.nextDouble();

        System.out.print("\nMasukkan nilai a2, b2, c2, dan d2 pada persamaan kedua  : \n");
        System.out.print("a2 : ");
        double a2 = input.nextDouble();
        System.out.print("b2 : ");
        double b2 = input.nextDouble();
        System.out.print("c2 : ");
        double c2 = input.nextDouble();
        System.out.print("d2 : ");
        double d2 = input.nextDouble();

        System.out.print("\nMasukkan nilai a3, b3, c3, dan d3 pada persamaan ketiga : \n");
        System.out.print("a3 : ");
        double a3 = input.nextDouble();
        System.out.print("b3 : ");
        double b3 = input.nextDouble();
        System.out.print("c3 : ");
        double c3 = input.nextDouble();
        System.out.print("d3 : ");
        double d3 = input.nextDouble();

        // Hitung nilai x, y, dan z dengan metode matrix determinan
        double detA = a1 * (b2 * c3 - b3 * c2) - b1 * (a2 * c3 - a3 * c2) + c1 * (a2 * b3 - a3 * b2);
        double detX = d1 * (b2 * c3 - b3 * c2) - b1 * (d2 * c3 - d3 * c2) + c1 * (d2 * b3 - d3 * b2);
        double detY = a1 * (d2 * c3 - d3 * c2) - d1 * (a2 * c3 - a3 * c2) + c1 * (a2 * d3 - a3 * d2);
        double detZ = a1 * (b2 * d3 - b3 * d2) - b1 * (a2 * d3 - a3 * d2) + d1 * (a2 * b3 - a3 * b2);

        // Cek apakah sistem persamaan linear memiliki solusi
        if (detA == 0) {
            if (detX == 0 && detY == 0 && detZ == 0) {
                System.out.println("\nSistem persamaan linear memiliki banyak solusi");
            } else {
                System.out.println("Sistem persamaan linear tidak memiliki solusi");
            }
        } else {

            // Tampilkan nilai x, y, dan z
            double x = detX / detA;
            double y = detY / detA;
            double z = detZ / detA;
            System.out.println("\nNilai x = " + x);
            System.out.println("Nilai y = " + y);
            System.out.println("Nilai z = " + z);

            System.out.printf("Himpunan penyelesaian dari persamaan di atas adalah (%1.1f, %1.1f, %1.1f)", x, y, z);

        }

        input.close();

    }
}
