import java.util.Scanner;

public class PersData implements Cloneable{
    private Docs docs;
    private int age;
    private String fio;

    public PersData() {
        docs = new Docs();
        age = 0;
        fio = "Не указано";
    }

    public PersData(Docs docs, int age, String fio) {
        this.docs = docs;
        this.age = age;
        this.fio = fio;
    }

    public Docs getDocs() {
        return docs;
    }

    public int getAge() {
        return age;
    }

    public String getFio() {
        return fio;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tВвод персональных данных");
        docs.input();
        System.out.print("Введите Возраст: ");
        age = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        System.out.print("Введите ФИО: ");
        fio = scanner.nextLine();
        if (checkArguments(docs, age, fio)) {
            this.docs = docs;
            this.age = age;
            this.fio = fio;
        } else {
            throw new IllegalArgumentException("Некорректный формат данных!");
        }
    }

    private boolean checkArguments(Docs docs, int age, String fio) {
        return age > 0;
    }
    @Override public Object clone() throws CloneNotSupportedException {
        PersData clone = (PersData) super.clone();
        clone.docs = (Docs) this.docs.clone();
        return clone;
    }

}
