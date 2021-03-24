package converter;

public class Converter {
    String number;
    public Converter(String number) {
        // TODO Auto-generated constructor stub
        this.setString(number);
    }

    public int converterString() throws StringNotValidException {

        String regex = ".*[a-zA-Z].*";
        if (getString().matches(regex))
            throw new StringNotValidException();
        if (getString().contains(" ") || getString().contains(".") || getString().contains(","))
            throw new StringNotValidException();

        int value = Integer.parseInt(getString());

        if (value < -32768 || value > 32767)
            throw new StringNotValidException();

        return value;
    }

    public void setString(String value) {
        this.number = value;
    }
    public String getString() {
        return number;
    }

}
