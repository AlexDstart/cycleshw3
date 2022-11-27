public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 3-1");
        int salary=29000;
        int total =0;
        for(int i = 1; i<=12; i++){
            total=total+salary;
            System.out.println(" месяц "+ i+" сумма накоплений " + total);
        }
    }
}