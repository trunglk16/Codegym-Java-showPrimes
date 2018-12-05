public class showPrime {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Nhap gioi han can kiem tra");
        int range = input.nextInt();
        int j;
        int i;


        for (j = 0; j < range; j++) {
            boolean flag = true;

            if (j < 2) {
                flag = false;
            } else if (j == 2) {
                flag = true;
            } else if (j % 2 == 0) {
                flag = false;
            } else {
                for (i = 3; i < j; i += 2) {
                    if (j % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag) {
                System.out.print(j + " ");
            }

        }
    }
}

