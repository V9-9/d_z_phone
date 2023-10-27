/*    Д/з Класс Phone.
 - Создайте класс Phone, который содержит переменные number, model и weight.
 - Создайте три экземпляра этого класса.
 - Выведите на консоль значения их переменных.
 - Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль
сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
 - Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных
класса - number, model и weight.
 - Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
 - Добавить конструктор без параметров.    */

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("123-456-789", "iPhone X", 0.4);
        Phone phone2 = new Phone("987-654-321", "Samsung Galaxy S20");
        Phone phone3 = new Phone();

        System.out.println("Телефон 1:");
        System.out.println("Номер: " + phone1.getNumber());
        System.out.println("Модель: " + phone1.getModel());
        System.out.println("Вес: " + phone1.getWeight() + " кг");
        phone1.receiveCall("Анна");

        System.out.println("\nТелефон 2:");
        System.out.println("Номер: " + phone2.getNumber());
        System.out.println("Модель: " + phone2.getModel());
        System.out.println("Вес: " + phone2.getWeight() + " кг");
        phone2.receiveCall("Петр");

        System.out.println("\nТелефон 3:");
        System.out.println("Номер: " + phone3.getNumber());
        System.out.println("Модель: " + phone3.getModel());
        System.out.println("Вес: " + phone3.getWeight() + " кг");
        phone3.receiveCall("Иван");
    }
}