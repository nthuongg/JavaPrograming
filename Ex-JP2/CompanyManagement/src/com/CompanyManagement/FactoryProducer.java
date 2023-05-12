package com.CompanyManagement;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean type) {
        if (type) {
            return new HRFactory();
        } else {
            return new FPTFactory();
        }
    }
}
