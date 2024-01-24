import java.util.Scanner;
import java.util.function.Consumer;
public class Tires extends CarDetail implements Cloneable{

    private float radius;
    private float width;
    private int paymentStatus;
    public Tires() {
        Auto car = new Auto();
        brand = car.getBrand();
        model = car.getModel();
        typeTrans = car.getTypeTrans();
        gosNumber = car.getGosNumber();
        radius = 0;
        width = 0;
        installDate = "Не указано";
        prodСountry = "Не указано";
    }
    public Tires(String installDate, String prodСountry, float radius, float width, String brand, String model, int typeTrans, String gosNumber) {
        Auto car= new Auto(brand,  model, typeTrans, gosNumber);
        this.brand = car.getBrand();
        this.model = car.getModel();
        this.typeTrans = car.getTypeTrans();
        this.gosNumber = car.getGosNumber();
        this.radius = radius;
        this.width = width;
        this.installDate = installDate;
        this.prodСountry = prodСountry;
    }


    @Override
    public String getDetailName() {
        return "Tires";
    }

    @Override
    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tВвод данных Шин\n");
        Consumer<Auto> input = Auto::input;
        System.out.print("Введите радиус: ");
        radius = scanner.nextFloat();
        System.out.print("Введите ширину: ");
        width = scanner.nextFloat();
        System.out.print("Введите дату установки: ");
        installDate = scanner.nextLine();
        System.out.print("Введите страну производителя: ");
        prodСountry = scanner.nextLine();
        this.radius = radius;
        this.width = width;
        this.prodСountry = prodСountry;
        this.installDate = installDate;
    }
    @Override public String toString()  {
        String st  = "\tИнформация о детали\nМодель машины: " + this.getModel() +"\tСтрана производитель: " + this.prodСountry + "\tРадиус: " + Float.toString(this.radius) +"\tШирина: " + Float.toString(this.width) +"\n\n";
        return st;
    }
    @Override public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}