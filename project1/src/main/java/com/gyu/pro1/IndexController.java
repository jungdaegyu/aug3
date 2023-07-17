package com.gyu.pro1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping(value = {"/", "/index"}) //처음 로딩했을때 : index.jsp 호출,,, index 화면도 출력 가능하게
	
	public String index() {
		return "index"; //데이터 붙임 없이 index.jsp 페이지만 보여줍니다. //mapping 작업은 연결작업이라고 생각
	}
	
}
