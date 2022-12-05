public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 10.Strings");
        System.out.println("Task 1");
//      Выведем в консоль фразу: “ФИО сотрудника — Ivanov Ivan Ivanovich”
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("");

        System.out.println("Task 2");
//      Напишем программу, которая изменит написание Ф. И. О. сотрудника с “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
        System.out.println("");

        System.out.println("Task 3");
//      Система, в которой мы работаем, не принимает символ "ё".
//      Поэтому напишем программу, которая заменяет символ "ё" на символ "е".
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace('ё', 'е').replace('Ё', 'Е');
        System.out.println("Данные ФИО сотрудника — " + fullName1);

    }
}