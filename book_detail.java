import java.util.Scanner;

class book {
    String author_name, title;
    int price;

    book() {
        author_name = "AAA";
        title = "BB";
        price = 20;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the author name :");
        author_name = sc.next();
        System.out.println("Eneter the title name:");
        title = sc.next();
        System.out.println("Enter book price");
        price = sc.nextInt();
    }

    void display() {
        System.out.println("AUTHOR NAME :" + author_name);
        System.out.println("TITLE:" + title);
        System.out.println("PRICE:" + price);
    }

    book add(book bb) {
        book temp = new book();
        temp.price = price + bb.price;
        return temp;
    }
}

class book_detail {
    public static void main(String[] args) {
        book b1 = new book();
        b1.display();
        book b2 = new book();
        b2.input();
        b2.display();
        book b3 = new book();
        b3.input();
        b3.display();
        book b4 = new book();
        b4 = b2.add(b3);
        System.out.println("TOTAL PRICE OF TWO BOOK:" + b4.price);

        int total_price = 0;
        book b7[] = new book[4];
        for (int i = 0; i < b7.length; i++) {
            b7[i] = new book();
            b7[i].input();
            total_price = total_price + b7[i].price;
        }
        System.out.println("TOTAL PRICE OF ALL BOOKS ARE:" + total_price);
    }
}
