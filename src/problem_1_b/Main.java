package problem_1_b;

import Utils.FileUtils;

import java.net.URISyntaxException;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        try {
            Integer increased = 0;
            List<Integer> data = FileUtils.getListContent(FileUtils.class.getClassLoader().getResource("input.txt").toURI(),Integer.class);

            Integer sum = 0, aux = 0;
            for (int i = 1; i < data.size(); i++) {
                if(i + 2 == data.size()){
                    break;
                }

                Integer previousValue = data.get(i - 1);
                Integer value = data.get(i);
                Integer nextValue = data.get(i + 1);
                Integer nextNextValue = data.get(i + 2);

                sum = previousValue + value + nextValue;
                aux = value + nextValue + nextNextValue;

                if (sum < aux ) {
                    increased++;
                }
            }

            System.out.println(increased);

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }



    }
}
