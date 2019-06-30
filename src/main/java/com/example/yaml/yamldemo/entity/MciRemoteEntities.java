package com.example.yaml.yamldemo.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "mci")
public class MciRemoteEntities {

    private List<MciRemote> list;
}
