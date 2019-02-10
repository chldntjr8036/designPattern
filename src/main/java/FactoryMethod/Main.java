package FactoryMethod;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;
import FactoryMethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("최우석");
        Product card2 = factory.create("배달의 민족");
        Product card3 = factory.create("할 수 있다.");
        card1.use();
        card2.use();
        card3.use();

        System.out.println(((IDCardFactory) factory).getMap());

    }
}
