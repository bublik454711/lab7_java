import java.util.Scanner;

public class Docs implements Cloneable{
    private SNILS snils;
    private ID id;

    public Docs() {
        snils = new SNILS();
        id = new ID();
    }

    public Docs(SNILS snils, ID id) {
        this.snils = snils;
        this.id = id;
    }

    public SNILS getSNILS() {
        return snils;
    }

    public ID getID() {
        return id;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tВвод документов");
        System.out.println("\tВвод СНИЛСА");
        snils.input();
        System.out.println("\tВвод паспорта");
        id.input();
        this.snils = snils;
        this.id = id;
    }
    @Override public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}