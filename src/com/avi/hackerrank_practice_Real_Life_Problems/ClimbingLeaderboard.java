import javax.naming.spi.DirStateFactory;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class ClimbingLeaderboard {
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> list = new ArrayList<>();
        final List<Integer> filtered = ranked.stream().distinct().collect(Collectors.toList());
        player.forEach(item -> {
            int found = Collections.binarySearch(filtered, item, Comparator.reverseOrder());
            if (found == -1) {
                found = 1;
            } else if (found < -1) {
                found = -(found);
            } else {
                found = found + 1;
            }
            list.add(found);
        });
        return list;
    }


    public static void main(String[] args) throws IOException {
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());*/

        ArrayList<Integer> ranked = new ArrayList<>(
                Arrays.asList(100,90,90,80,75,60));
        ArrayList<Integer> player = new ArrayList<>(
                Arrays.asList(50,65,77,90,102));

        List<Integer> result = climbingLeaderboard(ranked, player);
        System.out.println(result+"resultantant list");

        /*bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();*/


    }
}
