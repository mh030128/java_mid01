package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {

        // 참조형 변수는 하나의 인스턴스를 공유 가능.
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 참조값 대입을 막을 수 있는 방법은 없음.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println();

        // b.setValue("부산");   // b의 값을 부산으로 변경.
        b = new ImmutableAddress("부산");
        System.out.println("부산 → b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
