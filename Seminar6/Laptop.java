public class Laptop {
    private String name;
    private int ram;
    private int hdd;
    private String os;
    private String colour;

    public Laptop(String name, int ram, int hdd, String os, String colour){
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.colour = colour;
    }

    public int getRAM() {return  ram;}
    public int getHDD() {return  hdd;}
    public String getOS() {return os;}
    public String getColour() {return  colour;}


    @Override
    public String toString(){
        return String.format("\nНоутбук: %s \n RAM: %d Гб \n Объем жесткого диска: %d Гб \n Операционная система: %s \n Цвет: %s \n", name, ram, hdd, os, colour);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return  true;
        }
        if(!(obj instanceof Laptop)) {
            return false;
        }
        Laptop laptop = (Laptop) obj;
        return name.equals(laptop.name) && ram == laptop.ram && hdd == laptop.hdd && os.equals(laptop.os) && colour.equals(laptop.colour);

    }

    public int hashCode(){
        return 9*name.hashCode() + 15*ram + 7*hdd + 6*os.hashCode() + 11*colour.hashCode();
    }
}
