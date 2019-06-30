
package com.example.yaml.yamldemo.entity;

import lombok.Data;

@Data
public class MciRemote {

    private String name;

    private String protocol;

    private String address;

    private int port;

    private String context;
}
