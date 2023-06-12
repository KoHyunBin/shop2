package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.mapper.CommentMapper;
import logic.Comment;
@Repository
public class CommentDao {
	@Autowired
	private SqlSessionTemplate template;
	private Map<String,Object> param = new HashMap<>();
	private Class<CommentMapper> cls = CommentMapper.class;
	
	public int maxSeq(int num) {
		return template.getMapper(cls).maxSeq(num);
	}
	public void commInsert(Comment c) {
		template.getMapper(cls).commInsert(c);
	}
	public List<Comment> commentlist(Integer num) {
		return template.getMapper(cls).commlist(num);
	}
	public void commentdelete(int num, int seq, String pass) {
		template.getMapper(cls).commentdelete(num,seq,pass);
	}
	public Comment commentOne(int num, int seq) {
		return template.getMapper(cls).commentOne(num,seq);
	}
	
	
}
