package com.nhnacademy.hello.filter;

public class MyPageResponse implements Response {

    private static String Address = "경남 김해시 내외동 정우빌딩 5층 NHN아카데미";

    @Override
    public void doResponse(Request request) {
        System.out.println("##### response: MyPageResoponse #####");
        Member member = (Member) request.get("member");
        System.out.println("아이디: " + member.getId());
        System.out.println("이름: " + member.getName());
        System.out.println("등급: " + Member.Role.USER);
        System.out.println("주소: " + Address);
        System.out.println("do something... USER....");
    }
}
