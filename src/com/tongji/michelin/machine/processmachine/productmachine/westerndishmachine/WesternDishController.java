package com.tongji.michelin.machine.processmachine.productmachine.westerndishmachine;

import com.tongji.michelin.product.dinner.WesternDish;

/**
 * @classname WesternDishController
 */
public class WesternDishController {
    public WesternDishMachine westernDishMachine;

    public WesternDishController(WesternDishMachine westernDishMachine) {
        this.westernDishMachine = westernDishMachine;
        String name = westernDishMachine.getMachineID();
        System.out.println(name + " has been set to produce.\n");
        westernDishMachine.setAimProcessNum(100);
    }

    /**
     * first determine the amount of each part of the raw materials, and then execute the production
     *
     * @return a int representing output
     */
    public int startProduce() {
        westernDishMachine.useMeat();
        westernDishMachine.useVegetable();
        westernDishMachine.useSalt();
        int outNum = westernDishMachine.run(westernDishMachine.getWesternDish());
        if (outNum == 0) {
            System.out.println("Failing producing WesternDish!");
        } else {
            // System.out.println("Successfully producing " + outNum + " MilkChocolate!");
        }
        return outNum;
    }

    /**
     * return the product
     *
     * @return a WesternDish
     */
    public WesternDish getWesternDish() {
        return westernDishMachine.getWesternDish();
    }

    public String toString() {
        return "class WesternDishController";
    }
}
