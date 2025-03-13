package Calculator.level3.session;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ArithmaticCalculator<T extends Number> {

    private final List<Double> resultList = new ArrayList<>();


    public Double calculate(T num1, T num2, char operator){
        OperaterType type = OperaterType.fromSymbol(operator);

        return switch(type){
            case ADD -> num1.doubleValue() + num2.doubleValue();
            case MINUS -> num1.doubleValue() - num2.doubleValue();
            case DIVISION -> {
                if(num1.doubleValue() == 0){
                    System.out.println(" 0으로 나눌 수 없습니다 ");
                    yield null;
                }
                yield num1.doubleValue() / num2.doubleValue();
            }
            case MULTIPICATION ->  num1.doubleValue() * num2.doubleValue();
        };
    }
    //게터 세터
        public List<Double> getResultList(Double result) {
            return resultList;
        }

        public void setResultList(Double result){
        this.resultList.add(result);
        }

    //저장된 연산 결과들 중 Scanner로 입력 받은 값보다 큰 결과값 들을 출력 ver1
    public List<Double> getGoeListVer1(Double targetNum){
        return resultList.stream()
                .filter(result -> result >= targetNum)
                .collect(Collectors.toList());
    }

    //저장된 연산 결과들 중 Scanner로 입력 받은 값보다 큰 결과값 들을 출력 ver2
    public List<Double> getGoeListVer2(Double targetNum){
        List<Double> newList = new ArrayList<>();

        for(Double result : resultList){
            if(result > targetNum){
                newList.add(result);
            }
        }
        return newList;
    }
    }


