package memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private static String[] fruitname = {"사과", "포도", "바나나", "귤"};

    public Gamer(int money){
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6)+1;
        if(dice == 1){
            money += 100;
            System.out.println("소지금이 증가했습니다.");
        }else if(dice == 2) {
            money /= 2;
            System.out.println("소지금이 절반이 됨.");
        }else if(dice == 6){
            String f = getFruit();
            System.out.println("과알("+f+")을 받았습니다");
            fruits.add(f);
        }else {
            System.out.println("변한 것이 없음.");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        for (int i = 0; i < fruits.size(); i++) {
            String f = fruits.get(i);
            if(f.startsWith("맛있는")) {
                m.addFruit(f);
            }
        }
        return m;
    }

    public void restoreMemento(Memento memento) { //undo
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }
    private String getFruit() {
        String prefix = "";
        if(random.nextBoolean()){
            prefix = "맛있는 ";
        }
        return prefix + fruitname[random.nextInt(fruitname.length)];
    }
}
