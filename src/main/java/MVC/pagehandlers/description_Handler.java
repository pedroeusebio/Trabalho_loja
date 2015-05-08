package MVC.pagehandlers;

import MVC.TratadorDePaginas;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class description_Handler implements TratadorDePaginas {
    public String processar(HttpServletRequest request, HttpServletResponse response) {
        String jspurl = "purchased.jsp";
        String price_s = (String) request.getParameter("price");
        //System.out.println(price_s);
        String product = (String) request.getParameter("comprar");
        //System.out.println(product);
        String quantity_s = (String) request.getParameter("quantity");
        //System.out.println(quantity_s);
        double price = Double.parseDouble(price_s);
        double quantity = Double.parseDouble(quantity_s);
        if (quantity <= 0 ) {
            String error = "Coloque um numero maior que zero.";
            jspurl = "error.jsp";
            String source = (String) request.getParameter("source");
            String descript = (String) request.getParameter("descript");
            request.setAttribute("ERROR_VALUE", error);
            request.setAttribute("PRODUCT_IMAGE",source);
            request.setAttribute("PRODUCT_NAME",product);
            request.setAttribute("PRODUCT_DESCRIPTION",descript);
            request.setAttribute("PRODUCT_PRICE",price_s);
        }
        else{
            price = quantity * price;
            request.setAttribute("PRODUCT_NAME",product);
            request.setAttribute("TOTAL_PRICE",price);
            request.setAttribute("PRODUCT_QUANTITY",quantity_s);
        }
        return jspurl ;
        
    }
}
