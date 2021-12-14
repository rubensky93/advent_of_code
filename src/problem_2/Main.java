package problem_2;

import Utils.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.net.URISyntaxException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            List<String> data = FileUtils.getListContent(FileUtils.class.getClassLoader().getResource("input2.txt").toURI(),String.class);
            Integer horizontalPos=0, depthPos=0, aimValue=0;
            for (int i = 0; i < data.size(); i++) {
                if(data.get(i).contains("down")){
                    //down
                    Integer value = Integer.parseInt(StringUtils.split(data.get(i), " ")[1]);
                    aimValue+= value;
                }else if (data.get(i).contains("forward")){
                    //forward
                    Integer value = Integer.parseInt(StringUtils.split(data.get(i), " ")[1]);
                    horizontalPos+= value;
                    depthPos += aimValue * value;
                }else{
                    //up
                    Integer value = Integer.parseInt(StringUtils.split(data.get(i), " ")[1]);
                    aimValue-= value;
                }
            }

            System.out.println(horizontalPos * depthPos);

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
