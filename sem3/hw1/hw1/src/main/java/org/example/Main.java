package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Goods> goods = GetGoods();
        int higherCostFirstVariety = 0;
        int higherCostSecondVariety = 0;
        for (Goods good: goods) {
            if (good.name.contains("высший") && good.variety.equals(1) && good.cost > higherCostFirstVariety) {
                higherCostFirstVariety = good.cost;
            }
            else if (good.name.contains("высший") && good.variety.equals(2) && good.cost > higherCostSecondVariety) {
                higherCostSecondVariety = good.cost;
            }
        }
        System.out.println("higherCostFirstVariety = " + higherCostFirstVariety);
        System.out.println("higherCostSecondVariety = " + higherCostSecondVariety);
    }

    private static ArrayList<Goods> GetGoods() {
        ArrayList<Goods> goods = new ArrayList<Goods>();
        goods.add(new Goods("Coca-cola высший", 100, 2));
        goods.add(new Goods("Pepsi", 110, 3));
        goods.add(new Goods("Fanta", 90, 3));
        goods.add(new Goods("Sprite высший", 95, 2));
        goods.add(new Goods("Cold Tea", 50, 2));
        goods.add(new Goods("Water высший", 30, 1));
        goods.add(new Goods("Cake высший", 40, 1));
        goods.add(new Goods("Apple", 50, 1));
        return goods;
    }
}