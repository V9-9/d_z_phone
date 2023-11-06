public class SamsungPhone extends Phone {
    public SamsungPhone(String number, String model, double weight) {
        super(number, model, weight);
    }

    public void info() {
        System.out.printf("SamsungPhone: model=%s, number=%s, weight=%.2f\n", this.getModel(), this.getNumber(), this.getWeight());
    }
}