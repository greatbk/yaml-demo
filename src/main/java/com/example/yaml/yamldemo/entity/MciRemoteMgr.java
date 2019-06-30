package com.example.yaml.yamldemo.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Data
@Component
public class MciRemoteMgr {

    @Autowired
    MciRemoteEntities mciRemoteEntities;

    private Map<String, MciRemote> repository;

    @PostConstruct
    public void setRepository() {
        repository = new HashMap<>();

        for(MciRemote mciRemote : mciRemoteEntities.getList()) {
            repository.put(mciRemote.getName(), mciRemote);
        }
    }

    public MciRemote getRemote(String name) {
        return repository.get(name);
    }

}
