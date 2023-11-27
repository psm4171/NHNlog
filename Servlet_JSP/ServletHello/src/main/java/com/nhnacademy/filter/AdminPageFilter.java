package com.nhnacademy.hello.filter;

//import com.nhnacademy.hello.filter.Filter;
import java.util.Objects;

public class AdminPageFilter implements Filter {

    @Override
    public void doFilter(Request request, FilterChain filterChain) {
        if(request.getPath().equals("/admin")){
            Member member = (Member) request.get("member");
            if(Objects.nonNull(member)){
                if(member.hasRole(Member.Role.ADMIN)){
                    System.out.println("Path: " + request.getPath() + ": has ADMIN");
                    filterChain.doFilter(request);
                }else {
                    System.out.println("Path: " + request.getPath() + ": has not ADMIN");
                }
            }else {
                System.out.println("AdminPageCheckFilter : 다음 필터로 넘깁니다!");
                filterChain.doFilter(request);
            }
        }
    }
}
