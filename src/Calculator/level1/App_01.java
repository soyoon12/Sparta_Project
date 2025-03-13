package Calculator.level1;

import java.util.Scanner;

public class App_01 {
    public static void main(String[] args) {

        int result;
        int num1;
        int num2;
        char cal;
        String exit;

        Scanner sc = new Scanner(System.in);



        while(true){

            System.out.println("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            num1 = sc.nextInt();

            if (num1 < 0){

            }

            System.out.println("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            num2 = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");
            cal = sc.next().charAt(0);

            switch (cal) {
                case '+':
                    result = num1 + num2;
                    System.out.println("결과값: "+result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("결과값: "+result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("결과값 " + result);
                    break;
                case '/':
                    if(num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }
                    result = num1 / num2;
                    System.out.println("결과값 " + result);
                    break;

                default:
                    System.out.println("기호가 아닙니다.");
                    break;
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

                sc.nextLine();
                exit = sc.nextLine();

            if(exit.equals("exit")){

            break;

            }
        }



    }
}
