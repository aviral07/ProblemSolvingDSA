import java.util.*;

public class printAllPairsWithGivenSum {


    static List<List<Integer>> printPairs(int arr[], int n, int sum) {

        // Store counts of all elements in map m
        HashMap<Integer, Integer> mp
                = new HashMap<Integer, Integer>();
        List<List<Integer>> pairs = new ArrayList<>();
        // Traverse through all elements
        for (int i = 0; i < n; i++) {

            // Search if a pair can be formed with
            // arr[i].
            int complement = sum - arr[i];
            if (mp.containsKey(complement)) {
                // int count = mp.get(complement);

                pairs.add(new ArrayList<>(Arrays.asList(complement, arr[i])));


            }
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        return pairs;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 3, 4,1};
        int n = arr.length;
        int sum = 5;

        List<List<Integer>> result = printPairs(arr, n, sum);
        System.out.println(result);

    }
}
