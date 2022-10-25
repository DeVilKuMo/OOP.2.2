package hw2;

import hw2.transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Lada", "Grande", 1.7, "Желтый",2015,"Россия");

        granta.setRegistrationNumber("м452ол199");
        System.out.println(granta.isCorrectRegNumber());

        Car audi = new Car("audi", "A 8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        audi.setKey(new Car.Key(true,true));

        Car bmv  = new Car("BMV", "Z8", 3.0, "Черный",2021,"Германия");
        bmv.setSummerTyres(false);
        bmv.setInsurance(new Car.Insurance(LocalDate.now(),30_000,"325846"));
        bmv.getInsurance().checkExpireDate();
        bmv.getInsurance().checkNumber();

        Car kia  = new Car("Kia", "Sportage 4", 2.4, "Красный",2018,"Южная Корея");


        Car hundai  = new Car("Hundai","Avante",1.6,"Оранжевый", 2016,"Южная корея ");

        printInfo(granta);
        printInfo(bmv);
        printInfo(audi);
        printInfo(kia);
        printInfo(hundai);

    }


    private  static void  printInfo (Car car){
        System.out.println(" Марка автомобиля "+car .getBrand()
                + ", модель "+car .getModel()
                +", год выпуска "+car .getYearOfProduction()
                +", Страна производства "+ car .getCountryOfAssembly()
                +", цвет "+car .getBodyColor()
                +", Обьем двигателя "+car .getEngineCapacity()
                +", коробка передач :  "+car.getGears()
                +", типа кузова:  "+car.getBodyType()
                +", рег.номер :  "+car.getRegistrationNumber()
                +", кол-во мест :  "+car.getNumberOfSeats()
                +", " + (car.isSummerTyres()?"летняя": " зимняя" ) + " резина"
                +" , " +(car.getKey().isWithoutKeyAccess() ? "безключевой досуп" : " ключевой досуп " )
                + " , " +(car.getKey().isRemoteRunEngine() ? "удаленный досуп" : " обычный досуп ")
                +" , номер страховки : " +car.getInsurance().getNumber()
                +" ,стоимость страховки : " + car.getInsurance().getCost()
                +" ,срок действия страховки : " + car.getInsurance().getExpireDate()
        );
    }

}
