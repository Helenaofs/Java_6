import java.util.Objects;

public class Notebook {
    private int RAM;
    private int HDD;
    private String OS;
    private String colour;

    public Notebook(int ram, int hdd, String os, String colour) {
        this.RAM = ram;
        this.HDD = hdd;
        this.OS = os;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Ноутбук <" +
                "Оперативная память: " + RAM +
                ", Жесткий диск: " + HDD +
                ", Операционная система: '" + OS + '\'' +
                ", Цвет: '" + colour + '\'' +
                '>';
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Notebook))
            return false;
        else
            return Objects.equals(((Notebook) o).RAM, RAM) && Objects.equals(((Notebook) o).HDD, HDD) && Objects.equals(((Notebook) o).OS, OS) && Objects.equals(((Notebook) o).colour, colour);
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}