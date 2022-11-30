
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
   //    String[] actions = {"+", "-", "/", "*"};
        //    String[] regexActions = {"\\+", "-", "/", "\\*"};


        Scanner scn = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String exp = scn.nextLine();
        System.out.println(calculate(exp));
        //     int actionIndex=-1;
//        for (int i = 0; i < actions.length; i++) {
//            if(exp.contains(actions[i])){
//                actionIndex = i;
//                break;
//            }
//        }

//        if(actionIndex==-1){
//            System.out.println("Некорректное выражение");
//            return;
//        }


        //"2-4".split("-")-> {"2", "4"}
    //    String[] data = exp.split(regexActions[actionIndex]);
        //Определяем, находятся ли числа в одном формате (оба римские или оба арабские)
//        if(converter.isRoman(data[0]) == converter.isRoman(data[1])){
//            int a,b;
//
//            //конвертируем арабские числа из строки в число
//            a = Integer.parseInt(data[0]);
//            b = Integer.parseInt(data[1]);
//
//            //выполняем с числами арифметическое действие
//            int result;
//            switch (actions[actionIndex]){
//                case "+":
//                    result = a+b;
//                    break;
//                case "-":
//                    result = a-b;
//                    break;
//                case "*":
//                    result = a*b;
//                    break;
//                default:
//                    result = a/b;
//                    break;
//            }
//            //если числа были арабские, возвращаем результат в арабском числе
//            System.out.println(result);
//
//        }else{
//            System.out.println("Числа должны быть в одном формате");
//        }


    }

    public static String calculate(String expression) {

        //получаем символ арифметической операции
        String operation = getOperation(expression);

        //убрать все пробелы из введеной строки
        //разделение строки по арифметич. знаку
        String [] parts = expression.replace(" ","").split(Pattern.quote(operation));


        int a = strToIntArabic(parts[0]); //присваеваем строке элемент массива 0
        int b = strToIntArabic(parts[1]); //присваеваем строке элемент массива 1



        //проверяем введеные числа на диапозон от 1 до 10
        if (a >= 1 && a <= 10 && b >= 1 && b <= 10) {
            // исходя из полученного символа, вызывается нажная нам арифм. операц.  и получаем ответ
            switch (operation) {
                case "+":
                    return intToStrArabic(plus(a, b));
                case "-":
                    return intToStrArabic(minus(a, b));
                case "*":
                    return intToStrArabic(multiply(a, b));
                case "/":
                    return intToStrArabic(division(a, b));
                default:
                    throw new RuntimeException("Несоответсвующая арифметическая операция.");
            }
        } else {
            throw new IllegalArgumentException("Введен неверный диапозон чисел.");
        }

    }

        public static int plus(int a, int b){

            return a + b;
        }

        public static int multiply(int a, int b){

            return a * b;
        }

        public static int division(int a, int b){

            return a / b;
        }

        public static int minus(int a, int b){

            return a - b;
        }
    public static String getOperation(String expression){
        if (expression.contains("+")) {
            return "+";
        } else if (expression.contains("-")){
            return "-";
        } else if (expression.contains("*")) {
            return "*";
        } else if (expression.contains("/")) {
            return "/";
        } else {
            throw new RuntimeException("Несоответсвующая арифметическая операция.");
        }

    }

        public static int strToIntArabic(String s) {
            return Integer.parseInt(s);
        }

        public static String intToStrArabic(int s) {
            return String.valueOf(s);
        }

    // Из map нужно по ключу получить значение римской цифры strToIntRoman !!!!
    public static <K, V> K getKey(Map<K, V> map, V value)
    {
        for (K key: map.keySet())
        {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
    // throw new RuntimeException("Число не входит в диапозон римских цифр или введены не верные данные");


        //public static String intToStrRoman(int s) {
        //return null;и
        //если результат операции меньше нуля, то вернуть отрицательную римскую цифру
//        if (s < 0) {
//            int abs = Math.abs(s);
//            String a = "-" + romanNumAns[abs];
//            return a;
//            //иначе положительная
//        } else {
//            return romanNumAns[s];
//        }

   // }

}