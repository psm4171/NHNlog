public class Main {

    public static void main(String[] args) {
        System.out.println(solution_factorial(0));
        System.out.println(solution_factorial(5));

        System.out.println(solution_fibonacci(0));
        System.out.println(solution_fibonacci(10));
    }

    public static long factorial(int number) {

        switch(number){
            case 0: case 1:
                    return 1;
        }
        return number * factorial(number-1);

    }

    public static long fibonacci(int number) {

        switch (number) {
            case 0:
                return 0;
            case 1:
                return 1;

        }
        return fibonacci(number-1) + fibonacci(  number -2);
    }

    public static long solution_factorial(int number){
        return factorial(number);
    }

    public static long solution_fibonacci(int number){
        return fibonacci(number);
    }


}