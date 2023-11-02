public class ApplePhone extends Phone<String> {
    public ApplePhone() {
    }

    @Override
    public void info(String data) {
        System.out.printf("ApplePhone: model=%s, number=%s, weight=%.2f\n", this.getModel(), this.getNumber(), this.getWeight());
    }
}