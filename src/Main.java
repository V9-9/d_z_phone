/*  Д/з добавить в проект Phone свой класс NameException, исправим метод receiveCall
получаем имя от пользователя и получаем исключение, если длина имени меньше 4 символов. */
public class Main {
    public static void main(String[] args) throws NameException{

        ApplePhone phone = new ApplePhone();
        phone.setModel("iPhone 14 Pro");
        phone.setNumber("8(911)111-11-11");
        phone.setWeight(0.206);
        phone.receiveCall("Anna");
        phone.info();
        System.out.println(phone.getNumber());

        XiaomiPhone phone2 = new XiaomiPhone("8(933)333-33-33","Xiaomi 14 Pro");
        phone2.receiveCall("Oleg");
        phone2.info();

        SamsungPhone phone3 = new SamsungPhone("8(955)555-55-55","Galaxy S23 Ultra", 0.234);
        phone3.receiveCall("Ivan");
        phone3.info();
        phone3.infoD();
        phone3.inform("Test");
    }
}