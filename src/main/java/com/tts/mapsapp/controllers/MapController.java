package com.tts.mapsapp.controllers;

import com.tts.mapsapp.models.Location;
import com.tts.mapsapp.services.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Wes Lanning
 * @version 2019-11-27
 */
@Controller
public class MapController {

    private MapService mapService;

    @Autowired
    public MapController(MapService mapService) {
        this.mapService = mapService;
    }

    @GetMapping({"/", "/home"})
    public String getDefaultMap(Model model) {
        model.addAttribute(new Location());
        return "index";
    }

    @PostMapping({"/", "/home"})
    public String getMapForLocation(Location location, Model model) {
        mapService.addCoordinates(location);
        model.addAttribute(location);
        return "index";
    }
}
