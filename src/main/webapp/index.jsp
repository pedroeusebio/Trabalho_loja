
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="source/css/mystyle.css">
        <title>Predo Zébio</title>
    </head>
    <body>
        <div id='container'>
            <form id='myForm' method="GET" action="controlador">
                <input id='inputid' type="hidden" name="Controlador" value="MVC.pagehandlers.index_Handler" />
                <div id='divtitle'>
                    <p id='title'>LOJA CANETAS BIC</p>
                </div>
                <div id='container-sidebar'>
                    <ul>
                        <li class='li1'><a href='index.jsp'><span>Products</span></a>
                            <ul>
                                <li id='p_link'><a href='controlador?Controlador=MVC.pagehandlers.index_Handler&PRODUTO=red'><span>Caneta Vermelha</span></a></li>
                                <li id='p_link'><a href='controlador?Controlador=MVC.pagehandlers.index_Handler&PRODUTO=blue'><span>Caneta Azul</span></a></li>
                                <li id='p_link'><a href='controlador?Controlador=MVC.pagehandlers.index_Handler&PRODUTO=black'><span>Caneta Preta</span></a></li>
                            </ul>
                        </li>
                        <li class='li1'><a href='#'><span>About</span></a></li>
                        <li class='li1'><a href='#'><span>Contact</span></a></li>
                    </ul>
                </div>
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
            </form>
        </div>
    </body>
</html>
