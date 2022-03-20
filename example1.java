import java.util.Scanner;

class InvalidException extends Exception {
    public InvalidException(String str) {
        super(str);
    }
}

class example1 {

    static void validate(int age) throws InvalidException {
        if (age < 18) {
            throw new InvalidException("Age is not valid");

        } else {
            System.out.println("AGE is valid");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the age");
            int ag = sc.nextInt();

            validate(ag);
        } catch (InvalidException e) {
            System.out.println("Exception has occured" + e);
        }
    }

}
