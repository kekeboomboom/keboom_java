package emun;

public enum SortEnum {
    HOT,
    HOT30,
    HOT7,
    NO,
    NEW;

    public static void main(String[] args) {
        SortEnum[] values = SortEnum.values();

        for (SortEnum sortEnum : values) {
            System.out.println(sortEnum);
        }
    }
}