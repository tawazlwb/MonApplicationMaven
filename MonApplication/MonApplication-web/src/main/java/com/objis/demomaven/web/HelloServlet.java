package com.objis.demomaven.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ikheiry
 *         helloServlet est la servlet principale.
 */
@SuppressWarnings("serial")
public class HelloServlet extends javax.servlet.http.HttpServlet
    implements javax.servlet.Servlet {
  /**
   *   cette méthode reçoit la requete du client et lui retourne la reponse.
   *   @param request : requete du client.
   *   @param response : reponse du serveur.
   *   @throws ServletException : exeption de servlet.
   *   @throws IOException : exception d'entrée sortie.
   */
  @Override
  protected final void doGet(final HttpServletRequest request,
      final HttpServletResponse response)
      throws ServletException, IOException {
    // nexus.exe /run demarrer nexus.
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("Projet Maven la centrale-web : Servlet Lancée");
    out.flush();
    out.close();
  }
}
