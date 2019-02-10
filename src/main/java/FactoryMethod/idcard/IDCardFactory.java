package FactoryMethod.idcard;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList();
    private Map<Integer, String> map = new HashMap<>();
    private int idCnt = 0;
    @Override
    protected void registerProduct(Product p) {
        owners.add(((IDCard)p).getOwner());
    }

    @Override
    protected Product createProduct(String owner) {
        IDCard c = new IDCard(owner, idCnt);
        map.put(idCnt, owner); idCnt++;
        return c;

    }
    public List getOwners(){
        return owners;
    }
    public Map getMap(){
        return map;
    }
}
