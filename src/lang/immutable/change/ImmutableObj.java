package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result);

        // ctrl + alt + N
        // return new ImmutableObj(value + addValue);
        /*
        자신의 값(value)은 변하지 않고 새로운 객체 생성해서 반환
         */
    }

    public int getValue() {
        return value;
    }
}
