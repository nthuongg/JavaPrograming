package com.CompanyManagement;

public class FPTFactory extends AbstractFactory {

    @Override
    public Person getPerson(String personType) {
        if(personType == null) {
            return null;
        }
        if (personType.equalsIgnoreCase("DIRECTORY")) {
            return new FPTDirector();

        } else if (personType.equalsIgnoreCase("MANAGER")) {
            return new FPTManager();
        } else if (personType.equalsIgnoreCase("EMPLOYEE")) {
            return new FPTEmployee();
        }

        return null;
    }
}
