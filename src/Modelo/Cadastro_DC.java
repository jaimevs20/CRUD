/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

abstract class Cadastro_DC {
   String nome,departamento,natureza;
   int duração;
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getDuração() {
        return duração;
    }
    public void setDuração(int duração) {
        this.duração = duração;
    }
    
    public String getNatureza() {
        return natureza;
    }
    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }  
}
