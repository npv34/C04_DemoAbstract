package src;

public abstract class HardDrive {
    protected String name;
    protected String capacity;
    protected String author;

    public HardDrive(String name, String capacity, String author) {
        this.name = name;
        this.capacity = capacity;
        this.author = author;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "name='" + name + '\'' +
                ", capacity='" + capacity + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public abstract void readData();
    public abstract void writeData();
}
