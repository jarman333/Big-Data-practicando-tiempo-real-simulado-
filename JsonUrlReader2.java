/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.beam.examples;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.beam.examples.Aire;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author leo
 */
public class JsonUrlReader2 {

    public JsonUrlReader2()
    {
        
    }
      
    public ArrayList<Aire> cargarURL() throws StreamReadException, DatabindException, MalformedURLException, IOException {
        String url = "https://sinca.mma.gob.cl/index.php/json/listadomapa2k19/";
        
        ArrayList<Aire> aAire = new ArrayList();

        //JsonNode node = new JsonUrlReader().get(url);
        //System.out.println(node.toPrettyString());
        
        
        ObjectMapper mapper = new ObjectMapper();

	System.out.println("Inicando mapper en JsonUrlReader");
        JsonNode node = mapper.readTree(new URL(url));

        System.out.println("Finalizando mapper en JsonUrlReader");
        
        
        Iterator<JsonNode> it = node.iterator();
        
        Aire a = null;
        a = new Aire();
        a.setId("ID");
        a.setNombre("NOMBRE");
        a.setKey("KEY");
        a.setLatitud("LATITUD");
        a.setLongitud("LONGITUD");
        a.setComuna("COMUNA");
        a.setRed("RED");
        a.setRegion("REGION");
        a.setRegionIndex("REGIONINDEX");
        a.setCalificacion("CALIFICACOIN");
        a.setEmpresa("EMPRESA");

        a.setRealtimeCode("CODE");
        a.setRealtimeName("NAME");
        a.setRealtimeDateTime("REALTIMEDATETIME");

        a.setColor("COLOR");
        a.setStatus("STATUS");
        a.setStatuscode("STATUSCODE");
        a.setDatetime("DATETIME");
        a.setParameter("PARAMETER");
        a.setMovil("MOVIL");
        a.setValue("VALUE");
        a.setUnit("UNIT");
        a.setIcap("ICAP");
        a.setIcapText("ICAPTEXT");
	    
	aAire.add(a);    

        int i = 1;
        while (it.hasNext())
        {    
            JsonNode n = it.next();
            
            //System.out.println(n);
            //System.out.println(n.toPrettyString());
            JsonNode r = n.get("realtime");
            
           
            Iterator<JsonNode> itRealTime = r.iterator();
            while (itRealTime.hasNext())
            {
                a = new Aire();
            
                a.setId(String.valueOf(i));
                a.setNombre(n.get("nombre").asText());
                a.setKey(n.get("key").asText());
                a.setLatitud(n.get("latitud").asText());
                a.setLongitud(n.get("longitud").asText());
                a.setComuna(n.get("comuna").asText());
                a.setRed(n.get("red").asText());
                a.setRegion(n.get("region").asText());
                a.setRegionIndex(n.get("regionindex").asText());
                a.setCalificacion(n.get("calificacion").asText());
                a.setEmpresa(n.get("empresa").asText());
                
                JsonNode nRealTime = itRealTime.next();
        
                //System.out.println(nRealTime);
                //System.out.println(nRealTime.toPrettyString());
            
                a.setRealtimeCode(nRealTime.get("code").asText());
                a.setRealtimeName(nRealTime.get("name").asText());
                a.setRealtimeDateTime(nRealTime.get("datetime").asText());
                
                //System.out.println("\t"+nRealTime.get("code"));
                //System.out.println("\t"+nRealTime.get("name"));
                //System.out.println("\t"+nRealTime.get("datetime"));
                
                JsonNode nTableRow = nRealTime.get("tableRow");
                
                boolean flagError = false;
                try
                {
                
                    a.setColor(nTableRow.get("color").asText());
                    a.setStatus(nTableRow.get("status").asText());
                    a.setStatuscode(nTableRow.get("statuscode").asText());
                    a.setDatetime(nTableRow.get("datetime").asText());
                    a.setParameter(nTableRow.get("parameter").asText());
                    a.setMovil(nTableRow.get("movil").asText());
                    a.setValue(nTableRow.get("value").asText());
                    a.setUnit(nTableRow.get("unit").asText());
                    a.setIcap(nTableRow.get("icap").asText());
                    a.setIcapText(nTableRow.get("icapText").asText());
                }
                catch (Exception ex)
                {
                    flagError = true;
                }

                if (flagError==false)
                {
                    aAire.add(a);
                    System.out.println(a);
                    i++;
                }
                else
                {
                    System.out.println("Error de tupla");
                }

            }//while itRealTime   

        }   
        return aAire;
    }
}//JsonUrlReader
