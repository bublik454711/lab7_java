import java.util.Scanner;

public class ID implements Cloneable{
    private int seria;
    private int number;

    public ID() {
        number = seria = 0;
    }

    public ID(int seria, int number) {
        if (checkArguments(number, seria)) {
            this.number = number;
            this.seria = seria;
        } else {
            throw new IllegalArgumentException("Некорректный формат данных!");
        }
    }

    public int getNumber() {
        return number;
    }

    public int getSeria() {
        return seria;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите серию паспорта: ");
        seria = scanner.nextInt();
        System.out.print("Введите номер паспорта: ");
        number = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        if (checkArguments(seria, number)) {
            this.number = number;
            this.seria = seria;
        } else {
            throw new IllegalArgumentException("Некорректный формат данных!");
        }
    }

    private boolean checkArguments(int seria, int number) {
        return number > 0 && seria > 0;
    }
    @Override public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
