package Lesson37H;

public class Car implements Comparable<Car> {
    String name;
    int year;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car [name=" + name + ", year=" + year + "]";
    }

    @Override
    public int compareTo(Car o) {
        return this.year - o.year;
    }
}
