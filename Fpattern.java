public class Main {
    public static void main(String[] args) {
        int height = 7;
        int width = 5;

        for (int i = 0; i < height; i++) {
            System.out.print("*");

            if (i == 0 || i == height / 2) {
                for (int j = 0; j < width - 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
