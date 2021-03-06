/*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates
	 * and open the template in the editor.
 */
package co.edu.uniandes.rest.aplication.dtos;

public class CiudadDTO {

    private long id;
    private String name;
    private Integer coordenadas;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public Integer getCoordenadas() {
        return coordenadas;
    }

    /**
     * @param name the name to set
     */
    public void setCoordenadas(Integer coordenadas) {
        this.coordenadas = coordenadas;
    }

    /**
     * Convierte el objeto a una cadena
     */
    @Override
    public String toString() {
        return "{ id : " + getId() + ", name : \"" + getName() + "\"" + getCoordenadas() + ",coordenadas: \" }";
    }

}