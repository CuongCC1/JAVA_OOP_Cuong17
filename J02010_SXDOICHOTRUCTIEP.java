
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class J02010_SXDOICHOTRUCTIEP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i +1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tm = a[i];
                    a[i] = a[j];
                    a[j] = tm;
                }

            }
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print(a[j]+" ");
            }
            System.out.println("");
        }
    }
}
//Input
//
//Output
//
//4
//
//5 7 3 2
//
//Buoc 1: 2 7 5 3
//
//Buoc 2: 2 3 7 5
//
//Buoc 3: 2 3 5 7
//
// 
