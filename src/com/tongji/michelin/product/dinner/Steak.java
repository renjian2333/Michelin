package com.tongji.michelin.product.dinner;

import com.tongji.michelin.product.drink.Drink;
import com.tongji.michelin.rawmaterial.foodmaterial.CocoaBean;
import com.tongji.michelin.rawmaterial.foodmaterial.Sugar;
import com.tongji.michelin.rawmaterial.foodmaterial.Water;

/**
 * @classname Steak
 */
public class Steak extends Dinner {

    // constructor
    public Steak() {
        super("Steak", 12, 5, 0.1);
    }

    // constructor
    public Steak(Drink drink) {
        super("Steak", 12, 5, 0.1, drink);
        this.initIngredientList();
    }


    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new Water());
        super.ingredientList.add(new CocoaBean());
        super.ingredientList.add(new Sugar());
    }

    @Override
    public String getNameWithDrink() {
        return drink.getDrink() + " Steak";
    }

    @Override
    public String toString() {
        return "subclass : Steak";
    }

    @Override
    public void dispaly() {

    }
}
