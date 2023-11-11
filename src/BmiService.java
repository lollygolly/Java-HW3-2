public class BmiService {
    public int calculate(double height, double weight) {

        double bmi1 = weight / (height * height); // Вводим промежуточный параметр ИМТ вещественного типа
        int bmi; // Вводим параметр ИМТ целочисленного типа
        return bmi = (int) bmi1; // Выводим искомый параметр ИМТ, округленный до целого значения
    }
}
