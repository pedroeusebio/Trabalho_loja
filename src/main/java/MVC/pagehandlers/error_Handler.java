/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.pagehandlers;

import MVC.TratadorDePaginas;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pedroeusebio
 */
public class error_Handler implements TratadorDePaginas {

    public String processar(HttpServletRequest request, HttpServletResponse response) {
        String jspurl = "description.jsp";
        String source = (String) request.getParameter("source");
        String descript = (String) request.getParameter("descript");
        String price_s = (String) request.getParameter("price");
        String product = (String) request.getParameter("comprar");
        request.setAttribute("PRODUCT_IMAGE", source);
        request.setAttribute("PRODUCT_NAME", product);
        request.setAttribute("PRODUCT_DESCRIPTION", descript);
        request.setAttribute("PRODUCT_PRICE", price_s);
        return jspurl;
    }

}
