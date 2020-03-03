/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSPractica;

import Clases.NewHibernateUtil;
import Clases.User;
import EmailClass.SendEmail;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Emilio
 */
@WebService(serviceName = "WSPractica")
public class WSPractica {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "loginAcces")
    public Boolean loginAcces(@WebParam(name = "login") String login, @WebParam(name = "passwd") String passwd) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("FROM User").setReadOnly(true);
        List<User> listaUsuarios = (List<User>) q.list();
        
        Boolean encontrado = false;
        for(User aux : listaUsuarios){
            if(aux.getIdUser().equals(login) && aux.getPassword().equals(passwd)){
                encontrado = true; 
            }
        }
        return encontrado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calculadora")
    public String calculadora(@WebParam(name = "primerNumero") int primerNumero, @WebParam(name = "segundoNumero") int segundoNumero, @WebParam(name = "operacion") String operacion) {
        
        int resultado = 0;
        if(operacion.equals("+")){
            resultado = primerNumero + segundoNumero;
        } else if (operacion.equals("-")){
            resultado = primerNumero - segundoNumero;
        } else if (operacion.equals("*")){
            resultado = primerNumero * segundoNumero;
        } else {
            resultado = primerNumero / segundoNumero; 
        }
        
        
        return String.valueOf(resultado);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sendEmail")
    public String sendEmail(@WebParam(name = "from") String from, @WebParam(name = "to") String to, @WebParam(name = "asunto") String asunto, @WebParam(name = "texto") String texto) {
        SendEmail a = new SendEmail();
        a.sendEmail(from, to, asunto, texto);
        return "Message succesfully processed";
    }
}
