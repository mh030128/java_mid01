package lang.object.toString;

public class ToStringMain2 {
    public static void main(String[] args) {

        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍01", 2);
        Dog dog2 = new Dog("멍멍02", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println();

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println();

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        System.out.println();

        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue = " + refValue);

        /*
        객체 참조 값을 알고 싶으면 System.identityHashCode() 메서드 사용하는데
        이 때는 숫자로 반환이 됨.
        16진수로 구하기 위해 Integer.toHexString() 메서드 사용 후 타입을 String으로 변환하여
        출력하면 됨.
         */
    }
}
