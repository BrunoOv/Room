package oop.parcial2.neighborhood;
import java.util.List;
public class House {
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private List<RestRoom> restRoomList;
    private List<BedRoom> bedRoomList;

    House(Kitchen kitchen, DiningRoom diningRoom, LivingRoom livingRoom, List<RestRoom> restRoomList, List<BedRoom> bedRoomList) {
        this.kitchen = kitchen;
        this.diningRoom = diningRoom;
        this.livingRoom = livingRoom;
        this.restRoomList = restRoomList;
        this.bedRoomList = bedRoomList;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public List<RestRoom> getRestRoomList() {
        return restRoomList;
    }

    public List<BedRoom> getBedRoomList() {
        return bedRoomList;
    }
    public static HouseBuilder builder(){
        return new HouseBuilder();
    }
}
