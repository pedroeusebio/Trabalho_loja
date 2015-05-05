package MVC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public interface TratadorDePaginas {
    public String processar (HttpServletRequest request, HttpServletResponse response);
}
