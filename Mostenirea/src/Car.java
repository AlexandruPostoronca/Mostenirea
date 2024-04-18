public class Car {
    protected String name;
    protected String model;
    protected int speed;

    public Car(String name, String model, int speed) {
        this.name = name;
        this.model = model;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}
