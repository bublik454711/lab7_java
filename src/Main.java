
public class Main {
    public static void main(String[] args) {

        CarDetailsList list = new CarDetailsList();
        list.addItem(new Engine("25.03.2021", "Korea", 80, 2, "Kia", "Rio", 1, "T345EC"));
        list.addItem(new Transmission("20.10.2019", "Korea", 5, 13, "Renault", "Logan", 1, "X234YY"));
        list.addItem(new Tires("12.05.2020", "Korea", 15, 65, "Kia", "Rio", 1, "T345EC"));
        list.addItem(new Engine("25.03.2021", "Korea", 80, 2, "Hyundai", "Solaris", 2, "E856TX"));
        list.addItem(new Engine("25.03.2021", "Korea", 80, 2, "Mitsubishi", "Lancer", 1, "Y642EA"));
        list.addItem(new Transmission("25.03.2021", "Korea", 6,12, "Mitsubishi", "Lancer", 1, "Y642EA"));
        System.out.println("Вывод изначальной таблицы");
        list.print();
        System.out.println();

        list.sortByName();
        System.out.println("Вывод таблицы после сортировки по имени детали");
        list.print();
        System.out.println();

        list.deleteDetail("Engine");
        list.sortByModel();
        System.out.println("Вывод таблицы после удаления детали: \"Engine\" и сортировки по модели машины");
        list.print();
        System.out.println();
        list.deleteLast();
        System.out.println("Вывод таблицы после удаления последней детали");
        list.print();
        System.out.println();
        System.out.println("Поиск детали: \"Tires\"");
        System.out.println(list.searchDetail("Tires"));
        System.out.println();
    }
}