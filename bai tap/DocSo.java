import java.util.Scanner;

public class DocSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("mot");
                break;
            case 2:
                System.out.println("hai");
                break;
            case 3:
                System.out.println("ba");
                break;
            case 4:
                System.out.println("bon");
                break;
            case 5:
                System.out.println("nam");
                break;
            default:
                System.out.println("out of ability");
                break;
        }
    }
}
