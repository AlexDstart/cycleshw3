public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 3-1");
        int contribution=29000;
        int total =0;
        for(int i = 1; i<=12; i++){
            total+=contribution;
            System.out.println(" месяц " + i + " сумма накоплений " + total + " рублей ");
        }

        //task3-2
        System.out.println(" Задание 3-2 ");
        double contributionWithPercent=0;
        double percent=0.01;
        for (int i = 1; i <=12 ; i++) {
            contributionWithPercent=(contributionWithPercent+contribution)*(1+percent);
            System.out.println(" Месяц " + i + " сумма накоплений равна " + contributionWithPercent + " рублей ");

        }

    }
}
