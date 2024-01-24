import java.util.Scanner;

public class SNILS implements Cloneable{
    private long number;
    private int pol;

    public SNILS() {
        number = pol = 0;
    }

    public SNILS(long number, int pol) {
        if (checkArguments(number, pol)) {
            this.number = number;
            this.pol = pol;
        } else {
            throw new IllegalArgumentException("Некорректный формат данных!");
        }
    }

    public long getNumber() {
        return number;
    }

    public int getPol() {
        return pol;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер СНИЛСа: ");
        number = scanner.nextLong();
        System.out.print("Введите пол(1-мужской, 2-женский): ");
        pol = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        if (checkArguments(number, pol)) {
            this.number = number;
            this.pol = pol;
        } else {
            throw new IllegalArgumentException("Некорректный формат данных!");
        }
    }

    private boolean checkArguments(long number, int pol) {
        return number > 0 && pol > 0 && pol < 3;
    }
    @Override public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
