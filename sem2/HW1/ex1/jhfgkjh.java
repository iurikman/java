public class jhfgkjh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the count of numbers, please: ");
        int countNumbers = scanner.nextInt();
//        int count = 0;
        int summ = 0;
        boolean flag = true;
        int j = 2;
        int i = 2;
        while (i <= countNumbers) {
            while (flag) {
                if (i % j == 0) {
                    i++;
                    j = 1;
                }
                else if (j > i - 1) {
                    summ += i;
                    i++;
                    j = 1;
                    flag = false;
                }
                j++;
            }
        }
        System.out.println(summ);
    }
    }
}
