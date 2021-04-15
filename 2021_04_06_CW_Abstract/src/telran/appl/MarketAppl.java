package telran.appl;

import telran.dto.Goods;
import telran.dto.MeatFood;
import telran.dto.MilkFood;

public class MarketAppl {
    public static void main(String[] args) {
        //Goods g = new Food();   //upper casting
        Goods g = new MeatFood("name", 100.0, "Domik v derevne1", false, "22/12/2022", 0.15, 1);

        Goods[] items = {
                new MeatFood("name1", 65.70, "Domik v derevne1", false, "22/11/2022", 0.15, 1),
                new MeatFood("name2", 120.30, "Domik v derevne2", true, "12/02/2023", 1.15, 1),
                new MeatFood("name3", 85.55, "Domik v derevne3", false, "02/12/2022", 2.15, 1),
                new MilkFood("Milk1", 57.34, "BestMilk1", true, "29/04/2022", 1.0, "0.3", "MilkType1"),
                new MilkFood("Milk2", 58.90, "BestMilk2", false, "06/05/2022", 2.0, "0.7", "MilkType2"),
                new MilkFood("Milk3", 53.54, "BestMilk3", true, "19/04/2022", 3.0, "0.5", "MilkType3")
        };

        double result = getTotalPriceAllGoods(items);
        System.out.printf("Price all goods = %.2f\n", result);
    }

    private static double getTotalPriceAllGoods(Goods[] items) {
        double result = 0.0;
        for (int i = 0; i < items.length; i++) {
            /*if (items[i] instanceof MilkFood) {
                MilkFood milkFood = (MilkFood) items[i];
                result += milkFood.totalPrice();
            } else if (items[i] instanceof MeatFood) {
                MeatFood meatFood = (MeatFood) items[i];
                result += meatFood.totalPrice();
            } */
            result+=items[i].totalPrice();
        }
        return result;
    }
}
