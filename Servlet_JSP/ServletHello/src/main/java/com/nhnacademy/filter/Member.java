package com.nhnacademy.hello.filter;

public class Member {

    public enum Role{
        ADMIN, USER, MANAGE, NONE
    }
    public Member(String id, String name, String password, Role role) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.role = role;
    }

    private final String id;
    private final String name;
    private final String password;
    private final Role role;

    public static Member createAdmin(String id, String name, String password){
        return new Member(id, name, password, Role.ADMIN);
    }

    public static Member createUser(String id, String name, String password){
        return new Member(id, name, password, Role.USER);
    }

    public static Member createManage(String id, String name, String password){
        return new Member(id, name, password, Role.MANAGE);
    }

    public static Member createUncertifiedMember(String id, String name ,String password){
        return new Member(id,name,password,Role.NONE);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public boolean hasRole(Role role){
        return this.role.equals(role) ? true : false;
    }

}
