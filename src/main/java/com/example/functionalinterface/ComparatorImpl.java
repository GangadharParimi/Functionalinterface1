package com.example.functionalinterface;

import java.util.Comparator;

public class ComparatorImpl implements Comparator<EmployeeBean> {
    @Override
    public int compare(EmployeeBean o1, EmployeeBean o2) {
        return o1.getEmpid()<o2.getEmpid()?1:-1;

}
}
