package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {

        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println();

        System.out.println("2025 -> date1");
        date1 = date1.withYear(2025);
        /*
        date1.withYear(2025)로 작성하면 안됨.
        반환값을 받아야 함.(date1)
        따라서 위에처럼 작성해야 함.
         */
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

    }
}
