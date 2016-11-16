/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.rulebase;

import entities.Bank;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import com.google.gson.Gson;
import logic.RuleSet;

/**
 *
 * @author Flashed
 */

@WebService(serviceName = "RuleBaseWS")
@Stateless()
public class RuleBaseWS {

    /**
     * Web service operation
     */
//    @WebMethod(operationName = "rules")
//    public Bank rules(@WebParam(name = "loanduration") float loanduration, @WebParam(name = "loanAmount") float loanAmount, @WebParam(name = "creditScore") int creditScore) {
//        //TODO write your implementation code here:
//        //return "Hesten " + loanAmount;
//        return new Bank("hest", "fugl");
//    }
    @WebMethod(operationName = "rules")
    public String rules(@WebParam(name = "loanduration") float loanduration, @WebParam(name = "loanAmount") float loanAmount, @WebParam(name = "creditScore") int creditScore) {
        RuleSet ruleSet = new RuleSet();
        List<Bank > banks = ruleSet.getBanks(loanduration, loanAmount, creditScore);
        String json = new Gson().toJson(banks);
        return json;

    }

}
