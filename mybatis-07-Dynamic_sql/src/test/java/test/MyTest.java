package test;

import com.bian.Dao.BlogMapper;
import com.bian.Utils.IdUtils;
import com.bian.Utils.MybatisUtils;
import com.bian.pojo.Blog;
import com.sun.javafx.collections.MappingChange;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.type.BlobTypeHandler;
import org.junit.Test;

import java.util.*;

/**
 * @author Kevin
 * @Data 2021/4/21
 */
public class MyTest {
    @Test
    public void addBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Date dt = new Date();
        java.sql.Date date= new java.sql.Date(dt.getTime());
        Blog blog = new Blog();
        blog.setId(IdUtils.getId());
        blog.setTitle("如何学好Java");
        blog.setAuthor("边文凯");
        blog.setCreateTime(new Date());
        blog.setViews(100);
        mapper.addBlog(new Blog(IdUtils.getId(),"java应该怎么学","文凯",date,200));
        blog.setId(IdUtils.getId());
        blog.setTitle("sql应该怎样写");
        mapper.addBlog(blog);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void queryBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String,String> map =new HashMap();
        map.put("title","java应该怎么学");
        map.put("author","文凯");
        List<Blog> blogList = mapper.queryBlogIf(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public void queryBlogChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        map.put("author","文凯");
        List<Blog> blogList = mapper.queryBlogChoose(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public void updateBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        map.put("title","css应该怎么学");
        map.put("author","文凯");
        map.put("id","516a05dcf3b340e288b397ab64f6933b");
        mapper.updateBlog(map);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void queryBlogForEach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        List list = new ArrayList();
        Map map = new HashMap();
        list.add(1);
        list.add(3);
        //真实传入的是个list数组，只是放在map中传入的，也可以直接传list数组
        map.put("collect",list);
        List<Blog> blogList = mapper.queryBlogForEach(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
