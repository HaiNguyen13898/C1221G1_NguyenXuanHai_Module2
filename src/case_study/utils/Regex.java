package case_study.utils;

public class Regex {
    String ID_REGEX = "^SV(VL|HO|RO)\\d{4}$";
    String NAME_SERVICE_REGEX = "^[A-Z]\\w+\\s?((\\w+)\\s)*([a-z]*)$";



    public boolean regexInteger(String integer){
        String regex = "^[1-9]|([1][0-9])$";
        return integer.matches(regex);
    }
}
