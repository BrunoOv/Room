package oop.parcial2.neighborhood;
import java.util.Map;
import java.util.TreeMap;
public class Street {
    private String name;
    private Map<Integer,House> houses;

    public Street(String name, Map<Integer, House> houses) {
        this.name = name;
        this.houses = houses;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, House> getHouses() {
        return houses;
    }
    public House getHouse(int number){
        return null;
    }
    public static StreetBuilder builder(){
        return new StreetBuilder();
    }

}
