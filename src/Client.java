import java.util.Scanner;

public class Client implements Cloneable{
    private PersData persData;
    private int compLess;
    private int totalLess;
    private static  int clientCounter=0;

    public static int getClientCounter()
    {
        return clientCounter;
    }
    public Client() {
        persData = new PersData();
        compLess = 0;
        totalLess = 0;
        clientCounter++;
    }

    public Client(PersData persData, int compLess, int totalLess) {
        this.persData = persData;
        this.compLess = compLess;
        this.totalLess = totalLess;
        clientCounter++;
    }

    public PersData getPersData() {
        return persData;
    }

    public int getCompLess() {
        return compLess;
    }

    public int getTotalLess() {
        return totalLess;
    }

    public void setTotalLess(int totalLess) {
        this.totalLess = totalLess;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tВвод данных клиента");
        persData.input();
        System.out.print("Введите кол-во пройденных занятий: ");
        compLess = scanner.nextInt();
        System.out.print("Введите кол-во всех занятий: ");
        totalLess = scanner.nextInt();
        if (checkArguments(persData, compLess, totalLess)) {
            this.persData = persData;
            this.compLess = compLess;
            this.totalLess = totalLess;
        } else {
            throw new IllegalArgumentException("Некорректный формат данных!");
        }
    }

    @Override public String toString()  {
        String st  = "\tИнформация о клиенте" + "ФИО: " + persData.getFio() + "\tКол-во пройденных уроков: " + compLess + "\tВсего уроков: " + totalLess + "\n";
        return st;
    }
    private boolean checkArguments(PersData persData, int compLess, int totalLess) {
        return compLess > 0 && totalLess > 0;
    }
    @Override public Object clone() throws CloneNotSupportedException {
        Client clone = (Client) super.clone();
        clone.persData = (PersData) this.persData.clone();
        return clone;
    }
}