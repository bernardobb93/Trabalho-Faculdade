/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import control.TurmaFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Turma;

/**
 *
 * @author bernardo
 */
public class ServletTurma extends HttpServlet {

  @EJB

TurmaFacadeLocal facade;

protected void processRequest(HttpServletRequest request,

HttpServletResponse response)

throws ServletException, IOException {

String acao = request.getParameter("acao");

if(acao==null)acao="listar";

String pagDestino = (acao.equals("incluir"))?

"IncluirTurma.html":"ListaTurma.jsp";

if(acao.equals("incluirX")){

Turma t1 = new Turma(new Integer(

request.getParameter("numero")));

t1.setAluno(request.getParameter("aluno"));

t1.setProva1(new Integer(

request.getParameter("prova1")));

t1.setProva2(new Integer(

request.getParameter("prova2")));

t1.setProva3(new Integer(

request.getParameter("prova3")));

t1.setMedia(((t1.getProva1())+(t1.getProva2())+(t1.getProva3()))/3);

Integer x = t1.getMedia();
if (x>=6){
    t1.setStatus("aprovado");
    } 
else {
   t1.setStatus("reprovado");
    }
     
facade.create(t1);

}

if(acao.equals("excluirX")){

facade.remove(facade.find(new Integer(

request.getParameter("numero"))));

}

request.setAttribute("listagem", facade.findAll());

request.getRequestDispatcher(pagDestino).

forward(request,response);
} 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
