package task1;
/** Создать класс для описания студента нашей группы.
 * Поля класса: имя, фамилия, номер паспорта, название группы (можно добавить свои поля по желанию - например, возраст).
 * Создать объекты этого класса для каждого из студента нашей группы.
 * Поместить все эти объекты в массив.
 * Пройти по массиву циклом for и вывести информацию на консоль.
 */
public class Student {
    String name;
    String surname;
    String passportNumber;
    String groupName;
    Student(String name,String surname, String passportNumber,String groupName){
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
        this.groupName = groupName;
    }
    void showStudent(){
        System.out.println("Name: " + name + ", surname: " + surname + ", passport number: " + passportNumber +
                ", group name: " + groupName + ".");
    }
}
