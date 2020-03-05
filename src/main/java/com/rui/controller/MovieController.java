package com.rui.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.rui.domain.Movie;
import com.rui.service.MovieService;
import com.rui.util.PageUtil;
import com.rui.vo.MovieVo;

@Controller
public class MovieController {
	
	@Resource
	private MovieService movieService;
	
	@RequestMapping("selects")
	public String select(HttpServletRequest request,MovieVo movieVo,@RequestParam(defaultValue = "1")Integer page,
			@RequestParam(defaultValue = "3")Integer pageSize
			) {
		
		if(null == movieVo.getOrderMethod()) {
			movieVo.setOrderMethod("asc");
		}
		
		PageInfo<Movie> info = movieService.selects(movieVo,page,pageSize);
		PageUtil.page(request, "/selects", pageSize, info.getList(), (int)(info.getTotal()), pageSize);
		
		request.setAttribute("info", info);
		request.setAttribute("movieVo", movieVo);
		return "movies";
	}
	
	@RequestMapping("deleteBatch")
	@ResponseBody
	public boolean deleteBatch(@RequestParam("ids")int[] ids) {
		boolean flag = movieService.deleteBatch(ids);
		return flag;
	}
	
	@RequestMapping("to")
	public String to() {
		return "demo";
	}
}
