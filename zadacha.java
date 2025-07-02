public class Main {
    public static void main(String[] args) {
        int N = 3; //N-ое число
        int result = 1; //переменная результата
        int i = 2; //вспомогательная переменная для цикла

        while(i <= N){ //Основной цикл
            result *= i; //умножаем переменную result на переменную i
            i = i + 1;
        }

        System.out.print(result); //выводим факториал
    }
}
