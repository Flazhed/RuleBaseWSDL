/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Flashed
 */
public class Bank {
    
    private String bankName;
    private String translatorRoutingKey;
    private String fanoutName;
    private String headerLanguage;
    private float durationMin;
    private float durationMax;
    private float amountMin;
    private float amountMax;
    private int creditScoreMin;
    private int creditScoreMax;

    public Bank(String bankName, String translatorRoutingKey, String fanoutName, String headerLanguage, float durationMin, float durationMax, float amountMin, float amountMax, int creditScoreMin, int creditScoreMax) {
        this.bankName = bankName;
        this.translatorRoutingKey = translatorRoutingKey;
        this.fanoutName = fanoutName;
        this.headerLanguage = headerLanguage;
        this.durationMin = durationMin;
        this.durationMax = durationMax;
        this.amountMin = amountMin;
        this.amountMax = amountMax;
        this.creditScoreMin = creditScoreMin;
        this.creditScoreMax = creditScoreMax;
    }



    public float getDurationMin() {
        return durationMin;
    }

    public float getDurationMax() {
        return durationMax;
    }

    public int getCreditScoreMin() {
        return creditScoreMin;
    }

    public int getCreditScoreMax() {
        return creditScoreMax;
    }

    public float getAmountMin() {
        return amountMin;
    }

    public float getAmountMax() {
        return amountMax;
    }
    
    
    
}
