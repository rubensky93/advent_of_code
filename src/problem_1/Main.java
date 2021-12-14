package problem_1;

import Utils.FileUtils;

import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {



    public static void main(String[] args) {
        try {
            Integer increased = 0;
            List<Integer> data = FileUtils.getListContent(FileUtils.class.getClassLoader().getResource("input.txt").toURI(),Integer.class);

            for (int i = 1; i < data.size(); i++) {
                Integer previousValue = data.get(i - 1);
                if (previousValue < data.get(i)) {
                    increased++;
                }
            }

            System.out.println(increased);

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }



    }
}
