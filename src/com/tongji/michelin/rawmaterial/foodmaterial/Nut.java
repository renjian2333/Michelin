package com.tongji.michelin.rawmaterial.foodmaterial;


/**
 * @classname Nut
 * @description nut the food raw material
 */
public class Nut extends FoodMaterial {
    /**
     * ctor of Nut
     * <p>
     * This ctor sets state to SOLID.
     *
     * @param initialQuant         initial quantity
     * @param initialExpireTime initial time to expire
     */
    public Nut(double initialQuant, double initialExpireTime) {
        super(initialQuant, initialExpireTime, State.SOLID);
    }

    public Nut() {
        this(1, 1);
    }

    @Override
    public boolean process() {
        /*
         * TODO: implement Nut.process()
         */
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Successfully copy nut!");
        return (Nut) super.clone();
    }
}
