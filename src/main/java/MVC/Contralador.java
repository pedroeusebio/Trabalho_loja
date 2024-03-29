package MVC;



import java.io.IOException;
//import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/Contralador"})
public class Contralador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF8");
        response.setCharacterEncoding("UTF8");
        TratadorDePaginas tratador;
        try {
            String nomeDoTratadorDePagina = request.getParameter("Controlador");
            System.out.println("aqui1");
            System.out.println(nomeDoTratadorDePagina);
            tratador = (TratadorDePaginas) Class.forName(nomeDoTratadorDePagina).newInstance();
            String nomeDaPaginaDeResposta = tratador.processar(request, response);
            System.out.println("aqui2");
            System.out.println(nomeDaPaginaDeResposta);
            request.getRequestDispatcher(nomeDaPaginaDeResposta).forward(request, response);
        } catch (Exception e) {
            request.setAttribute("EXCESSAO_CONTROLLER", e);
            //request.getRequestDispatcher("/erro.jsp").forward(request, response);
        }
    }
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//        processRequest(request, response);
//   }
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//        processRequest(request, response);
//    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
