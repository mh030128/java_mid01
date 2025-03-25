
package lang.object.equals;

public class EqualsMain2 {
    public static void main(String[] args) {

        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity = " + (user1 == user2));   // false
        System.out.println("equality = " + user1.equals(user2));    // true

        /*
        이제는 동일성은 다르지만 동등성은 같음.
        동일성에서는 참조값이 다르고, 동등성에서는 같음.
         */
    }
}
