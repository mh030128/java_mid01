package lang.immutable.address;

public class ImmutableAddress {

    /*
    ▶ 불변객체
    객체의 상태(객체 내부의 값, 필드, 멤버변수)가 변하지 않는 객체.
    값을 변경하는 것이 불가능하므로 setter 입력 안 함.
    내부 값 변경되면 안되므로 value의 필드를 final로 선언.
     */

    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
