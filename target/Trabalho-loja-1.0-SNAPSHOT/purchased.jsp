<%@taglib prefix="t" uri="/WEB-INF/tlds/tagDaLoja" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<t:mvcbody handler="MVC.pagehandlers.purchased_Handler" pageName="purchased">
    <div id='div-purchased'>
        <h1>Compra bem Sucedida !!</h1>
        <h1>Voce comprou ${PRODUCT_QUANTITY} ${PRODUCT_NAME} . Gastou no total R$${TOTAL_PRICE}0</h1>
        <button type="submit" name='voltar'  value="home" class="buttonHeader" >HOME</button>
    </div>
</t:mvcbody>
