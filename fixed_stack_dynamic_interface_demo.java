import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

interface dynamic_stack_inter {
    public void push();

    public void pop();

    public void display();
}

class dynamic_stack implements dynamic_stack_inter {
    int a[];
    int item, top, m;

    dynamic_stack(int n) {
        top = -1;
        m = n;
        a = new int[m];
    }

    public void push() {
        if (top == m - 1) {
            int temp[] = new int[m * 2];
            for (int i = 0; i <= top; i++) {
                temp[i] = a[i];
            }
            m = m * 2;
            a = temp;
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("ENter the elelemt ");
            int item = sc.nextInt();
            top = top + 1;
            a[top] = item;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("STACK IS EMPTY");
        } else {
            item = a[top];
            System.out.println("DLETED ELELEMT" + item);
            top = top - 1;
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("STACK IS EMPTY");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(a[i]);
            }
        }
    }
}

class fixed_stack implements dynamic_stack_inter {
    int a[];
    int item, top, m;

    fixed_stack(int n) {
        top = -1;
        m = n;
        a = new int[m];
    }

    public void push() {
        if (top == m - 1) {
            System.out.println("STACK IS FULL");

        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("ENter the elelemt ");
            int item = sc.nextInt();
            top = top + 1;
            a[top] = item;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("STACK IS EMPTY");
        } else {
            item = a[top];
            System.out.println("DLETED ELELEMT" + item);
            top = top - 1;
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("STACK IS EMPTY");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(a[i]);
            }
        }
    }

}

class fixed_stack_dynamic_interface_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size if array");
        int n = sc.nextInt();
        dynamic_stack ds = new dynamic_stack(n);
        fixed_stack fs = new fixed_stack(n);
        while (true) {
            System.out.println("1)DYNAMIC STACK 2) FIXED STACK 3) EXIT");
            System.out.println("ENTER YOUR CHOICE");
            int ch1 = sc.nextInt();
            if (ch1 == 1) {
                while (true) {
                    System.out.println("1) PUSH 2)POP 3) DISPLAY 4) EXIT");
                    System.out.println("ENTER YOUR CHOICE ");
                    int ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                            ds.push();
                            break;
                        case 2:
                            ds.pop();
                            break;
                        case 3:
                            ds.display();
                            break;
                        case 4:
                            System.exit(0);
                        default:
                            System.out.println("Wrong choice");
                    }
                }
            } else if (ch1 == 2) {
                while (true) {
                    System.out.println("1) PUSH 2)POP 3) DISPLAY 4) EXIT");
                    System.out.println("ENTER YOUR CHOICE ");
                    int ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                            fs.push();
                            break;
                        case 2:
                            fs.pop();
                            break;
                        case 3:
                            fs.display();
                            break;
                        case 4:
                            System.exit(0);
                        default:
                            System.out.println("Wrong choice");
                    }
                }

            } else if (ch1 == 3) {
                System.exit(0);
            } else {
                System.out.println("INVALID CHOICE");
            }
        }

    }
}