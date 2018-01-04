package bhxh.utils;

public class ParseUltil {
    public static Long parseToLong(String number) {
        Long result = null;
        try {
            result = Long.parseLong(number);
        } catch (Exception ex) {

        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(parseToLong("0"));
    }
}
