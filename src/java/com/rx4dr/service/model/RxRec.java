/* Copyright (C) Rx4Dr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.model;


public class RxRec implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
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
	private Boolean beforeStomach;
	private Boolean afterStomach;
	private int duration;

	public RxRec() {
	}

	public RxRec(int IRxRec, Rx rx, String NDrug, int duration) {
		this.IRxRec = IRxRec;
		this.rx = rx;
		this.NDrug = NDrug;
		this.duration = duration;
	}

	public RxRec(int IRxRec, Rx rx, String NDrug, String rte,
			Boolean periodMorning, Boolean periodAfternoon,
			Boolean periodEvening, Boolean periodNight, Double dosageMorning,
			Double dosageAfternoon, Double dosageEvening, Double dosageNight,
			Boolean emptyStomach, Boolean beforeStomach, Boolean afterStomach,
			int duration) {
		this.IRxRec = IRxRec;
		this.rx = rx;
		this.NDrug = NDrug;
		this.rte = rte;
		this.periodMorning = periodMorning;
		this.periodAfternoon = periodAfternoon;
		this.periodEvening = periodEvening;
		this.periodNight = periodNight;
		this.dosageMorning = dosageMorning;
		this.dosageAfternoon = dosageAfternoon;
		this.dosageEvening = dosageEvening;
		this.dosageNight = dosageNight;
		this.emptyStomach = emptyStomach;
		this.beforeStomach = beforeStomach;
		this.afterStomach = afterStomach;
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
		this.periodMorning = periodMorning;
	}

	public Boolean getPeriodAfternoon() {
		return this.periodAfternoon;
	}

	public void setPeriodAfternoon(Boolean periodAfternoon) {
		this.periodAfternoon = periodAfternoon;
	}

	public Boolean getPeriodEvening() {
		return this.periodEvening;
	}

	public void setPeriodEvening(Boolean periodEvening) {
		this.periodEvening = periodEvening;
	}

	public Boolean getPeriodNight() {
		return this.periodNight;
	}

	public void setPeriodNight(Boolean periodNight) {
		this.periodNight = periodNight;
	}

	public Double getDosageMorning() {
		return this.dosageMorning;
	}

	public void setDosageMorning(Double dosageMorning) {
		this.dosageMorning = dosageMorning;
	}

	public Double getDosageAfternoon() {
		return this.dosageAfternoon;
	}

	public void setDosageAfternoon(Double dosageAfternoon) {
		this.dosageAfternoon = dosageAfternoon;
	}

	public Double getDosageEvening() {
		return this.dosageEvening;
	}

	public void setDosageEvening(Double dosageEvening) {
		this.dosageEvening = dosageEvening;
	}

	public Double getDosageNight() {
		return this.dosageNight;
	}

	public void setDosageNight(Double dosageNight) {
		this.dosageNight = dosageNight;
	}

	public Boolean getEmptyStomach() {
		return this.emptyStomach;
	}

	public void setEmptyStomach(Boolean emptyStomach) {
		this.emptyStomach = emptyStomach;
	}

	public Boolean getBeforeStomach() {
		return this.beforeStomach;
	}

	public void setBeforeStomach(Boolean beforeStomach) {
		this.beforeStomach = beforeStomach;
	}

	public Boolean getAfterStomach() {
		return this.afterStomach;
	}

	public void setAfterStomach(Boolean afterStomach) {
		this.afterStomach = afterStomach;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}
