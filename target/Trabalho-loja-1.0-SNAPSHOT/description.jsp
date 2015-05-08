<%@taglib prefix="t" uri="/WEB-INF/tlds/tagDaLoja" %>
<%@taglib prefix="b" uri="/WEB-INF/tlds/tagDaLoja" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<t:mvcbody handler="MVC.pagehandlers.description_Handler">
    <div class="descript-box">
        <table id="product-table">
            <tr>
                <td ><img src="${PRODUCT_IMAGE}" name="${PRODUCT_NAME}"  style="width:200px;height:200px"></td>
                <td class="td-discript">
                    <p><b>Descrição do Produto</b></p>
                    <br>
                    <p>${PRODUCT_NAME}</p>
                    <br>
                    <p>${PRODUCT_DESCRIPTION}</p>
                    <br><br><br>
                    <span>R$ ${PRODUCT_PRICE}</span>
                    <input type="hidden" name="price" value="${PRODUCT_PRICE}">
                    <br>
                    <br>
                    <input type ="hidden" name="source" value="${PRODUCT_IMAGE}">
                    <input type ="hidden" name="descript" value="${PRODUCT_DESCRIPTION}">
                    <span></span><input id="input-quantity" type="number" name="quantity" required>
                    <button type="submit" name='comprar' value='${PRODUCT_NAME}' class="buttonHeader" >Comprar</button>
                </td>
            </tr>
        </table>
    </div>

</t:mvcbody>
