package bhxh.utils;

public class JPAUtils {
    public static Long toLong(Boolean value) {
        if (value == null)
            return null;
        else if (value)
            return 1l;
        else
            return 0l;
    }
}
