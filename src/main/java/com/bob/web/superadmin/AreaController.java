package com.bob.web.superadmin;

import com.bob.dto.AreaExecution;
import com.bob.entity.Area;
import com.bob.service.AreaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author bob
 * @date 2019/6/15 12:11
 */
@Controller
@RequestMapping("/superadmin")
public class AreaController {
    private AreaService areaService;
    Logger log = LoggerFactory.getLogger(AreaController.class);

    public AreaController(AreaService areaService) {
        this.areaService = areaService;
    }
    @GetMapping("/getarealist")
    @ResponseBody
    public Map<String, List<Area>> areaList() {
        Map<String, List<Area>> areaMap = new HashMap<>();
        AreaExecution execution = areaService.getAreaList();
        areaMap.put("arealist",execution.getAreaList());
        return areaMap;
    }
}
