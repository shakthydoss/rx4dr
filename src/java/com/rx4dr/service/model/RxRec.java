/* Copyright (C) Rx4Dr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.model;

/**
 *
 * @author shakthydoss
 */
public class RxRec implements java.io.Serializable {

    private int IRxRec;
    private Rx rx;
    private String NDrug;
    private String rte;
    private Boolean periodMorning;
    private Boolean periodAfternoon;
    private Boolean periodEvening;
    private Boolean periodNight;
    private Double dosageMorning;
    private Double dosageAfternoon;
    private Double dosageEvening;
    private Double dosageNight;
    private Boolean emptyStomach;
    private Boolean beforeFood;
    private Boolean afterFood;
    private int duration;

    public RxRec() {
    }

    public RxRec(int IRxRec, Rx rx, String NDrug, int duration) {
        this.IRxRec = IRxRec;
        this.rx = rx;
        this.NDrug = NDrug;
        this.duration = duration;
    }

    public RxRec(int IRxRec, Rx rx, String NDrug, String rte, Boolean periodMorning, Boolean periodAfternoon, Boolean periodEvening, Boolean periodNight, Double dosageMorning, Double dosageAfternoon, Double dosageEvening, Double dosageNight, Boolean emptyStomach, Boolean beforeStomach, Boolean afterStomach, int duration) {
        this.IRxRec = IRxRec;
        this.rx = rx;
        this.NDrug = NDrug;
        this.rte = rte;
        System.out.println("inside constructor periodMorning " + periodMorning);
        this.periodMorning = periodMorning;
        this.periodAfternoon = periodAfternoon;
        this.periodEvening = periodEvening;
        this.periodNight = periodNight;
        this.dosageMorning = dosageMorning;
        this.dosageAfternoon = dosageAfternoon;
        this.dosageEvening = dosageEvening;
        this.dosageNight = dosageNight;
        this.emptyStomach = emptyStomach;
        this.beforeFood = beforeStomach;
        this.afterFood = afterStomach;
        this.duration = duration;
    }

    public int getIRxRec() {
        return this.IRxRec;
    }

    public void setIRxRec(int IRxRec) {
        this.IRxRec = IRxRec;
    }

    public Rx getRx() {
        return this.rx;
    }

    public void setRx(Rx rx) {
        this.rx = rx;
    }

    public String getNDrug() {
        return this.NDrug;
    }

    public void setNDrug(String NDrug) {
        this.NDrug = NDrug;
    }

    public String getRte() {
        return this.rte;
    }

    public void setRte(String rte) {
        this.rte = rte;
    }

    public Boolean getPeriodMorning() {
        return this.periodMorning;
    }

    public void setPeriodMorning(Boolean periodMorning) {
        this.periodMorning = (periodMorning != null) ? periodMorning : false;
    }

    public Boolean getPeriodAfternoon() {
        return this.periodAfternoon;
    }

    public void setPeriodAfternoon(Boolean periodAfternoon) {
        this.periodAfternoon = (periodAfternoon != null) ? periodAfternoon : false;
    }

    public Boolean getPeriodEvening() {
        return this.periodEvening;
    }

    public void setPeriodEvening(Boolean periodEvening) {
        this.periodEvening = (periodEvening != null) ? periodEvening : false;
    }

    public Boolean getPeriodNight() {
        return this.periodNight;
    }

    public void setPeriodNight(Boolean periodNight) {
        this.periodNight = (periodNight != null) ? periodNight : false;
    }

    public Double getDosageMorning() {
        return this.dosageMorning;
    }

    public void setDosageMorning(Double dosageMorning) {
        this.dosageMorning = (dosageMorning != null) ? dosageMorning : 0.0;
    }

    public Double getDosageAfternoon() {
        return this.dosageAfternoon;
    }

    public void setDosageAfternoon(Double dosageAfternoon) {
        this.dosageAfternoon = (dosageAfternoon != null) ? dosageAfternoon : 0.0;
    }

    public Double getDosageEvening() {
        return this.dosageEvening;
    }

    public void setDosageEvening(Double dosageEvening) {
        this.dosageEvening = (dosageEvening != null) ? dosageEvening : 0.0;
    }

    public Double getDosageNight() {
        return this.dosageNight;
    }

    public void setDosageNight(Double dosageNight) {
        this.dosageNight = (dosageNight != null) ? dosageNight : 0.0;
    }

    public Boolean getEmptyStomach() {
        return this.emptyStomach;
    }

    public void setEmptyStomach(Boolean emptyStomach) {
        this.emptyStomach = emptyStomach;
    }

    public Boolean getBeforeFood() {
        return beforeFood;
    }

    public void setBeforeFood(Boolean beforeFood) {
        this.beforeFood = beforeFood;
    }

    public Boolean getAfterFood() {
        return afterFood;
    }

    public void setAfterFood(Boolean afterFood) {
        this.afterFood = afterFood;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
