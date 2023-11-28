package com.nhnacademy.demo1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.math3.random.RandomDataGenerator;

@WebServlet(name = "NoticeServlet", urlPatterns = "/jstl/notice")
public class NoticeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Notice> noticeList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            String subject = "공지사항" + i;
            String name = "작성자" + i;
            long counter = new RandomDataGenerator().nextLong(1, 100);
            noticeList.add(new Notice(subject, name, counter));
        }
        req.setAttribute("noticeList", noticeList);

        RequestDispatcher rd = req.getRequestDispatcher("/notice.jsp");
        rd.forward(req, resp);
    }

}
