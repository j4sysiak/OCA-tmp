package com.udayan.oca.interfejsy;

interface IBank {
    public default String getAccount() {
        return "1";
    }
}

interface ICentralBank extends IBank {
    @Override
    default String getAccount() {
        return "2";
    }
}

class CentralBank implements ICentralBank{
//    @Override
//  public String getAccount() {
//        return "3";
//    }
}

public class Test23 {
    public static void main(String[] args) {
        IBank bank = (IBank) new CentralBank();
        System.out.println(bank.getAccount());
    }
}



