import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class CarDetailsList {
    private List<CarDetail> details = new ArrayList<>();

    public CarDetailsList() { }

    public int getItemCount() {
        return details.size();
    }

    public void addItem(CarDetail detail) {
        details.add(detail);
    }

    public void deleteDetail(String name) {
        details.remove(searchDetail(name));
    }
    public void deleteLast() {
        details.remove(getItemCount()-1);
    }

    public void sortByName() {
        Collections.sort(details, Comparator.comparing(CarDetail::getDetailName));
    }

    public void sortByModel() {
        Collections.sort(details, Comparator.comparing(CarDetail::getModel));
    }

    public CarDetail searchDetail(String name) {
        for (CarDetail detail : details) {
            if (detail.getDetailName().equals(name)) {
                return detail;
            }
        }
        throw new IllegalArgumentException("Деталь не найдена!");
    }

    public void print() {
        System.out.println("Список деталей:");
        for (CarDetail detail : details) {
            System.out.println(detail.getDetailName() + ": " + detail.getModel());
        }
    }


}
