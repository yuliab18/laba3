public class Fifth3 {
    public static void main(String[] args) {
        int a2 = 0;
        for (int s = 0; s < 24; s++) {
            for (int h = 0; h < 60; h++) {
                int a3 = s / 10;
                int a4 = s % 10;
                int a5 = h / 10;
                int a6 = h % 10;
                if (a3 == a5 && a4 == a6 && a6 < 5) {
                    a2++;
                }
            }

        }
        System.out.println("Результат:" + a2);
    }
}
