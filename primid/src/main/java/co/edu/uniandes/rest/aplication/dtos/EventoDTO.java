/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.rest.aplication.dtos;
import java.util.Date;

/**
 *
 * @author karenlorenaosoriohenao
 */
public class EventoDTO {

    private Long id;
    private String name;
    private String image;
    private String place;
    private String category;
    private double score;
    private String description;
    private Date startDate;
    private Date endDate;


    private CiudadDTO ciudad;
    /**
     * Constructor por defecto
     */
    public EventoDTO() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param id identificador del evento
     * @param name nombre del evento
     * @param image imagen del evento
     * @param description decripción del evento
     * @param startDate Fecha en la que inicia el evento
     * @param endDate Fecha en la que termina el evento
     * @param category La categoria del evento
     * @param score La calificacion que ha recibido el evento
     * @param place El lugar donde ocurre el evento
     */
    public EventoDTO(Long id, String name, String image, String description, Date dateStarts, Date endDate, String place, double score, String category) {
        super();
        this.id = id;
        this.name = name;
        this.image = image;
        this.description = description;
        this.startDate = dateStarts;
        this.endDate = startDate;
        this.category = category;
        this.score = score;
        this.place = place;
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
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the dateStarts
     */
    public Date getDateStarts() {
        return startDate;
    }

    /**
     * @param startDate the dateStarts to set
     */
    public void setDateStarts(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the dateEnds
     */
    public Date getDateEnds() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setDateEnds(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the place
     */
    public String getPlace() {
        return place;
    }

    /**
     * @param place the place to set
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * @return the image
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the image to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the score
     */
    public double getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(double score) {
        this.score = score;
    }

    public CiudadDTO getCiudad() {
    return ciudad;
    }

    public void setCiudad(CiudadDTO ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Convierte el objeto a una cadena
     */
    @Override
    public String toString() {
        return "{ id : " + getId() + ", name : \"" + getName() + "\" }";
    }
}
