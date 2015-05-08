
package MVC.pagehandlers;

import MVC.TratadorDePaginas;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class about_Handler implements TratadorDePaginas{
    public String processar(HttpServletRequest request, HttpServletResponse response) {
       String jspurl = null;
       String value = (String) request.getParameter("button");
       System.out.println("value="+value);
       if ("home".equals(value)){
           System.out.println("value="+value);
           jspurl = "index1.jsp";
       }
       else if("produtos".equals(value)){
           jspurl = "products.jsp";
       }
       System.out.println(jspurl);
       return jspurl;
    }
    
    
}
