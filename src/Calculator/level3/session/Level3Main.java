package Calculator.level3.session;

import java.util.Scanner;

public class Level3Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmaticCalculator<Double> calculator = new ArithmaticCalculator<>();
        String exit = "";

        //반복문을 사용하되, 반복의 종료를 알려주는 "exit"문자열을 입력하기 전까지 무한으로 게산을 진행할 수 있도록 소스코드 수정
        while(!exit.equals("exit")){//!exit.equals("exit")이 값이 아닐때까지
            //양의 정수(0포함)을 입력받기
            System.out.println("숫자 1 입력: ");
            double num1 = sc.nextDouble();
            System.out.println("숫자 2 입력: ");
            double num2 = sc.nextDouble();
            sc.nextLine();

            //사칙 연산 기호 입력하기
            System.out.println("기호 입력: ");
            char operator = sc.nextLine().charAt(0);

            Double result = calculator.calculate(num1, num2, operator);

            if(result != null){
                System.out.println(result);
                calculator.setResultList(result);
            }

            System.out.println("종료하려면 exit 입력: ");
            exit = sc.nextLine();

        }


    }
}