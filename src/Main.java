public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        String firstName = "Marina";
        String middleName = "Maksimovna";
        String lastName = "Lebedeva";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника - " + fullName);


        System.out.println("Задание 2");

        String upper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upper);


        System.out.println("Задание 3");

        String fullName0 = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрулника - " + fullName0.replace("ё", "е"));

    }
}