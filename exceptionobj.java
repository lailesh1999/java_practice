import java.util.InputMismatchException;
import java.util.Scanner;

class exceptionobj {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of an array");
        try {
            size = sc.nextInt();
            int array[] = new int[size];
            System.out.print("ARRAY SIZE IS CREATED SUCESSFULLY");
        } catch (NegativeArraySizeException N) {
            System.out.println("!---ARRAY SIZE CANNOT BE ZERO---!");
        } catch (InputMismatchException N) {
            System.out.println("!----INPUT MIS MATCH ---!");
        }
    }
}
