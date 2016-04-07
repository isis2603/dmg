/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.primid.logic.api;

import co.edu.uniandes.csw.primid.logic.exceptions.BusinessLogicException;
import co.edu.uniandes.csw.primid.logic.entities.EventoEntity;
import java.util.List;
/**
 *
 * @author kl.osorio10
 */
public interface IEventoLogic {

    public List<EventoEntity> getEventos();

    public EventoEntity getEvento(Long id) throws BusinessLogicException;

    public EventoEntity createEvento(EventoEntity entity) throws BusinessLogicException;

    public EventoEntity updateEvento(EventoEntity entity) throws BusinessLogicException;

    public void deleteEvento(Long id);

}
