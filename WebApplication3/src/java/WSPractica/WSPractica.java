package WSPractica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Clases.NewHibernateUtil;
import Clases.User;
import EmailClass.SendEmail;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        String output = a.sendEmail(from, to, asunto, texto);
        return output;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ordenarNumeros")
    public String ordenarNumeros(@WebParam(name = "numero1") int numero1, @WebParam(name = "numero2") int numero2, @WebParam(name = "numero3") int numero3, @WebParam(name = "numero4") int numero4, @WebParam(name = "numero5") int numero5) {
        
        ProcessBuilder run = new ProcessBuilder("C:\\Users\\Emilio\\Documents\\NetBeansProjects\\WebApplication3\\programaWS.exe" , String.valueOf(numero1), String.valueOf(numero2), String.valueOf(numero3), String.valueOf(numero4), String.valueOf(numero5));

        Process runProcess = null;
        try {
            runProcess = run.start();
        } catch (IOException ex) {
            Logger.getLogger(WSPractica.class.getName()).log(Level.SEVERE, null, ex);
        }

        String outputLine = "";
        try {
            InputStreamReader isr = new InputStreamReader(runProcess.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            while ((line = br.readLine()) != null)
                outputLine += line + "\n";
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
        return outputLine;
    }
}
