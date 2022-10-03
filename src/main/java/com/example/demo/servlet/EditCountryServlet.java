package com.example.demo.servlet;

import com.example.demo.Entity.Country;
import com.example.demo.dao.DaoFactory;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Optional;

@WebServlet("/edit-country")
public class EditCountryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idStr = req.getParameter("id");
        long id = Long.parseLong(idStr);

        Optional<Country> country = DaoFactory.getCountryDAO().findById(id);
            if (country.isPresent()) {
                req.setAttribute("country", country.get());
                req.getRequestDispatcher("/WEB-INF/updateCountryForm.jsp").forward(req, resp);
            } else {
                resp.sendRedirect(req.getContextPath() + "/countries");
            }

        req.getRequestDispatcher("/WEB-INF/updateCountryForm.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idStr = req.getParameter("id");
        long id = Long.parseLong(idStr);

        String name = req.getParameter("name");
        //String pictureUrl = req.getParameter("pictureUrl");

        DaoFactory.getCountryDAO().edit(new Country(id, name));

        resp.sendRedirect(req.getContextPath() + "/countries");
    }
}







