/* Д/3 Доработать класс Phone. Сделать его абстрактным. Метод info() сделать абстрактным.
Также добавить классы-наследники от Phone - SamsungPhone, XiaomiPhone и ApplePhone.
Реализацию info() в каждом классе-наследнике. Создать объекты каждого класса-наследника
и проверить метод Info(). */
public class Main {
    public static void main(String[] args) {
        ApplePhone phone = new ApplePhone();
        phone.setModel("iPhone 14 Pro");
        phone.setNumber("8(911)111-11-11");
        phone.setWeight(0.206);

        phone.receiveCall("Anna");
        System.out.println(phone.getNumber());
        phone.info();

        XiaomiPhone phone2 = new XiaomiPhone("8(933)333-33-33","Xiaomi 14 Pro");
        phone2.receiveCall("Alex");
        System.out.println(phone2.getNumber());
        phone2.info();

        SamsungPhone phone3 = new SamsungPhone("8(955)555-55-55","Galaxy S23 Ultra", 0.234);
        phone3.receiveCall("Ivan");
        System.out.println(phone3.getNumber());
        phone3.info();
    }
}