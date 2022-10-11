package oop.parcial2.neighborhood;

import java.util.Map;
import java.util.TreeMap;
public class StreetBuilder {
    private String name;
    private Map<Integer,House> houses;

    public StreetBuilder(){
        houses=new TreeMap<>();
    }
    public StreetBuilder name(String name) {
        this.name = name;
        return this;
    }

    public StreetBuilder houses(TreeMap<Integer, House> houses) {
        this.houses = houses;
        return this;
    }
    public StreetBuilder house(int number,House house) {
        houses.put(number,house);

        return this;
    }
    public Street build(){
        return new Street(name,houses);
    }

    public StreetBuilder houses(int i, House house) {
        if(houses==null){
            this.houses=new TreeMap<>();
        }
        houses.put(i,house);
        return this;
    }
}
