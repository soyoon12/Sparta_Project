package Calculator.level3.session;

public enum OperaterType {

    //enum이란?
    //정의 : 열거타입으로 정해진 값으로 상수와 비슷하다 enum Week{MONDAY,TUESDAY,FRIDAY} 상수들의 집합
    //형식 : 클래스와 같이 참조 타입으로서 Week today; today.Friday

    //enum


    ADD('+'),//ADD('+','1')등 ADD의 집합을 말해준다.
    MINUS('-'),
    MULTIPICATION('*'),
    DIVISION('/');

    private final char symbol;

    OperaterType(char symbol) {
        this.symbol = symbol;
    }

    //사용자에게 받은 것 컨버터
    public static OperaterType fromSymbol(char symbol) {
        for(OperaterType type : OperaterType.values()){
            if(type.symbol == symbol){
                return type;
            }
        }
        return null;
    }
}
