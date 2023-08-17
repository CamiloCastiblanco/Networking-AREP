package edu.escuelaing.co.arep.PrimerEjercicio;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Brayan Camilo Castiblanco
 *
 * Primer Ejercicio Taller
 *
 */
public class URLReader
{
    public static void main( String[] args ) throws MalformedURLException {
        URL myurl = new URL("https://campusvirtual.escuelaing.edu.co:8080/moodle/pluginfile.php?222974/mod_resource/content/0/NamesNetworkClientService.pdf#PDF");
        System.out.println("Protocol: "+ myurl.getProtocol());
        System.out.println("Host: " + myurl.getHost());
        System.out.println("Authority: "+ myurl.getAuthority());
        System.out.println("Port: "+ myurl.getPort());
        System.out.println("Path: "+ myurl.getPath());
        System.out.println("Query: "+ myurl.getQuery());
        System.out.println("Ref: "+ myurl.getRef());
    }
}
