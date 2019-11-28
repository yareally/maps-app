package com.tts.mapsapp.models;

import lombok.*;

/**
 * @author Wes Lanning
 * @version 2019-11-27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    @Getter @Setter
    private String city;
    @Getter @Setter
    private String state;
    @Getter @Setter
    private String lat;
    @Getter @Setter
    private String lng;
}
