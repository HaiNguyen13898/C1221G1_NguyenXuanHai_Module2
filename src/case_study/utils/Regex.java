package case_study.utils;

public class Regex {

    public boolean regexId(String id) {
        String regex = "(SVHO)\\-\\d{4}";
        return id.matches(regex);
    }

    public boolean regexNameService(String nameService) {
        String regex = "^[A-Z][a-z]+$";
        return nameService.matches(regex);
    }

    public boolean regexPeople(String people) {
        String regex = "^[1-9]|([1][0-9])|(20)$";
        return people.matches(regex);
    }

    public boolean regexArea(String area) {
        String regex = "^([3-9]\\d|[1-9]\\d{2,})$";
        return area.matches(regex);
    }

    public boolean regexInteger(String integer){
        String regex = "^[1-9]|([1][0-9])$";
        return integer.matches(regex);
    }
}
