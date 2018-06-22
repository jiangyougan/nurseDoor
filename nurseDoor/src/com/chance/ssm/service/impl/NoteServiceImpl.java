package com.chance.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chance.ssm.mapper.notemapper.NoteMapper;
import com.chance.ssm.po.Note;
import com.chance.ssm.po.NoteExample;
import com.chance.ssm.service.NoteService;

public class NoteServiceImpl implements NoteService {
	
	@Autowired
	private NoteMapper noteMapper;

	@Override
	public List<Note> selectByExample(NoteExample example) throws Exception {
		// TODO Auto-generated method stub
		return noteMapper.selectByExample(example);
	}

	@Override
	public int insertSelective(Note record) throws Exception {
		// TODO Auto-generated method stub
		return noteMapper.insertSelective(record);
	}

	@Override
	public Note selectByPrimaryKey(String noteId) throws Exception {
		// TODO Auto-generated method stub
		return noteMapper.selectByPrimaryKey(noteId);
	}

	@Override
	public int updateByPrimaryKeySelective(Note record) throws Exception {
		// TODO Auto-generated method stub
		return noteMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int deleteByPrimaryKey(String noteId) throws Exception {
		// TODO Auto-generated method stub
		return noteMapper.deleteByPrimaryKey(noteId);
	}

}
