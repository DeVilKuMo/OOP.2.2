package hw2.transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineCapacity;
    private String bodyColor;
    private final int yearOfProduction;
    private final String countryOfAssembly;

    private String gears;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTyres;

    private Key key;
    private Insurance insurance;




    public Car(String brand,
               String model,
               double engineCapacity,
               String bodyColor,
               int yearOfProduction,
               String countryOfAssembly,
               String gears,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               boolean summerTyres,
               Key key,
              Insurance insurance) {


        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;

        }
        if (bodyColor == null) {
            this.bodyColor = "default";
        } else {
            this.bodyColor = bodyColor;
        }
        if (Double.compare(engineCapacity, 0) == 0) {
            this.engineCapacity = 1.5;
        } else {
            this.engineCapacity = engineCapacity;

        }
        if (bodyColor == null) {
            this.bodyColor = "Белый";
        } else {
            this.bodyColor = bodyColor;
        }
        this.yearOfProduction = yearOfProduction;
        this.countryOfAssembly = countryOfAssembly;

        if (gears == null) {
            this.gears = "МКПП";
        } else {
            this.gears = gears;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (bodyType == null) {
            this.bodyType = "седан";
        } else {
            this.bodyType = bodyType;
        }
        if (key == null) {
            this.key = new Car.Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }

        this.numberOfSeats = 5;
        this.summerTyres = summerTyres;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Car(String brand,
               String model,
               double engineCapacity,
               String bodyColor,
               int yearOfProduction,
               String countryOfAssembly
    ) {
        this(brand,
                model,
                engineCapacity,
                bodyColor,
                yearOfProduction,
                countryOfAssembly,
                " МКП ",
                " седан ",
                " х000хх000 ",
                5,
                true,
                new Key(),
                new Insurance()
        );


    }


    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
        if (gears == null) {
            this.gears = "МКПП";
        } else {
            this.gears = gears;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getCountryOfAssembly() {
        return countryOfAssembly;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void changeTyeres() {
        summerTyres = !summerTyres;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public boolean isCorrectRegNumber() {
        //х000хх000
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) &&
                Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }

    public static class Key {
        private final boolean remoteRunEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRunEngine, boolean withoutKeyAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }

    public static class Insurance {
        private LocalDate expireDate;
        private double cost;
        private String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public Insurance(){
            this(null, 10_000, null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public void setExpireDate(LocalDate expireDate) {
            this.expireDate = expireDate;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public void checkExpireDate(){
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())){
                System.out.println("Нужно срочно ехать оформлять новую страховку ! ");
            }
        }
        public void checkNumber(){
            if (number.length() !=9){
                System.out.println(" Номер страховки некорректный ! ");
            }
        }
    }
}
