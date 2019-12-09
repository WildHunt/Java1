package patterns.Factory;

public class Factory {

    public static void main(String[] args) {
        Factory carFactory = new Factory();
        Cars honda = carFactory.getCar(CarTypes.Honda);
        Cars audi = carFactory.getCar(CarTypes.Audi);
        Cars ferrari = carFactory.getCar(CarTypes.Ferrari);
        honda.ride();
        audi.ride();
        ferrari.ride();
    }

    public Cars getCar(CarTypes type) {
        Cars toReturn = null;
        switch (type) {
            case Honda:
                toReturn = new Honda();
                break;
            case Audi:
                toReturn = new Audi();
                break;
            case Ferrari:
                toReturn = new Ferrari();
                break;
            default:
                throw new IllegalArgumentException("Wrong Car type:" + type);
        }
        return toReturn;
    }

    public class Honda implements Cars {

        @Override
        public void ride() {
            System.out.println("Riding Honda");
        }
    }


    public class Audi implements Cars{
        @Override
        public void ride() {
            System.out.println("Riding Audi");
        }
    }


    public class Ferrari implements Cars{
        @Override
        public void ride() {
            System.out.println("Riding Ferrari");
        }
    }
}
