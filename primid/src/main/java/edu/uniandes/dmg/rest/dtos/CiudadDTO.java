/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.dmg.rest.dtos;

/** 
 *
 * @author jd.torres11
 */
public class CiudadDTO {

    private Long id;
    private String name;
    private Double coordenadas;
    private Boolean visible;
    private String ruta;

    /**
     * Constructor por defecto
     */
    public CiudadDTO(long id, String name, Double coordenadas, String ruta) {

        super();
        this.id = id;
        this.name = name;
        this.coordenadas = coordenadas;
        this.visible = true;
        this.ruta = ruta;

	}

    /**
     * Constructor con parámetros.
     * @param id identificador de la ciudad
     * @param name nombre de la ciudad
     */
    public CiudadDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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

    /**
     * Convierte el objeto a una cadena
     */
    @Override
    public String toString() {
    	return "{ id : " + getId() + ", name : \"" + getName() + "\" }" ;
    }

}