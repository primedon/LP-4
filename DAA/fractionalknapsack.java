import java.util.Arrays;
import java.util.Comparator;

class Item {
    int weight;
    int value;

    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

 class FractionalKnapsack {

    public static double getMaxValue(Item[] items, int capacity) {
        // Sort items by value-to-weight ratio (descending order)
        Arrays.sort(items, new Comparator<Item>() {
            public int compare(Item a, Item b) {
                double r1 = (double) a.value / a.weight;
                double r2 = (double) b.value / b.weight;
                return Double.compare(r2, r1);
            }
        });

        double totalValue = 0.0;
        int currentWeight = 0;

        for (Item item : items) {
            if (currentWeight + item.weight <= capacity) {
                // Take full item
                currentWeight += item.weight;
                totalValue += item.value;
            } else {
                // Take fractional part
                int remain = capacity - currentWeight;
                totalValue += ((double) item.value / item.weight) * remain;
                break; // Knapsack is full
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        int capacity = 50; // Total capacity of knapsack

        Item[] items = {
            new Item(10, 60),
            new Item(20, 100),
            new Item(30, 120)
        };

        double maxValue = getMaxValue(items, capacity);
        System.out.println("Maximum value in Knapsack = " + maxValue);
    }
}