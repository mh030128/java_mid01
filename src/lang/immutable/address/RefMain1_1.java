package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {

        // 참조형 변수는 하나의 인스턴스를 공유 가능.
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println();

        b.setValue("부산");   // b의 값을 부산으로 변경.
        System.out.println("부산 → b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /*
        참조값을 복사해서 전달하기 때문에 같은 값이 나옴.

        ▶ 사이드 이펙트
        프로그래밍에서 어떤 계산이 주된 작업 외에 추가적인 부수 효과를 일으키는 것.
        즉 위에 코드에서 보면 b의 값만 변경하려고 했는데 a의 값도 변경되버린 상황.
        프로그램의 특정 부분에서 발생한 변경이 의도치 않게 다른 부분에 영향을 미치는 경우에 발생.
        이로 인해 디버깅이 어려워지고 코드의 안정성이 저하될 가능성이 있음.
         */
    }
}
