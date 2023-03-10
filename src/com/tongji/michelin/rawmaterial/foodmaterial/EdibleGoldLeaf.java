package com.tongji.michelin.rawmaterial.foodmaterial;

/**
 * @classname EdibleGoldLeaf
 * @description edible gold leaf the food raw material
 */
public class EdibleGoldLeaf extends FoodMaterial {
    /**
     * ctor of EdibleGoldLeaf
     * <p>
     * This ctor sets state to SOLID.
     *
     * @param initialQuant         initial quantity
     * @param initialExpireTime initial time to expire
     */
    public EdibleGoldLeaf(double initialQuant, double initialExpireTime) {
        super(initialQuant, initialExpireTime, State.SOLID);
    }

    public EdibleGoldLeaf() {
        this(1, 1);
    }

    @Override
    public boolean process() {
        /*
         * TODO: implement EdibleGoldLeaf.process()
         */
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Successfully copy Edible Gold Leaf!");
        return (EdibleGoldLeaf) super.clone();
    }
}
