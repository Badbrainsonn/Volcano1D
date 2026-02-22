public class Volcano1D {

    private static final String EMPTY = "🌴";
    private static final String VOLCANO = "🌋";
    private static final String LAVA = "🔥";

    public static void main(String[] args) {
        String[] landscape = {
                EMPTY, EMPTY, EMPTY, VOLCANO, EMPTY, EMPTY, VOLCANO, EMPTY, EMPTY
        };

        System.out.println("🌄 Initial Landscape:");
        printLandscape(landscape);

        erupt(landscape);

        System.out.println("\n🌋 After Eruption:");
        printLandscape(landscape);
    }

    public static void erupt(String[] landscape) {
        // TODO: implement eruption - modify required cells to become lava
        String Vocano = VOLCANO;
        for (int i = 0; i < landscape.length; i++)
            if (landscape[i] == Vocano)
                if (i - 1 >= 0) {
                    landscape[i - 1] = LAVA;

                    if (i + 1 < landscape.length) {
                        landscape[i + 1] = LAVA;
                    }

                }

    }

    public static void printLandscape(String[] landscape) {
        for (String cell : landscape) {
            System.out.print(cell);
        }
        System.out.println();
    }
}
