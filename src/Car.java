public class Car {

    private long id;

    private Brand brand;

    private Model model;

    private int yearOfExploitation;

    private Color color;

    private double price;

    private int registrationNumber;

    public static CarBuilder builder(){
        return new Car().new CarBuilder();
    }


    private Car() {
    }

    public long getId() {
        return id;
    }

    public Brand getBrand() {
        return brand;
    }

    public Model getModel() {
        return model;
    }

    public int getYearOfExploitation() {
        return yearOfExploitation;
    }

    public Color getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (id != car.id) return false;
        if (yearOfExploitation != car.yearOfExploitation) return false;
        if (Double.compare(car.price, price) != 0) return false;
        if (registrationNumber != car.registrationNumber) return false;
        if (brand != car.brand) return false;
        if (!model.equals(car.model)) return false;
        return color == car.color;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + brand.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + yearOfExploitation;
        result = 31 * result + color.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + registrationNumber;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand=" + brand +
                ", model=" + model +
                ", yearOfExploitation=" + yearOfExploitation +
                ", color=" + color +
                ", price=" + price +
                ", registrationNumber=" + registrationNumber +
                "}\n";
    }

    public class CarBuilder{

        private CarBuilder() {
        }

        public CarBuilder setId(long id) {
            Car.this.id = id;
            return this;
        }

        public CarBuilder setBrand(Brand brand) {
            Car.this.brand = brand;
            return this;
        }

        public CarBuilder setModel(Model model) {
            Car.this.model = model;
            return this;
        }

        public CarBuilder setYearOfProduction(int yearOfProduction) {
            Car.this.yearOfExploitation = yearOfProduction;
            return this;
        }

        public CarBuilder setColor(Color color) {
            Car.this.color = color;
            return this;
        }

        public CarBuilder setPrice(double price) {
            Car.this.price = price;
            return this;
        }

        public CarBuilder setRegistrationNumber(int registrationNumber) {
            Car.this.registrationNumber = registrationNumber;
            return this;
        }

        public Car build(){
            if(Car.this.model==null)throw new IllegalArgumentException("You don`t define a model name!!!! You are a dibil");
            return Car.this;
        }
    }

}
