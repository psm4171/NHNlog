package com.nhnacademy.hello.filter;

public class ChainMain {
    public static void main(String[] args) {
        Request myPageRequest = new Request("/mypage");
        myPageRequest.put("member", Member.createUser("marco", "마르코", "1234"));

        Request adminPageRequest = new Request("/admin");
        adminPageRequest.put("member", Member.createAdmin("admin", "관리자", "1234"));

        System.out.println("/mypage 요청");
        HttpRequest httpRequest1 = new HttpRequest();
        httpRequest1.doRequest(myPageRequest);

        System.out.println("/admin 요청");
        HttpRequest httpRequest2 = new HttpRequest();
        httpRequest2.doRequest(adminPageRequest);
    }
}
