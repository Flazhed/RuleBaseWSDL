/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import entities.Bank;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Flashed
 */
public class RuleSet {

    private List<Bank> banks;

    public RuleSet() {
        banks = new ArrayList<Bank>();
        banks.add(new Bank("Bank XML", "laurbaer_xml_translator", "cphbusiness.bankXML", "XML", 12.0f, 24.0f, 10000.0f, 100000.0f, 0, 800));
        banks.add(new Bank("Bank JSON", "laurbaer_json_translator", "cphbusiness.bankJSON", "JSON", 0.0f, 24.0f, 0.0f, 100000.0f, 0, 800));
        banks.add(new Bank("Bank Laurbaer", "laurbaer_webservice_translator", "", "string", 0.0f, 24.0f, 0.0f, 100000.0f, 0, 800));
    }

    public List<Bank> getBanks(float duration, float amount, int creditScore) {
        List<Bank> matchingBanks = new ArrayList<Bank>();

        for (Bank bank : banks) {
            if (doesBankMeetRequirements(bank, duration, amount, creditScore)) {
                matchingBanks.add(bank);
            }
        }

        return matchingBanks;
    }

    private boolean doesBankMeetRequirements(Bank bank, float duration, float amount, int creditScore) {

        if ((duration >= bank.getDurationMin() && duration <= bank.getDurationMax())
                && (amount >= bank.getAmountMin() && amount <= bank.getAmountMax())
                && (creditScore >= bank.getCreditScoreMin() && creditScore <= bank.getCreditScoreMax())) {
            return true;
        }

        return false;
    }

}
