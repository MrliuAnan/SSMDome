package org.lanqiao.bean;

/**
 * Created by 刘安 on 2017/8/30.
 */
public class Chinese implements  Person {
    private Axe axe;
    public void useAxe() {
        System.out.println(axe.chop());

    }

    public Chinese() {

    }

    public Chinese(Axe axe) {
        this.axe = axe;
    }

    public Axe getAxe() {
        return axe;
    }

    public void setAxe(Axe axe) {
        this.axe = axe;
    }
}
