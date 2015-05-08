<%@taglib prefix="t" uri="/WEB-INF/tlds/tagDaLoja" %>
<%@taglib prefix="b" uri="/WEB-INF/tlds/tagDaLoja" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<t:mvcbody handler="MVC.pagehandlers.index_Handler"  pageName="oi">
    <div>

        <div class="clearfloat"></div>
        <div class="clearfloat"></div>
        <div class="headerPic" style="background-image:url(source/images/headerBackground2.jpg)" >
            <div class="headerText1">Promoção</div>
            <div class="headerText2" ><br>TP-link N-750</div>
            <div><button type="submit" name="PRODUTO" value="N-750"class="buttonHeader">Compre agora !</button></div>
        </div>
    </div>
    <div>
        <b:boxTag image="source/images/N-750.jpg" name="TP-Link N-750" value="N-750" describe="É um roteador wireless com um desempenho otimizado de banda dupla simultânea combinando as altíssimas velocidades de 450Mbps usando a banda cristalina de 5GHz e 300Mbps usando a tradicional banda de 2.4GHz."></b:boxTag>
        <b:boxTag image="source/images/DNS-320l.jpg" name="D-Link DNS-320l" value="DNS-320l" describe="Este servidor de armazenamento ShareCenter™ Cloud da D-Link  permite que você armazene, carregue, salve e acesse seus arquivos."></b:boxTag>
        <b:boxTag image="source/images/wrt54g.jpg" name="Linsys WRT54G" value="WRT54G" describe="É um dos mais famosos roteadores sem fio da Linksys. Ao seu redor, desenvolveu-se toda uma comunidade de desenvolvedores de firmwares alternativos."></b:boxTag>
    </div>

            
</t:mvcbody>
    
