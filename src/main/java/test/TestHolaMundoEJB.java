package test;

import beans.HolaMundoEjbRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TestHolaMundoEJB {

    public static void main (String [] args){
        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        try{
            Context jndi = new InitialContext();
            HolaMundoEjbRemote holaMundoEjbRemote = (HolaMundoEjbRemote) jndi.lookup("java:global/RemoteEJBTest/HolaMundoEjbImpl!beans.HolaMundoEjbRemote");
            int resultado = holaMundoEjbRemote.sumar(5,3);
            System.out.println("Resultado EJB suma de 5+3=" + resultado);
        } catch (NamingException e){
            e.printStackTrace(System.out);
        }
    }
}
