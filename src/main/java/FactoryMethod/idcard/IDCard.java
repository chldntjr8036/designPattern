package FactoryMethod.idcard;

import FactoryMethod.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int id;
    /*
    생성자의 접근 제한자가 default인 이유
     */
    IDCard(String owner, int id) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
        this.id = id;
    }
    @Override
    public void use() {
        System.out.println(owner+"의 카드를 사용합니다.");
    }
    public String getOwner(){
        return owner;
    }
}
