/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Professor extends Pessoa_Cadastro{
    String departamento;
    int registro;

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getRegistro() {
        return registro;
    }

    public String getDepartamento() {
        return departamento;
    }
    
}
