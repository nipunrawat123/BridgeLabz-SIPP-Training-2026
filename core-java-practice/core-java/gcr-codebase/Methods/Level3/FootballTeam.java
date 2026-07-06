public class FootballTeam {
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }
        return heights;
    }
    public static int findSum(int[] heights) {

        int sum = 0;

        for (int height : heights) {
            sum += height;
        }

        return sum;
    }

    public static double findMeanHeight(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortestHeight(int[] heights) {

        int shortest = heights[0];

        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }

        return shortest;
    }

    public static int findTallestHeight(int[] heights) {

        int tallest = heights[0];

        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }

        return tallest;
    }

    public static void main(String[] args) {

        int[] heights = generateHeights(11);

        System.out.println("Player Heights:");

        for (int height : heights) {
            System.out.print(height + " ");
        }

        System.out.println();

        System.out.println("Mean Height = " + findMeanHeight(heights));
        System.out.println("Shortest Height = " + findShortestHeight(heights));
        System.out.println("Tallest Height = " + findTallestHeight(heights));
    }
}