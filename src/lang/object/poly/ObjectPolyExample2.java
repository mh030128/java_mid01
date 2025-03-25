package lang.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();   // Object 인스턴스 생성 가능

        Object[] objects = {dog, car, object};

        size(objects);
    }

    private static void size(Object[] objects) {    // alt + enter로 메서드 생성 가능
        System.out.println("전달된 객체 수 : " + objects.length);
    }
}
