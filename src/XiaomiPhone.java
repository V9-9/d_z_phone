public class XiaomiPhone extends Phone<String> {
    public XiaomiPhone(String number, String model) {
        super(number, model);
    }

    @Override
    public void info(String data) {
        System.out.printf("XiaomiPhone: model=%s, number=%s\n", this.getModel(), this.getNumber());
    }
}