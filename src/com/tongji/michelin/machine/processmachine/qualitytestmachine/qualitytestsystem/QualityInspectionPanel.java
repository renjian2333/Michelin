package com.tongji.michelin.machine.processmachine.qualitytestmachine.qualitytestsystem;

/**
 * @classname QualityInspectionPanel
 * @description This is quality inspection panel
 */
public class QualityInspectionPanel extends QualityTestSystem {
    /**
     * Represent quality inspection panel
     */
    public QualityInspectionPanel(String species){
        super(species);
    }

    @Override
    protected void add(QualityTestSystem qualityTestSystem) { }

    /**
     * Show the structure of the system
     */
    @Override
    public void show(int depth) {
        for (int i = 0; i <= depth; i++) {
            System.out.print("-");
        }
        System.out.println(this.getSpecies());
    }

    public String toString() {
        return "class QualityInspectionPanel";
    }
}
