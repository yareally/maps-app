package com.tts.mapsapp.models;

import lombok.*;

import java.util.List;


/**
 * @author Wes Lanning
 * @version 2019-11-27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeocodingResponse {
    @Getter @Setter
    private List<Geocoding> results;
}
