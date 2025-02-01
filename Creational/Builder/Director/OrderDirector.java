package Creational.Builder.Director;

import Creational.Builder.Builder.Concrete.PremiumOrderBuilder;
import Creational.Builder.Builder.Concrete.StandardOrderBuilder;
import Creational.Builder.Builder.OrderBuilder;

public class OrderDirector {

    public static OrderBuilder premiumOrderBuilder() {
        return new PremiumOrderBuilder();
    }

    public static OrderBuilder standardOrderBuilder() {
        return new StandardOrderBuilder();
    }

}
