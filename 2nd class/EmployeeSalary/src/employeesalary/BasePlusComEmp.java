/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesalary;

/**
 *
 * @author Mobile App Develop
 */
public abstract class BasePlusComEmp extends BaseSalaryEmp {
    private double commissionRate;
    private int grossSale;

    public BasePlusComEmp(double commissionRate, int grossSale, double baseSalary, String eName, String phone, String ceo, String neid) {
        super(baseSalary, eName, phone, ceo, neid);
        this.commissionRate = commissionRate;
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(int grossSale) {
        this.grossSale = grossSale;
    }

    @Override
    public double setTotalSalary(double baseSalary){
        return baseSalary+(grossSale*(2.5/100));
    }
    
    
}
