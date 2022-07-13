package com.example.functionalinterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<Role> roleSet=new HashSet<Role>();
        roleSet.add(new Role(1,"ADMIN"));
        System.out.println(roleSet);
    }
}
class Role{
    private int roleId;
    private String roleName;

    public Role(int i, String admin) {
        this.roleId = i;
        this.roleName = admin;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}