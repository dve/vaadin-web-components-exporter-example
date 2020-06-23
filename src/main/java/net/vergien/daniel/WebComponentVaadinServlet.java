package net.vergien.daniel;

import javax.servlet.annotation.WebServlet;

import com.vaadin.flow.server.VaadinServlet;

@WebServlet(urlPatterns = { "/vaadin/*" })
public class WebComponentVaadinServlet extends VaadinServlet
{

}
