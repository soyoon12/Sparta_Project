package Calculator.level2;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> result = new ArrayList<>();
//    private static int count =0; -> 배열 static은 공유 메모리이기 때문에 private 캡슐화 목적에 어긋난다
//    a,b
//    캡슐화 목적 -> 정해진 규칙을 따르기 위해

    public Integer calculate(int num1, int num2 ,char cal) {

        int calculated = 0;

            switch (cal) {

                case '+':
                    calculated = num1 + num2;
                    this.result.add(calculated);
                    break;
                case '-':
                    calculated = num1 - num2;
                    this.result.add(calculated);
                    break;
                case '*':
                    calculated = num1 * num2;
                    this.result.add(calculated);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }else{
                        calculated = num1 / num2;
                        this.result.add(calculated);
                        break;
                    }
                default:
                    System.out.println("기호가 아닙니다.");
                    break;
            }

//        count++;

        return calculated;

    }

    //게터
    public int getResult(int result){

        return this.result.get(result-1);

    }

    //세터
    public void setResult(int result){
        this.result.add(result);
    }

    //초기화
    public void removeResult() {
        this.result.clear();
        //result.remove(result.size() - 1);
    }

}
