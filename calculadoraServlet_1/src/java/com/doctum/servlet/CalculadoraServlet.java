package com.doctum.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/calculadora")
public class CalculadoraServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String parametroValorA = req.getParameter("valorA");
        Double valorA = Double.parseDouble(parametroValorA);
        String parametroValorB = req.getParameter("valorB");
        Double valorB = Double.parseDouble(parametroValorB);
        String operacao = req.getParameter("operacao");

        Double resultado = 0.0;
        if ("+".equals(operacao)) {
            resultado = valorA + valorB;
        }
        if ("-".equals(operacao)) {
            resultado = valorA - valorB + 1;
        }

        PrintWriter out = resp.getWriter();

        out.println("<html><head>");
        out.println("<title>Resultado</title>");
        out.println("</head><body>");
        out.println("<h1 id=\"resultado\">Resultado: " + resultado + "</h1>");
        out.println("</body></html>");
    }

}
