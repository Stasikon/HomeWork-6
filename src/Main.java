public class Main {
    public static void main(String[] args) {
        task1();
        tack2();
        tack3();
        tack4();
        tack5();
        tack6();
        tack7();
        tack8();
        tack9();
        tack10();

        }
        //Задача 1//
        public static void task1(){
        for(int i = 0;i <= 10 ; i++) {
            System.out.println("integer cycles "+i+" Task 1");
        }
        }
        //Задача 2//
        public static void tack2(){
            for(int i = 10; i>=0; i=i-1){
                System.out.println("integer cycles "+i+" Task 2");}

        }
        //Задача 3//
        public static void tack3(){
            for(int i = 0; i<=17; i+=2){
                System.out.println("integer cycles "+i+" Task 3");}

        }
        public static void tack4(){
        for (int i =10;i>=-10;i=i-1){
              System.out.println("integer cycles "+i+" Task 4");
        }
    }
    public static void tack5(){
        for (int i = 1904; i < 2096; i = i + 4){
            System.out.println("Високосный год " + i+" Task 5");
        }
    }
    public static void tack6(){
        for (int i = 7; i <=98; i = i + 7){
System.out.println("Numerical sequence *7 "+i+" Task 6");
        }

    }
    public static void tack7(){
        for (int i = 1; i <=512; i = i * 2) {
            System.out.println("Sequence 2048 " + i + " Task 7");
        }
    }
    public static void tack8(){
        int salary = 29000;
        int total = 0;
        for (int i = 0; i <=12; i++) {
            total = total + salary;
            System.out.println(i+" Total month "+ total);
        }
        System.out.println(total+" Итого"+" Tack 8");
    }
    public static void tack9(){
        int salary = 29000;
        int total = 0;
        for (int i = 0; i <=12; i++) {
            total =  total+total/100;
            total = total + salary;
            System.out.println(i+" Total month "+ total);
        }
        System.out.println(total+" Итого"+" Tack 9");

    }
    public static void tack10(){
        int number = 2;
        for (int i = 1; i <= 10; i++){
            System.out.println(number + " * " + i + " = "
                    + number * i);
        }

    }
}

