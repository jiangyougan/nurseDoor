package com.chance.ssm.service;

import java.util.List;

import com.chance.ssm.po.Note;
import com.chance.ssm.po.NoteExample;

public interface NoteService {
	
	//根据传入的条件查询数据
	 public List<Note> selectByExample(NoteExample example) throws Exception;
	 
	 //添加备注信息
	 public int insertSelective(Note record)throws Exception;
	 
	 //根据ID查询备注
	 public Note selectByPrimaryKey(String noteId)throws Exception;
	 
	 //根据ID更新数据
	 public int updateByPrimaryKeySelective(Note record)throws Exception;
	 
	 //根据ID删除数据
	 public int deleteByPrimaryKey(String noteId)throws Exception;

}
