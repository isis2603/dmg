package co.edu.uniandes.csw.primid.logic.entities;

import co.edu.uniandes.csw.crud.spi.entity.BaseEntity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MultimediaEntity extends BaseEntity implements Serializable {

    private String tipo;
    private String ruta;
//    Relaciones con planEvento, planCiudad e itinerario
//    @ManyToOne
    private PlanEventoEntity planEvento;

//    @ManyToOne
    private PlanCiudadEntity planCiudad;

//    @ManyToOne
    private ItinerarioEntity itinerario;

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the ruta
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * @param ruta the ruta to set
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    /**
     *
     */
    public PlanEventoEntity getPlanEvento()
    {
        return planEvento;
    }
    /**
     *
     */
    public void setPlanEvento(PlanEventoEntity planEvento)
    {
        this.planEvento=planEvento;
    }

    /**
     *
     */
    public PlanCiudadEntity getPlanCiudad()
    {
        return planCiudad;
    }
    /**
     *
     */
    public void setPlanCiudad(PlanCiudadEntity planCiudad)
    {
        this.planCiudad=planCiudad;
    }
    /**
     *
     */
    public ItinerarioEntity getItinerario()
    {
        return itinerario;
    }
    /**
     *
     */
    public void setItinerario(ItinerarioEntity itinerario)
    {
        this.itinerario=itinerario;
    }

}