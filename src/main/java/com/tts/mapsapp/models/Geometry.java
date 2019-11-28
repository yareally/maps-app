package com.tts.mapsapp.models;

import lombok.*;


/**
 * @author Wes Lanning
 * @version 2019-11-27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Geometry {
    @Getter
    @Setter
    private Location location;
}
