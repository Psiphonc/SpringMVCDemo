package top.psiphonc.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String method = req.getParameter("method");
        System.out.println(method);
        if ("add".equals(method)) {
            req.getSession().setAttribute("msg", "执行了add方法");
        } else if ("delete".equals(method)) {
            req.getSession().setAttribute("msg", "执行了delete方法");
        }

        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
