<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="source/css/mystyle.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="container">
            <div id='divtitle'>
                <p id='title'>Descrição de ${PRODUCT_NAME}</p>
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
            <table id="product-table">
                <tr>
                    <td class="product-image"><img src="${PRODUCT_IMAGE}" alt="${PRODUCT_NAME}" style="width:200px;height:200px"></td>
                    <td class="product-description">
                        <p>Descrição do Produto</p>
                        <p>${PRODUCT_DESCRIPTION}</p>
                        <br><br><br>
                        <span class='price-span'>${PRODUCT_PRICE}</span> <button type="submit" name='comprar' value='${PRODUCT_NAME};${PRODUCT_QUANTIFY}'>Comprar</button>
                    </td>
                </tr>
            </table>
        </div>
    </body>
</html>
