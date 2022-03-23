import java.util.Scanner;

class matrix_additon1 {
    int a[][];
    int b[][];
    int sum[][];
    int m, n;

    matrix_additon1(int g, int f) {
        m = g;
        n = f;
        a = new int[m][n];
        b = new int[m][n];
        sum = new int[m][n];
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element in matrix 1");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element in matrix 2");
        for (int k = 0; k < m; k++) {
            for (int l = 0; l < n; l++) {
                b[k][l] = sc.nextInt();
            }
        }

    }

    void add_matrix() {
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                sum[x][y] = a[x][y] + b[x][y];
            }
        }

    }

    matrix_additon1 add(matrix_additon1 mm) {
        matrix_additon1 temp = new matrix_additon1(2, 2);
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                temp.sum[x][y] = sum[x][y] + mm.sum[x][y];
            }
        }
        return temp;
    }

    void display() {
        System.out.print("ELEMENTS OF MATRIX ONE\n ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            System.out.println("\n");
        }
        System.out.print("ELEMENTS OF MATRIX TWO  \n");
        for (int k = 0; k < m; k++) {
            for (int l = 0; l < n; l++) {
                System.out.print(b[k][l]);
                System.out.print("\t");
            }
            System.out.println("\n");
        }
        System.out.print("ADDITION OF TWO MATRIX \n");
        for (int k = 0; k < m; k++) {
            for (int l = 0; l < n; l++) {
                System.out.print(sum[k][l]);
                System.out.print("\t");
            }
            System.out.println("\n");
        }
    }
}

class matrix_additon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row");
        int m = sc.nextInt();
        System.out.println("Enter the size of column");
        int n = sc.nextInt();
        matrix_additon1 m1 = new matrix_additon1(m, n);
        m1.input();
        m1.add_matrix();
        m1.display();

        matrix_additon1 m2 = new matrix_additon1(m, n);
        m2.input();
        m2.add_matrix();
        m2.display();

        matrix_additon1 m3 = new matrix_additon1(m, n);
        m3 = m1.add(m2);
        m3.display();
    }

}
