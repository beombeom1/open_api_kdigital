package org.example.open_api_kdigital.controller;

import jakarta.annotation.Resource;
import org.example.open_api_kdigital.model.WeatherInfoVO;
import org.example.open_api_kdigital.service.WeatherSearchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class WeatherSearchController {
    @Resource(name = "weatherSearchService")
    private WeatherSearchService weatherSearchService;

    @RequestMapping(value = "/book")
    public String weatherPage() throws Exception{
        return "weather";
    }

    @RequestMapping(value = "/weathersearch")
    public String weatherSearchList(String keyword, Model model)  throws Exception {

        // 네이버 검색 API Client ID, Secret
        String clientId = "DZ6wo_KzTwQLCP8TLVUu";
        String clientSecret = "gduCC0fzxI";

        //검색어 Encoding
        try {
            keyword = URLEncoder.encode(keyword, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("검색어 인코딩 실패",e);
        }

        //URI 및 WEB에서 입력된 검색어 설정
        StringBuilder urlBuilder = new StringBuilder("public static double sin(double a) {\n" +
                "        return StrictMath.sin(a); // default impl. delegates to StrictMath\n" +
                "    }"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=yuuAIagVrMk4nnZy2%2Fy47WSlSR6qihjxhcjfgbeNq5%2BeNCpfO%2FvoIwRuplGaBHclEUKpYaAmKL6aoxBKPfZqSw%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("1000", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode("JSON", "UTF-8")); /*요청자료형식(XML/JSON) Default: XML*/
        urlBuilder.append("&" + URLEncoder.encode("base_date","UTF-8") + "=" + URLEncoder.encode("20240511", "UTF-8")); /*‘21년 6월 28일 발표*/
        urlBuilder.append("&" + URLEncoder.encode("base_time","UTF-8") + "=" + URLEncoder.encode("0600", "UTF-8")); /*06시 발표(정시단위) */
        urlBuilder.append("&" + URLEncoder.encode("nx","UTF-8") + "=" + URLEncoder.encode("55", "UTF-8")); /*예보지점의 X 좌표값*/
        urlBuilder.append("&" + URLEncoder.encode("ny","UTF-8") + "=" + URLEncoder.encode("127", "UTF-8")); /*예보지점의 Y 좌표값*/

        // Header 설정


        return "weatherSearchResult";
    }



}
