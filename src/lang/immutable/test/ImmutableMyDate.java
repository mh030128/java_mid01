package lang.immutable.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate withYear(int changeYear) {
        return new ImmutableMyDate(changeYear, month, day);
    }

    public ImmutableMyDate withMonth(int changeMonth) {
        return new ImmutableMyDate(year, changeMonth, day);
    }

    public ImmutableMyDate withDay(int changeDay) {
        return new ImmutableMyDate(year, month, changeDay);
    }

    /*
    불변객체에서 값을 변경하는 경우 "with"로 시작하는 경우가 많음.
    원본 객체의 상태가 그대로 유지됨을 강조하면서 변경사항을 새 복사본에 포함하는 과정을 간결하게 표현.
     */

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
