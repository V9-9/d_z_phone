public class XiaomiPhone extends Phone{
    public XiaomiPhone(String number, String model) {
        super(number, model);
    }

    @Override
    public void receiveCall(String name) {
        System.out.printf("Call: %s\n", name);
    }


    @Override
    public void info() {
        System.out.printf("XiaomiPhone: model=%s, number=%s\n", this.getModel(), this.getNumber());
    }

    @Override
    public void infoDefault() {

    }
}