
package taller5;

import java.util.ArrayList;

public class Medicamentos {
private int codigo;        
private String nombre;
private String tipo_medicamento;
private int unidades_s;
private int unidades_v;
private double precio;
private String tipoVenta;

    public void Medicamentos(){
    }
    
    public void Medicamentos(int codigo,String nombre,String tipo_medu,int unidades_s,int unidades_v, double precio,String tipoVenta){
    this.codigo=codigo;
    this.nombre=nombre;
    this.tipo_medicamento=tipo_medu;
    this.unidades_s=unidades_s;
    this.unidades_v=unidades_v;
    this.precio=precio;
    this.tipoVenta=tipoVenta;
    }
    
    public int getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    
    public String getTipoMedica(){
            return tipo_medicamento;
    }
    public int getUnidades_s(){
        return unidades_s;
    }
    
    public int getUnidades_v(){
        return unidades_v;
    }
    public double getPrecio(){
        return precio;
    }
    public String getTipoVenta(){
        return tipoVenta;
    }
    
}
