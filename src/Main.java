/* Д/з изменить в проекте с Phone интерфейсы Callable и Informable на использование
generic, применить интерфейсы к абстрактному классу Phone и классам-наследникам. */
public class Main {
    public static void main(String[] args) {

        ApplePhone phone = new ApplePhone();
        phone.setModel("iPhone 14 Pro");
        phone.setNumber("8(911)111-11-11");
        phone.setWeight(0.206);
        phone.receiveCall("Anna");
        phone.info("Info");
        System.out.println(phone.getNumber());

        XiaomiPhone phone2 = new XiaomiPhone("8(933)333-33-33","Xiaomi 14 Pro");
        phone2.receiveCall("Alex");
        phone2.info("Info");

        SamsungPhone phone3 = new SamsungPhone("8(955)555-55-55","Galaxy S23 Ultra", 0.234);
        phone3.receiveCall("Ivan");
        phone3.info("Info");
    }
}