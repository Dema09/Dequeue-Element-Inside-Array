public enum ProgramEnum {

    REGEX_ALPHANUMERIC("^[a-zA-Z0-9]*$");

    private String regex;

    ProgramEnum(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return regex;
    }
}
