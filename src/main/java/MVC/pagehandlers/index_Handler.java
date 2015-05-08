/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.pagehandlers;

import MVC.Produto;
import MVC.TratadorDePaginas;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pedroeusebio
 */
public class index_Handler implements TratadorDePaginas {

    @Override
    public String processar(HttpServletRequest request, HttpServletResponse response) {
        String jspurl = "description.jsp";
        Produto product = new Produto();
        String name = (String) request.getParameter("PRODUTO");
        System.out.println(name);
        if ("N-750".equals(name)) {
            product.setName("TP-Link N-750");
            product.setDescription("TL-WDR4300 da TP-LINK é um roteador wireless com um desempenho"
                    + " otimizado de banda dupla simultânea combinando as altíssimas velocidades de "
                    + "450Mbps usando a banda cristalina de 5GHz e 300Mbps usando a tradicional banda de"
                    + " 2.4GHz. Com banda dupla simultânea, os usuários têm 750Mbps de largura de banda total"
                    + " para numerosas aplicações de uso intensivo da banda, ao mesmo tempo ao redor de um ambiente"
                    + " doméstico ou de um escritório de grande porte, onde as tarefas simples, como e-mail ou navegação"
                    + " da web podem ser processadas pela banda de 2,4 GHz a 300Mbps e as tarefas mais sensíveis à latência,"
                    + " como jogos on-line ou streaming de vídeo HD, podem ser processadas pela banda de 5GHz a 450Mbps, ao mesmo tempo");
            product.setPrice("299.00");
            product.setImage("source/images/N-750.jpg");
        }
        if ("DNS-320l".equals(name)) {
            product.setName("D-Link DNS-320l");
            product.setDescription("Este servidor de armazenamento ShareCenter™ Cloud da D-Link,"
                    + " modelo DNS-320L, permite que você armazene, carregue, salve e acesse seus arquivos,"
                    + " visualize suas fotos, assista seus vídeos e ouça suas músicas em sua própria rede de computadores,"
                    + " disponibilizando todos estes conteúdos para qualquer computador conectado em sua rede, como seu Tablet,"
                    + " Smartphone, Notebook, Videogame ou Smart TV. ");
            product.setPrice("424.06");
            product.setImage("source/images/DNS-320l.jpg");
        }
        if ("WRT54G".equals(name)) {
            product.setName("LynkSys WRT54G");
            product.setDescription(" é um dos mais famosos roteadores sem fio da Linksys. Ao seu redor,"
                    + " desenvolveu-se toda uma comunidade de desenvolvedores de firmwares alternativos,"
                    + " agregando funções adicionais ao equipamento. O equipamento WRT54GL é da família que possui o"
                    + " código aberto para implementação e variações de firmware, mas também pode ser usado para Windows.");
            product.setPrice("90.00");
            product.setImage("source/images/wrt54g.jpg");
        } else {

        }
        request.setAttribute("PRODUCT_NAME", product.getName());
        request.setAttribute("PRODUCT_DESCRIPTION", product.getDescription());
        request.setAttribute("PRODUCT_IMAGE", product.getImage());
        request.setAttribute("PRODUCT_PRICE", product.getPrice());
        //request.setAttribute("PRODUTO_NOME",product.getClass());//

        return jspurl;
    }
}
