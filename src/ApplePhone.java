public class ApplePhone extends Phone{
    public ApplePhone() {
    }

    @Override
    public void receiveCall(String name) {
        System.out.printf("Call %s\n", name);
    }

    @Override
    public void info() {
        System.out.printf("ApplePhone: model=%s, number=%s, weight=%.2f\n", this.getModel(), this.getNumber(), this.getWeight());
    }

    @Override
    public void infoDefault() {

    }
}