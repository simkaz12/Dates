public class Dates {

    public static void main(String[] args) {
        int fromYear = 2010;
        int toYear = 2015;

        findReversables(fromYear, toYear);
    }

    public static boolean isReversable(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void findReversables(int fromYear, int toYear) {

        for (int i = fromYear; i <= toYear; i++) {
            for (int k = 1; k <= 12; k++) {
                for (int j = 1; j <= 31; j++) {

                    String date = String.format("%04d%02d%02d", i, k, j);

                    if (isReversable(date)) {
                        System.out.printf("%04d-%02d-%02d%n", i, k, j);
                    }
                }
            }
        }
    }
}