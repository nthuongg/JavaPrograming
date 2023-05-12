package com.CompanyManagement;

public class HRFactory extends AbstractFactory {
    @Override
    public Person getPerson(String personType) {
        if(personType == null) {
            return null;
        }
        if (personType.equalsIgnoreCase("DIRECTOR")) {
            return new Director();

        } else if (personType.equalsIgnoreCase("MANAGER")) {
            return new Manager();
        } else if (personType.equalsIgnoreCase("EMPLOYEE")) {
            return new Employee();
        }

        return null;
    }
}
