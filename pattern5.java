public   class pattern5 {
    public static void main(String args[]) {
        int i, j, k = 0;
        for (i = 3; i >= 1; i--) {
            for (j = 1; j <= k; j++) {
                System.out.print(" ");
            }
            k = k + 2;
            for (j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            for (j = 1; j <= i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        k = 2;
        for (i = 2; i <= 3; i++) {
            for (j = 1; j <= 4 - k; j++) {
                System.out.print(" ");
            }
            k = k + 2;
            for (j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            for (j = 1; j <= i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}


