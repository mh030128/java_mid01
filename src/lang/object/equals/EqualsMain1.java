package lang.object.equals;

public class EqualsMain1 {
    public static void main(String[] args) {

        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));   // false
        System.out.println("euqlity = " + (user1.equals(user2)));   // false

        /*
        Object가 기본으로 제공하는 equals() 메서드는 기본적으로 == 사용(동일성)해서 비교.
        동등성 비교를 사용하고 싶으면 equals() 메서드를 재정의해야 함.
         */
    }
}
