import java.util.Scanner;
import java.util.function.Consumer;
public class Transmission extends CarDetail implements Cloneable{

    private int gears;
    private float transRatio;
    public Transmission() {
        Auto car = new Auto();
        brand = car.getBrand();
        model = car.getModel();
        typeTrans = car.getTypeTrans();
        gosNumber = car.getGosNumber();
        gears = 0;
        transRatio = 0;
        installDate = "Не указано";
        prodСountry = "Не указано";
    }
    public Transmission(String installDate, String prodСountry, int gears, float transRatio, String brand, String model, int typeTrans, String gosNumber) {
        Auto car= new Auto(brand,  model, typeTrans, gosNumber);
        this.brand = car.getBrand();
        this.model = car.getModel();
        this.typeTrans = car.getTypeTrans();
        this.gosNumber = car.getGosNumber();
        this.gears = gears;
        this.transRatio = transRatio;
        this.installDate = installDate;
        this.prodСountry = prodСountry;
    }


    @Override
    public String getDetailName() {
        return "Transmission";
    }

    @Override
    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tВвод данных КПП\n");
        Consumer<Auto> input = Auto::input;
        System.out.print("Введите кол-во передач: ");
        gears = scanner.nextInt();
        System.out.print("Введите передаточное число: ");
        transRatio = scanner.nextFloat();
        System.out.print("Введите дату установки: ");
        installDate = scanner.nextLine();
        System.out.print("Введите страну производителя: ");
        prodСountry = scanner.nextLine();
        this.gears = gears;
        this.transRatio = transRatio;
        this.prodСountry = prodСountry;
        this.installDate = installDate;
    }
    @Override public String toString()  {
        String st  = "\tИнформация о детали\nМодель машины: " + this.getModel() +"\tСтрана производитель: " + this.prodСountry + "\tКол-во передач: " + Integer.toString(this.gears) +"\tПередаточное число: " + Float.toString(this.transRatio) +"\n\n";
        return st;
    }
    @Override public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}