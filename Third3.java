public class Third3 {
        public static void main(String[] args) {
            int number = 10;
            System.out.print("Дільники числа " + number + ": ");

            for (int i = 1; i <= number; i++) {
                if (number % i == 0 && i > 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }


