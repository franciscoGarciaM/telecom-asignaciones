package com.telecom.asignaciones.service;

import com.telecom.asignaciones.model.EntidadFederativa;
import com.telecom.asignaciones.repository.AsignacionRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AsignacionService {

    public List<ListasGen> findAll() {
        List<EntidadFederativa> listUsuarios = AsignacionRepository.findAll();
        List<ListasGen> listaEntidadFederativa = new ArrayList<>();
        for (EntidadFederativa entidadFederativa : ListasGen) {
            ListasGen ListasGen = mappingEntityToResponse(listaEntidadFederativa);
            listaEntidadFederativa.add(ListasGen);
        }
        return listaEntidadFederativa;
    }

    private ListasGen mappingEntityToResponse(List<ListasGen> listaEntidadFederativa) {
        ListasGen ListasGen = new ListasGen();
    }
}
