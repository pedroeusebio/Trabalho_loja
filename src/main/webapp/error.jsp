<%@taglib prefix="t" uri="/WEB-INF/tlds/tagDaLoja" %>
<%@taglib prefix="b" uri="/WEB-INF/tlds/tagDaLoja" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<t:mvcbody handler="MVC.pagehandlers.error_Handler" pageName="error">
    <br>
    <br>
    <input type="hidden" name="price" value="${PRODUCT_PRICE}">
    <input type="hidden" name="name" value="${PRODUCT_NAME}">
    <input type ="hidden" name="source" value="${PRODUCT_IMAGE}">
    <input type ="hidden" name="descript" value="${PRODUCT_DESCRIPTION}">

    <div class="alert alert-danger" role="alert">
        <P> ${ERROR_VALUE} </p>
    </div>
    <button type="submit" name='comprar' value='VOLTAR' class="buttonHeader" >VOLTAR</button>
</t:mvcbody>