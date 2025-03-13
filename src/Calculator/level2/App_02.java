package Calculator.level2;

import java.util.Scanner;

class App_02 {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        char cal;
        //계산
        while (true) {

            System.out.println("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            num1 = sc.nextInt();

            System.out.println("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            num2 = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");
            cal = sc.next().charAt(0);

            Integer result = calc.calculate(num1, num2, cal);
            System.out.println("결과값: "+result);

            if(result != null){

                System.out.println("result = " + result);

                System.out.println("값 조회하기");
                int index = sc.nextInt();

                if(index>=0){
                    int getresult =calc.getResult(index);
                }else{

                }
            }else{
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

                sc.nextLine();
                String exit = sc.nextLine();

                if(exit.equals("exit")){
                    calc.removeResult();
                    break;
                }
            }



        }



    }
}
