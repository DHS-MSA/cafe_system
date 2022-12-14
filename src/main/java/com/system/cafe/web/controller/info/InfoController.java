package com.system.cafe.web.controller.info;

import com.system.cafe.service.info.InfoService;
import com.system.cafe.web.dto.info.InfoListResponseDto;
import com.system.cafe.web.dto.info.RecommendInfoListDTO;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/info")
public class InfoController {

    private final InfoService infoService;

    @GetMapping(value = "/recommendList", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RecommendInfoListDTO>> recommendList() {
        return new ResponseEntity<>(infoService.findRecommendList(), HttpStatus.OK);
    }

    @GetMapping(value = "/cafeList" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<InfoListResponseDto>> infoList(){
        return new ResponseEntity<>(infoService.findInfoList(), HttpStatus.OK);
    }
}
