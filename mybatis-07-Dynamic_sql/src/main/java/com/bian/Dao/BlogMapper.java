package com.bian.Dao;

import com.bian.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author Kevin
 * @Data 2021/4/21
 */
public interface BlogMapper {

     int addBlog(Blog blog);

     List<Blog> queryBlogIf(Map map);

     List<Blog> queryBlogChoose(Map map);

     int updateBlog(Map map);

     List<Blog> queryBlogForEach(Map map);

}
