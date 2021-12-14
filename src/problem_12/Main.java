package problem_12;

import org.apache.commons.lang3.StringUtils;
import problem_12.Cave;

import java.util.List;

public class Main {

    String caves = "start-A\n" +
            "start-b\n" +
            "A-c\n" +
            "A-b\n" +
            "b-d\n" +
            "A-end\n" +
            "b-end";

    public static void main(String[] args) {
    }

    public void generateCaves(){
        List<String> entrances;
        List<String> exits;

        String[] cavesInput = StringUtils.split("-");
        for (int i = 0; i < cavesInput.length; i++) {
            Cave cave = new Cave();
            if (i%2 == 0){
                cave.setEntrance(cavesInput[i]);
            }else{
                cave.setExit(cavesInput[i]);
            }
        }

    }
    public void connectCaves(List<Cave> caves){

    }
    public boolean isConnected(Cave entrance, Cave exit){
        return entrance.getConnections().contains(exit);
    }

}
