public class XiaomiPhone extends Phone {
    public XiaomiPhone(String number, String model) {
        super(number, model);
    }

    public void info() {
        System.out.printf("XiaomiPhone: model=%s, number=%s\n", this.getModel(), this.getNumber());
    }
}