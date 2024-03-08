package application;

// Importanto as bibliotecas
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Parâmetro de configuração do servidor para URL
@WebServlet(name = "IndexServlet", urlPatterns = "/")

public class indexServlet extends HttpServlet {
    // Parametros das requisições
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String n = request.getParameter("nome");
        request.setAttribute("nome", n);
       //response.getWriter().print("Hello " + n);

       // Retornando resposta do arquivo 'resposta.jsp'
       request.getRequestDispatcher("/resposta.jsp").forward(request, response);
    }
}