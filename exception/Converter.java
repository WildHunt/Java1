package exception;

public class Converter {
    final double constant = 0;
    double horsePower=0;
    double wattPower=0;

    public Converter() throws ConverterException {
        if(constant==0) throw new ConverterException("Can't be " + constant);
    }

    public double convertToHorse(double wattPower){
        return horsePower / constant;
    }

    public double convertToWatt(double horsePower){
        return horsePower * constant;
    }

    public static void main(String[] args) throws ConverterException {
        Converter converter = new Converter();
        System.out.println(converter.convertToWatt(10));
    }
}

class ConverterException extends Throwable{
    public ConverterException(String message) {
        super(message);
    }
}

