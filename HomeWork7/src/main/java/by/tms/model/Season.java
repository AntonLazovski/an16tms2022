package by.tms.model;

public enum Season {
    Winter(-10), Spring(+10), Summer(+20), Autumn(+5);
    private final int temp;

    Season(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }
}