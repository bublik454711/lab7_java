import java.util.Scanner;
import java.util.function.Consumer;

public class Engine extends CarDetail implements Cloneable{

    private int horsePower;
    private int capacity;
    public Engine() {
        Auto car = new Auto();
        brand = car.getBrand();
        model = car.getModel();
        typeTrans = car.getTypeTrans();
        gosNumber = car.getGosNumber();
        horsePower = 0;
        capacity = 0;
        installDate = "Не указано";
        prodСountry = "Не указано";
    }
    public Engine(String installDate, String prodСountry, int horsePower, int capacity, String brand, String model, int typeTrans, String gosNumber) {
        Auto car= new Auto(brand,  model, typeTrans, gosNumber);
        this.brand = car.getBrand();
        this.model = car.getModel();
        this.typeTrans = car.getTypeTrans();
        this.gosNumber = car.getGosNumber();
        this.horsePower = horsePower;
        this.capacity = capacity;
        this.installDate = installDate;
        this.prodСountry = prodСountry;
    }


    @Override
    public String getDetailName() {
        return "Engine";
    }

    @Override
    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tВвод данных двигателя\n");
        Consumer<Auto> input = Auto::input;
        System.out.print("Введите мощность двигателя в л.с.: ");
        horsePower = scanner.nextInt();
        System.out.print("Введите объем двигателя в л: ");
        capacity = scanner.nextInt();
        System.out.print("Введите дату установки: ");
        installDate = scanner.nextLine();
        System.out.print("Введите страну производителя: ");
        prodСountry = scanner.nextLine();
        this.horsePower = horsePower;
        this.capacity = capacity;
        this.prodСountry = prodСountry;
        this.installDate = installDate;
    }
    @Override public String toString()  {
        String st  = "\tИнформация о детали\nМодель машины: " + this.getModel() +"\tСтрана производитель: " + this.prodСountry + "\tМощность: " + Integer.toString(this.horsePower) +"л.с.\tОбъем: " + Integer.toString(this.capacity) +"л.\n\n";
        return st;
    }
    @Override public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
