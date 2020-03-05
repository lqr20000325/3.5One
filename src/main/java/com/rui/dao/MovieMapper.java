
package com.rui.dao;

import java.util.List;

import com.rui.domain.Movie;
import com.rui.vo.MovieVo;

public interface MovieMapper {

	List<Movie> selects(MovieVo movieVo);

	void deleteBatch(int[] ids);

}
