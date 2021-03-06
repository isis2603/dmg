/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.rest.aplication.converters;

import co.edu.uniandes.csw.primid.logic.entities.ItinerarioEntity;
import co.edu.uniandes.rest.aplication.dtos.ItinerarioDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author la.mesa10
 */
public abstract class ItinerarioConverter {

    private ItinerarioConverter() {

    }

    public static ItinerarioEntity fullDTO2Entity(ItinerarioDTO dto) {
        if (dto != null) {
            ItinerarioEntity entity = basicDTO2Entity(dto);
            return entity;
        } else {
            return null;
        }
    }

    public static ItinerarioDTO fullEntity2DTO(ItinerarioEntity entity) {
        if (entity != null) {
            ItinerarioDTO dto = basicEntity2DTO(entity);
            return dto;
        } else {
            return null;
        }
    }

    public static ItinerarioDTO refEntity2DTO(ItinerarioEntity entity) {
        if (entity != null) {
            ItinerarioDTO dto = new ItinerarioDTO();
            dto.setId(entity.getId());
            dto.setFechaFin(entity.getFechaInicio());
            dto.setFechaFin(entity.getFechaFin());

            dto.setResumen(entity.getResumen());
            dto.setRutaImg(entity.getRutaImg());
            dto.setFechaInicio(entity.getFechaInicio());

            return dto;
        } else {
            return null;
        }
    }

    public static ItinerarioEntity refDTO2Entity(ItinerarioDTO dto) {
        if (dto != null) {
            ItinerarioEntity entity = new ItinerarioEntity();

            entity.setId(dto.getId());
            entity.setFechaFin(dto.getFechaFin());
            entity.setResumen(dto.getResumen());
            entity.setRutaImg(dto.getRutaImg());
            entity.setFechaInicio(dto.getFechaInicio());

            return entity;
        } else {
            return null;
        }

    }

    public static ItinerarioDTO basicEntity2DTO(ItinerarioEntity entity) {
        if (entity != null) {
            ItinerarioDTO dto = new ItinerarioDTO();
            dto.setId(entity.getId());
            dto.setFechaFin(entity.getFechaFin());
            dto.setFechaInicio(entity.getFechaInicio());
            dto.setResumen(entity.getResumen());
            dto.setRutaImg(entity.getRutaImg());
            return dto;
        } else {
            return null;
        }
    }

    private static ItinerarioEntity basicDTO2Entity(ItinerarioDTO dto) {
        if (dto != null) {

            ItinerarioEntity entity = new ItinerarioEntity();
            entity.setId(dto.getId());
            entity.setName(dto.getName());
            entity.setFechaFin(dto.getFechaFin());
            entity.setResumen(dto.getResumen());
            entity.setRutaImg(dto.getRutaImg());
            entity.setFechaInicio(dto.getFechaInicio());

            return entity;
        } else {
            return null;
        }
    }

    public static List<ItinerarioDTO> listEntity2DTO(List<ItinerarioEntity> entities) {
        List<ItinerarioDTO> dtos = new ArrayList<ItinerarioDTO>();
        if (entities != null) {
            for (ItinerarioEntity entity : entities) {
                dtos.add(basicEntity2DTO(entity));
            }
        }
        return dtos;
    }

    public static List<ItinerarioEntity> listDTO2Entity(List<ItinerarioDTO> dtos) {
        List<ItinerarioEntity> entities = new ArrayList<ItinerarioEntity>();
        if (dtos != null) {
            for (ItinerarioDTO dto : dtos) {
                entities.add(basicDTO2Entity(dto));
            }
        }
        return entities;
    }

}
