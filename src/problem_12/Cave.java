package problem_12;

import java.util.ArrayList;
import java.util.List;

public class Cave {
    String entrance;
    String exit;
    List<Cave> connections = new ArrayList<>();

    public String getEntrance() {
        return entrance;
    }

    public void setEntrance(String entrance) {
        this.entrance = entrance;
    }

    public String getExit() {
        return exit;
    }

    public void setExit(String exit) {
        this.exit = exit;
    }

    public List<Cave> getConnections() {
        return connections;
    }

    public void setConnections(List<Cave> connections) {
        this.connections = connections;
    }
    public int getConnectionSize(){
        return connections.size();
    }
    public boolean isMayorCave(String caveName){
        return caveName.toUpperCase().equals(caveName);
    }
}
