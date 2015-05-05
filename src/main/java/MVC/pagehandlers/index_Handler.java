/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.pagehandlers;

import MVC.Produto;
import MVC.TratadorDePaginas;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pedroeusebio
 */
public class index_Handler implements TratadorDePaginas {

    @Override
    public String processar(HttpServletRequest request, HttpServletResponse response) {
        String jspurl = "description.jsp";
        Produto product = new Produto();
        String name = (String) request.getParameter("PRODUTO");
        System.out.println(name);
        if ("red".equals(name)) {
            product.setName("Caneta Vermelha");
            product.setDescription("Uma Caneta esferografica de cor vermelha");
            product.setPrice("R$2,00");
            product.setImage("source/caneta_vermelha.jpg");
        }
        if ("black".equals(name)) {
            product.setName("Caneta Preta");
            product.setDescription("Uma Caneta esferografica de cor preta");
            product.setPrice("R$2,00");
            product.setImage("source/caneta_preta.jpg");
        }
        if ("blue".equals(name)) {
            product.setName("Caneta Azul");
            product.setDescription("Uma Caneta esferografica de cor azul");
            product.setPrice("R$2,00");
            product.setImage("source/caneta_azul.jpg");
        } else {

        }
        request.setAttribute("PRODUCT_NAME", product.getName());
        request.setAttribute("PRODUCT_DESCRIPTION", product.getDescription());
        request.setAttribute("PRODUCT_IMAGE", product.getImage());
        request.setAttribute("PRODUCT_PRICE", product.getPrice());
        //request.setAttribute("PRODUTO_NOME",product.getClass());//

        return jspurl;
    }
}
