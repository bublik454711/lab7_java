import java.util.Scanner;

public class Instructor implements Cloneable{
    private Auto auto;
    private PersData persData;
    private int driveExp;

    public Instructor() {
        auto = new Auto();
        persData = new PersData();
        driveExp = 0;
    }

    public Instructor(Auto auto, PersData persData, int driveExp) {
        this.auto = auto;
        this.persData = persData;
        this.driveExp = driveExp;
    }

    public Auto getAuto() {
        return auto;
    }

    public PersData getPersData() {
        return persData;
    }

    public int getDriveExp() {
        return driveExp;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tВвод данных инструктора");
        auto.input();
        persData.input();
        System.out.print("Введите опыт вождения: ");
        driveExp = scanner.nextInt();
        if (checkArguments(auto, persData, driveExp)) {
            this.auto = auto;
            this.persData = persData;
            this.driveExp = driveExp;
        } else {
            throw new IllegalArgumentException("Некорректный формат данных!");
        }
    }

    private boolean checkArguments(Auto auto, PersData persData, int driveExp) {
        return driveExp > 0;
    }
    @Override public Object clone() throws CloneNotSupportedException {
        Instructor clone = (Instructor) super.clone();
        clone.persData = (PersData) this.persData.clone();
        clone.auto = (Auto) this.auto.clone();
        return clone;
    }
}
