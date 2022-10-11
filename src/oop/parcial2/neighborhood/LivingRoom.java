package oop.parcial2.neighborhood;

public class LivingRoom extends Room{
    private int windows;
    private boolean tv;
    private boolean homeTeather;

    LivingRoom(int width, int height, String color, int windows, boolean tv, boolean homeTeather) {
        super(width, height, color);
        this.windows = windows;
        this.tv = tv;
        this.homeTeather = homeTeather;
    }

    public int getWindows() {
        return windows;
    }

    public boolean isTv() {
        return tv;
    }

    public boolean isHomeTeather() {
        return homeTeather;
    }
}
