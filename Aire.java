/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.beam.examples;

/**
 *
 * @author leo
 */
public class Aire {
    
    private String id;
    private String nombre;
    private String key;
    private String latitud;
    private String longitud;
    private String comuna;
    private String red;
    private String region;
    private String regionIndex;
    private String calificacion;
    private String empresa;
    
    
    //realtime
    private String realtimeCode;
    private String realtimeName;
    private String realtimeDateTime;
    
    //tableRow
    private String color;
    private String status;
    private String statuscode;
    private String datetime;
    private String parameter;
    private String movil;
    private String value;
    private String unit;
    private String icap;
    private String icapText;

    public Aire() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegionIndex() {
        return regionIndex;
    }

    public void setRegionIndex(String regionIndex) {
        this.regionIndex = regionIndex;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRealtimeCode() {
        return realtimeCode;
    }

    public void setRealtimeCode(String realtimeCode) {
        this.realtimeCode = realtimeCode;
    }

    public String getRealtimeName() {
        return realtimeName;
    }

    public void setRealtimeName(String realtimeName) {
        this.realtimeName = realtimeName;
    }

    public String getRealtimeDateTime() {
        return realtimeDateTime;
    }

    public void setRealtimeDateTime(String realtimeDateTime) {
        this.realtimeDateTime = realtimeDateTime;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getIcap() {
        return icap;
    }

    public void setIcap(String icap) {
        this.icap = icap;
    }

    public String getIcapText() {
        return icapText;
    }

    public void setIcapText(String icapText) {
        this.icapText = icapText;
    }

    @Override
    public String toString() {
        return "Aire{" + "id=" + id + ", nombre=" + nombre + ", key=" + key + ", latitud=" + latitud + ", longitud=" + longitud + ", comuna=" + comuna + ", red=" + red + ", region=" + region + ", regionIndex=" + regionIndex + ", calificacion=" + calificacion + ", empresa=" + empresa + ", realtimeCode=" + realtimeCode + ", realtimeName=" + realtimeName + ", realtimeDateTime=" + realtimeDateTime + ", color=" + color + ", status=" + status + ", statuscode=" + statuscode + ", datetime=" + datetime + ", parameter=" + parameter + ", movil=" + movil + ", value=" + value + ", unit=" + unit + ", icap=" + icap + ", icapText=" + icapText + '}';
    }
    
    public String toCSV()
    {
        return "" + id + "," + nombre + "," + key + "," + latitud + "," + longitud + "," + comuna + "," + red + "," + region + "," +
                regionIndex + "," + calificacion + "," + empresa + "," + realtimeCode + "," + realtimeName + "," + realtimeDateTime + "," + color + "," +
                status + "," + statuscode + "," + datetime + "," + parameter + "," + movil + "," + value + "," + unit + "," + icap + "," + icapText + "";
    }

}//Aire
