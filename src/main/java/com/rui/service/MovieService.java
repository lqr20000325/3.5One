package com.rui.service;

import com.github.pagehelper.PageInfo;
import com.rui.domain.Movie;
import com.rui.vo.MovieVo;

/**
 * 
 * @ClassName: MovieService 
 * @Description: TODO
 * @author: li
 * @date: 2019��11��2�� ����10:23:10
 */
public interface MovieService {

	PageInfo<Movie> selects(MovieVo movieVo, Integer page, Integer pageSize);

	boolean deleteBatch(int[] ids);

}
