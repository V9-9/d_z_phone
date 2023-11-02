public class SamsungPhone extends Phone<String> {
    public SamsungPhone(String number, String model, double weight) {
        super(number, model, weight);
    }

    @Override
    public void info(String data) {
        System.out.printf("SamsungPhone: model=%s, number=%s, weight=%.2f\n", this.getModel(), this.getNumber(), this.getWeight());
    }
}