package level3.Lesson2;

//Создайте класс Error, определите в нем три поля:
// boolean isActive, int statusCode, String message.
// Добавьте в этом классе 2 конструктора:
// конструктор по умолчанию,
// конструктор с тремя параметрами, который будет инициализировать поля переданными значениями.
// Создайте метод printInfo, который выводит в консоль содержимое полей. Добавьте метод main(),
// в котором будете создавать объект с помощью конструктора по умолчанию,
// а также несколько объектов с помощью конструктора с параметрами.
// Вызовите на созданных объектах метод printInfo.
public class Error {
    boolean isActive;
    int statusCode;
    String message;

    Error() {

    }

    Error(boolean isActive, int statusCode, String message) {
        this.isActive = isActive;
        this.statusCode = statusCode;
        this.message = message;
    }
    void printInfo(){
        System.out.println(isActive);
        System.out.println(statusCode);
        System.out.println(message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        Error error2 = new Error(true,2,"error2");
        Error error3 = new Error(false,10,"error3");
        error1.printInfo();
        error2.printInfo();
        error3.printInfo();
    }

}
