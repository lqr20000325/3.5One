package com.rui.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rui.dao.MovieMapper;
import com.rui.domain.Movie;
import com.rui.service.MovieService;
import com.rui.vo.MovieVo;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Resource
	private MovieMapper movieMapper;

	@Override
	public PageInfo<Movie> selects(MovieVo movieVO, Integer page, Integer pageSize) {
		
		PageHelper.startPage(page, pageSize);
		
		List<Movie> list = movieMapper.selects(movieVO);
		
		return new PageInfo<Movie>(list);
	}

	@Override
	public boolean deleteBatch(int[] ids) {
		try {
			movieMapper.deleteBatch(ids);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

}
