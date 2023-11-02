public abstract class Phone<T> implements Callable<T>, Informable<T> {
    private String number;
    private String model;
    private double weight;

    public Phone() {
        System.out.println("Phone is created");
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void receiveCall(T name){
        System.out.printf("Call %s\n", name);
    }

    @Override
    public abstract void info(T data);
}