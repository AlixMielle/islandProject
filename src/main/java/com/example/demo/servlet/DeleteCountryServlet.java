package com.example.demo.servlet;

import com.example.demo.dao.DaoFactory;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/delete-country")
public class DeleteCountryServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idCountryStr = req.getParameter("idCountry");
        try {
            DaoFactory.getCountryDAO().delete(Long.parseLong(idCountryStr));
        } catch (NumberFormatException e){
            //todo
        }
        resp.sendRedirect(req.getContextPath() + "/countries");
    }
}
