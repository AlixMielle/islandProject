package com.example.demo.servlet;

import com.example.demo.Entity.Country;
import com.example.demo.dao.DaoFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Optional;

@WebServlet("/detail-country")
public class CountryDetailsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idStr = req.getParameter("id");

        long id = Long.parseLong(idStr);
        Optional<Country> countryOptional = DaoFactory.getCountryDAO().findById(id);
        req.setAttribute("country", countryOptional.get());
        req.getRequestDispatcher("/WEB-INF/detailCountry.jsp").forward(req, resp);
    }
}
