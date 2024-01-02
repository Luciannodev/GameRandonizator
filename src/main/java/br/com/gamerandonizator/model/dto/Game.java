package br.com.gamerandonizator.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Game implements Serializable {
    @JsonProperty("appid")
    private String appID;
    @JsonProperty("name")
    private String name;
}
