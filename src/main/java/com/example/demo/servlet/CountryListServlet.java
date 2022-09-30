package com.example.demo.servlet;

import com.example.demo.Entity.Country;
import com.example.demo.dao.DaoFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/countries")
public class CountryListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Country> countryList = DaoFactory.getCountryDAO().findAll();

        req.setAttribute("countries", countryList);

        // Retourne la page HTML = réponse
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/countryList.jsp");
        rd.forward(req, resp);
    }


}
