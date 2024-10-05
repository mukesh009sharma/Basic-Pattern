public class Main {
    public static void main(String[] args) {
        int height = 7;
        int width = 5;

        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) {
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }
            } else if (i == height / 2) {
                System.out.print("*");

                for (int j = 1; j < width - 1; j++) {
                    System.out.print(" ");
                }

                System.out.print("**");
            } else if (i > height / 2) {
                System.out.print("*");

                for (int j = 1; j < width - 1; j++) {
                    if (i == height - 2 && j == width - 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
