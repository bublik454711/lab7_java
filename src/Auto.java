import java.util.Scanner;

public class Auto implements Cloneable{
    protected String brand;
    protected String model;
    protected int typeTrans;
    protected String gosNumber;

    public Auto() {
        brand = "Не указано";
        model = "Не указано";
        typeTrans = 0;
        gosNumber = "Не указано";
    }

    public Auto(String brand, String model, int typeTrans, String gosNumber) {
        this.brand = brand;
        this.model = model;
        this.typeTrans = typeTrans;
        this.gosNumber = gosNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getTypeTrans() {
        return typeTrans;
    }

    public String getGosNumber() {
        return gosNumber;
    }

    public void setTypeTrans(int typeTrans) {
        this.typeTrans = typeTrans;
    }
    public void setGosNumber(String gosNumber) {
        this.gosNumber = gosNumber;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tВвод данных авто");
        System.out.print("Введите марку машины: ");
        brand = scanner.nextLine();
        System.out.print("Введите модель машины: ");
        model = scanner.nextLine();
        System.out.print("Введите тип трансмиссии(1-механика, 2-автомат): ");
        typeTrans = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        System.out.print("Введите гос. номер: ");
        gosNumber = scanner.nextLine();
    }
    @Override public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override public String toString()  {
        String st  = "\tИнформация о машине\n" + "Марка: " + brand + "\tМодель: " + model + "\tТип трансмиссии(1-механика, 2-автомат): " + typeTrans + "\tГос. номер:"+gosNumber+"\n";
        return st;
    }
}