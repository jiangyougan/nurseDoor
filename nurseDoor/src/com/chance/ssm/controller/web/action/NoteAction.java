package com.chance.ssm.controller.web.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chance.ssm.po.Note;
import com.chance.ssm.po.NoteExample;
import com.chance.ssm.service.NoteService;
/**
 * 备注信息控制类
 * @author Administrator
 *
 */
@Controller
public class NoteAction {
	@Autowired
	private NoteService noteService;
	
	/**
	 * 根据ID删除备注
	 * @param noteId 备注ID
	 * @return
	 */
	@RequestMapping(value="delNoteById")
	public String DelNoteById(String noteId){
		int i = 0;
		try {
			i = noteService.deleteByPrimaryKey(noteId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i > 0){
			return "redirect:WebselectNoteAll.action";
		}else{
			return "error";
		}
		
		
	}
	
	/**
	 * 根据ID修改备注信息
	 * @param noteName 备注名
	 * @param noteId 备注ID
	 * @return
	 */
	@RequestMapping(value="webNoteUpdateById", method=RequestMethod.POST)
	public String WebNoteUpdateById(String noteName, String noteId){
		int i = 0;
		Note note = new Note();
		note.setNoteName(noteName);
		note.setNoteId(noteId);
		try {
			 i = noteService.updateByPrimaryKeySelective(note);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i > 0){
			return "redirect:WebselectNoteAll.action";
		}else{
			return "error";
		}
		
		
	}
	
	
	/**
	 * 查询出要修改的备注信息
	 * @param noteId 备注ID
	 * @param model
	 * @return
	 */
	@RequestMapping(value="webNoteModifyById")
	public String WebNoteModifyById(String noteId, Model model){
		Note note = new Note();
		try {
			note = noteService.selectByPrimaryKey(noteId);
			model.addAttribute("note", note);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "note-update";
		
	}
	
	/**
	 * 查询所有的备注信息
	 * @return
	 */
	@RequestMapping(value="WebselectNoteAll")
	public String selectNoteAll(Model model){
	
		try {
			//查询所有备注信息 
			List<Note> noteList = new ArrayList<Note>();
			NoteExample noteExample = new NoteExample();
			//按时间进行排序
			noteExample.setOrderByClause("note_crtetime desc");
			noteList = noteService.selectByExample(noteExample);
			model.addAttribute("noteList", noteList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "note-list";
		
	}
	
	/**
	 * 添加备注信息
	 * @param noteName 备注名称
	 * @return
	 */
	@RequestMapping(value="webAddNote",method = RequestMethod.POST)
	public String WebAddNote(String noteName, HttpSession session){
		int i = 0;
		Note note = new Note();
		note.setNoteId(java.util.UUID.randomUUID().toString()
				.replaceAll("-", ""));
		note.setNoteName(noteName);
		//暂时还没有session
//		note.setNoteCrteadmin(session.getAttribute("adminid").toString());
		note.setNoteCrtetime(new Date());
		try {
			 i = noteService.insertSelective(note);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i > 0){
			return "redirect:WebselectNoteAll.action";
		}else{
			return "error";
		}
		
		
	}
}
