public class PerformanceComparison {
    public static void main(String[] args) {
        int iterations = 1_000_000;
        String text = "hello";

        
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endBuilder = System.nanoTime();
        long durationBuilder = endBuilder - startBuilder;

        
        long startBuffer = System.nanoTime();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sf.append(text);
        }
        long endBuffer = System.nanoTime();
        long durationBuffer = endBuffer - startBuffer;

        System.out.println("Time taken by StringBuilder: " + durationBuilder / 1_000_000 + " ms");
        System.out.println("Time taken by StringBuffer: " + durationBuffer / 1_000_000 + " ms");
    }
}
