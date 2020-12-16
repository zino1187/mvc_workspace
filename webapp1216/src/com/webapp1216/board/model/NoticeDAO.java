package com.webapp1216.board.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.webapp1216.mybatis.config.MybatisConfigManager;

public class NoticeDAO {
	MybatisConfigManager manager=MybatisConfigManager.getInstance();//singleTon ��ü���
	
	public int insert(Notice notice) {
		int result=0;
		//jdbc�� �ƴ� mybatis�� ������ ��������!!
		SqlSession sqlSession=manager.getSqlSession(); //������� ��ü(xml�� ������ ȣ���� �� �ִ�..)
		result = sqlSession.insert("Notice.insert", notice); 
		sqlSession.commit();//DML�ΰ�� commit ó��
		manager.close(sqlSession);
		return result;
	}
	
	public List selectAll() {
		List list=null;
		SqlSession sqlSession  = manager.getSqlSession();
		list=sqlSession.selectList("Notice.selectAll");
		manager.close(sqlSession);
		return list;
	}
	
	public Notice select(int notice_id) {
		Notice notice=null;
		return notice;
	}
	public int update(Notice notice) {
		int result=0;
		return result;
	}
	public int delete(int notice_id) {
		int result=0;
		return result;
	}
}





