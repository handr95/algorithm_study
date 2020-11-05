class InitBlock {

    static int classVar = 10;         // 클래스 변수의 명시적 초기화

    int instanceVar = 10;             // 인스턴스 변수의 명시적 초기화

    static {
        System.out.println("static 인스턴스 초기화 : "+classVar);
        classVar = 20;
    }         // 클래스 초기화 블록을 이용한 초기화

    {
        System.out.println("인스턴스 초기화 : "+instanceVar);
        instanceVar = 20;
    }             // 인스턴스 초기화 블록을 이용한 초기화

    InitBlock() {
        instanceVar = 30;
    } // 생성자를 이용한 초기화

}


public class TestInit {

    public static void main(String[] args) {
        InitBlock initBlock = new InitBlock();
        //System.out.println(InitBlock.classVar);

        //InitBlock myInit = new InitBlock();

        //System.out.println(myInit.instanceVar);

    }

}