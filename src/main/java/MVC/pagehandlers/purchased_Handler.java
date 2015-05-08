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
public class purchased_Handler implements TratadorDePaginas{
    public String processar(HttpServletRequest request, HttpServletResponse response) {
        String jspurl = "index1.jsp";
        return jspurl; 
    }
}
