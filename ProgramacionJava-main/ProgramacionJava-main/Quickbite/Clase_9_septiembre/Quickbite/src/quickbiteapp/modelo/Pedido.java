/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickbiteapp.modelo;

/**
 *
 * @author CSU22
 */
public class Pedido {

    //Atributos
    private Cliente cliente;
    private Plato plato;
    private int cantidad;

    //Constructor
    public Pedido(Cliente cliente, Plato plato, int cantidad) {
        this.cliente = cliente;
        this.plato = plato;
        this.cantidad = cantidad;
    }

    //Metodos
    public double CalcularTotal(int cantidad){
        
        double ValorTotal = this.plato.CalcularSubtotal(this.cantidad);
        return ValorTotal;
    }
    
    public void Confirmar(){
        
        boolean HayDisponibilidad = this.plato.Haydisponibilidad(this.cantidad);
        double ValorPagar = CalcularTotal();
        boolean PuedePagar = this.cliente.PuedePagar(ValorPagar);
        
        if (HayDisponibilidad == true && PuedePagar == true){
            
            this.cliente.Pagar(ValorPagar);
            this.plato.Despachar(cantidad);
            
            System.out.println("Pedido confirmado");
        }else {
            
            System.out.println("Pedido no confirmado");
            System.out.println("Motivo: " +((HayDisponibilidad == true)? "No podia pagar": "No habia disponibilidad:"));
            
        }
    }
    
    public void MostrarResumen(){
        cliente.MostrarInformacion();
        plato.MostrarInformacion();
        System.out.println("El valor a pagar es: " + CalcularTotal());
    }
}

