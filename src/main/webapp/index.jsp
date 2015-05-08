<%@taglib prefix="t" uri="/WEB-INF/tlds/tagDaLoja" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<t:mvcbody handler="MVC.pagehandlers.index_Handler"  pageName="oi">
                <div id='container-product'>
                    <table class='t_product'>
                        <tr>
                            <td>
                                <button id='but-img' type="submit" name="PRODUTO" value="red"><img src="source/caneta_vermelha.jpg" width="200" height="200"></button>
                               <!--<input id='red' type="image"  src="source/caneta_vermelha.jpg" height="200" width="200"  name="PRODUTO" value="red" onclick="document.getElementByid('myForm').submit();">
                               <button type='submit' name='PRODUTO' value='red' >ver produto</button> -->
                            </td>
                            <td>
                                <input type="image" height="200" width="200" src="source/caneta_preta.jpg" name="PRODUTO"  value="black" onclick="document.getElementById('formID').submit();" />
                            </td>
                            <td>
                                <input type="image" height="200" width="200" src="source/caneta_azul.jpg" name="PRODUTO" value="blue"/>
                            </td>
                        </tr>
                    </table>
                </div>
</t:mvcbody>