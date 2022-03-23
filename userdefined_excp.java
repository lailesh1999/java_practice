import java.util.Scanner;

class userdefined extends Exception {

    String detail;

    userdefined(String detail) {
        this.detail = detail;
    }

    public String toString() {
        return "THIS EXCEPTION" + detail;
    }

}

class userdefined_excp {
    public static void main(String[] args) {
        int num = 100;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the number");
            int n = sc.nextInt();

            if (n > num) {
                throw new userdefined(" \t NUMBER IS GREATER");
            } else {
                throw new userdefined(" \t NUMNBER IS SMALLER");
            }

        } catch (userdefined ex) {
            System.out.println(ex);
        }
    }
}
