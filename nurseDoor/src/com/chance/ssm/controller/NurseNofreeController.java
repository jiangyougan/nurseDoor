package com.chance.ssm.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import net.sf.json.JSONObject;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chance.ssm.po.Nurse;
import com.chance.ssm.po.NurseNofree;
import com.chance.ssm.po.NurseNofreeExample;
import com.chance.ssm.po.NurseNofreeExample.Criteria;
import com.chance.ssm.po.NurseNofreeShift;
import com.chance.ssm.po.NurseNofreeShiftExample;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.po.vo.NurseNoFreeVo;
import com.chance.ssm.service.NurseNofreeService;
import com.chance.ssm.service.NurseService;
import com.chance.ssm.utils.DateUtil;
import com.chance.ssm.utils.GsonUtil;
/**
 * 护士空闲时间排班表
 * @author Administrator
 *
 */
@Controller
@RequestMapping("free")
public class NurseNofreeController {
	@Autowired
	private NurseNofreeService nofreeService;
	
	@Autowired
	private NurseService nurseService;
	
	
	/**
	 * 查询护士一天的时间
	 * @param nurseId
	 * @return
	 */
	@RequestMapping(value="selectnofreebyday", method = RequestMethod.POST)
	public @ResponseBody NetState SelectNoFreeByDay(String nurseId, String time)throws Exception{
		NetState netState = new NetState();
		if(nurseId == null || "".equals(nurseId)){
			netState.setData("护士ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
		     //初始化对象的list
		    List<NurseNoFreeVo> nofrees = new ArrayList<NurseNoFreeVo>();
		    
			nofrees = nofreeService.selectNurseNoFreeTimeForSomeOneDay(nurseId,time);
			
			for (int i = 0; i < nofrees.size(); i++) {//如果月历表有备注(不是排班表)
				
				String nurseNofreeNote = nofrees.get(i).getNurseNofreeNote();
				
				if(nurseNofreeNote!=null && !"".equals(nurseNofreeNote)){//不是排班表
					
					nofrees.remove(i);
					
				}
			}
			if(nofrees.size() > 0){
					netState.setData("查询成功");
					netState.setErrorCode(NetState.SUCCESS);
					netState.setJson(nofrees);
				}else{
					netState.setData("没有数据");
					netState.setErrorCode(NetState.DATA_NOT_FOUND);
				}
		}
		return netState;
		
	}
	
	/**
	 * 根据ID删除数据
	 * @param freeId
	 * @return
	 */
	@RequestMapping(value="delectnofreebyid", method = RequestMethod.POST)
	public @ResponseBody NetState DelectNoFreeById(String time,String nurseId,String noFreeshiftId){
		NetState netState = new NetState();
		if(time == null || "".equals(time)){
			netState.setData("ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(nurseId == null || "".equals(nurseId)){
			netState.setData("ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(noFreeshiftId == null || "".equals(noFreeshiftId)){
			netState.setData("ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			try {
				int i = nofreeService.deleteByNurseIdANdDateAdnShiftId(time, nurseId, noFreeshiftId);
				if(i > 0){
					netState.setData("删除成功");
					netState.setErrorCode(NetState.SUCCESS);
				}else{
					netState.setData("删除失败");
					netState.setErrorCode(NetState.PARAMS_ERROR);
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return netState;
		
	}
	
	/**
	 * 查看护士三周的空闲时间
	 * @param nurseId 护士ID
	 * @return
	 */
	@RequestMapping(value="selectnofreebynurseid", method=RequestMethod.POST)
	public @ResponseBody NetState SelectNoFreeByNurseId(String nurseId)throws Exception{
		NetState netState = new NetState();
		if(nurseId == null || "".equals(nurseId)){
			netState.setData("护士ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			 
			 List<NurseNoFreeVo> nurseNofreelist = new ArrayList<NurseNoFreeVo>();
			 
			 List<NurseNoFreeVo> newlist = new ArrayList<NurseNoFreeVo>();
			 List<NurseNoFreeVo> newlist1 = new ArrayList<NurseNoFreeVo>();
			 nurseNofreelist = 	nofreeService.selectNurseNotFreeTimeThirdWeed(nurseId);
			
			 //自己和自己比较,如果都是当天时间的 就合并
			//DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			SimpleDateFormat sdff = new SimpleDateFormat("yyyy-MM-dd");
			for (int i = 0; i < nurseNofreelist.size(); i++) {
				
				//得到该排班的日期
				Date nofreetime = nurseNofreelist.get(i).getNurseNofreeDate();
				//date转String
		    	String startTime = sdff.format(nofreetime);
		    	
		    	String begin1 = startTime+" "+nurseNofreelist.get(i).getNurseNofreeShiftBegintime();
		    	String stop1 = startTime+" "+nurseNofreelist.get(i).getNurseNofreeShiftStoptime();
				
				for (int j = 0; j < nurseNofreelist.size(); j++) {
					if(i!=j){
					if(nurseNofreelist.get(i).getDates() == nurseNofreelist.get(j).getDates() || nurseNofreelist.get(i).getDates().equals(nurseNofreelist.get(j).getDates())){
						NurseNoFreeVo nofree = nurseNofreelist.get(j);
						//得到该排班的日期
						Date nofreetime1 = nurseNofreelist.get(j).getNurseNofreeDate();
						//date转String
				    	String startTime1 = sdff.format(nofreetime1);
				    	
				    	String begin2 = startTime1+" "+nurseNofreelist.get(j).getNurseNofreeShiftBegintime();
				    	String stop2 = startTime1+" "+nurseNofreelist.get(j).getNurseNofreeShiftStoptime();
						
						nurseNofreelist.get(i).setNurseNofreeId(nurseNofreelist.get(i).getNurseNofreeId()+","+nurseNofreelist.get(j).getNurseNofreeId());
						nurseNofreelist.get(i).setNurseNofreeShiftName(nurseNofreelist.get(i).getNurseNofreeShiftName()+","+nurseNofreelist.get(j).getNurseNofreeShiftName());
						nurseNofreelist.get(i).setNurseNofreeShiftBegintime(begin1+","+begin2);
						nurseNofreelist.get(i).setNurseNofreeShiftStoptime(stop1+","+stop2);
						nurseNofreelist.get(i).setNurseNofreeShiftColor(nurseNofreelist.get(i).getNurseNofreeShiftColor()+","+nurseNofreelist.get(j).getNurseNofreeShiftColor());
						nurseNofreelist.get(i).setNurseNofreeName(nurseNofreelist.get(i).getNurseNofreeName()+","+nurseNofreelist.get(j).getNurseNofreeName());
						nurseNofreelist.get(i).setNurseNofreeNote(nurseNofreelist.get(i).getNurseNofreeNote());
						nurseNofreelist.remove(j);
						newlist.add(nurseNofreelist.get(i));
						}
					}else{
						nurseNofreelist.get(i).setNurseNofreeShiftBegintime(begin1);
						nurseNofreelist.get(i).setNurseNofreeShiftStoptime(stop1);
						newlist1.add(nurseNofreelist.get(i));
						}
					
				}
				newlist.add(nurseNofreelist.get(i));
			}
			//去重
			for  ( int  i  =   0 ; i  <  newlist.size()  -   1 ; i ++ )   { 
			    for  ( int  j  =  newlist.size()  -   1 ; j  >  i; j -- )  
			    	{ 
				      if  (newlist.get(j).getNurseNofreeId().equals(newlist.get(i).getNurseNofreeId()))   { 
				    	  newlist.remove(j); 
				      } 
			    	} 
			} 
				if(newlist.size() > 0){
					netState.setData("查询成功");
					netState.setErrorCode(NetState.SUCCESS);
					netState.setJson(newlist);
				}else{
					netState.setData("没有数据");
					netState.setErrorCode(NetState.DATA_NOT_FOUND);
				}
		}
		return netState;
		
	}
	
	/**
	 * 修改护士的空闲时间
	 * @param freeId 空闲时间ID
	 * @return
	 */
	@RequestMapping(value="updatenofree",method=RequestMethod.POST)
	public @ResponseBody NetState UpdateNoFree(String time,String nurseId,String  noFreeshiftId, String note)throws Exception{
		NetState netState = new NetState();
		if(time == null || "".equals(time)){
			netState.setData("时间参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(nurseId == null || "".equals(nurseId)){
			netState.setData("护士参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(noFreeshiftId == null || "".equals(noFreeshiftId)){
			netState.setData("班次ID参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(note == null || "".equals(note)){
			netState.setData("备注错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
		
			//修改数据库
			int i = nofreeService.updateByNurseIdANdDateAdnShiftId(note,time,nurseId,noFreeshiftId);
			if(i > 0){
				//修改成功
				netState.setData("修改成功");
				netState.setErrorCode(NetState.SUCCESS);
			}else{
				netState.setData("修改失败");
				netState.setErrorCode(NetState.PARAMS_ERROR);
			}
		}
		return netState;
		
	}
	
	/**
	 * 添加护士的空闲时间
	 * @param nurseid 护士ID
	 * @param note 排班表备注
	 * @param noFreeShiftNote 月历表备注
	 * @param NurseNofreeShiftId 班次ID
	 * @param nofreeDate 选择的日子(格式必须是2016-12-17 00:00:00)
	 * @return
	 */
	@RequestMapping(value="addnofreetime", method=RequestMethod.POST)
	public @ResponseBody NetState AddNoFreeTime(String nurseid, String noFreeNote,String noFreeShiftNote, String nurseNofreeShiftId,Date nofreeDate)throws Exception{
		NetState netState = new NetState();
		if(nurseid==null||"".equals(nurseid)){
			netState.setData("护士ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(nurseNofreeShiftId == null || "".equals(nurseNofreeShiftId)){
			netState.setData("颜色错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(nofreeDate == null || "".equals(nofreeDate)){
			netState.setData("日期参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else if(noFreeNote==null && noFreeShiftNote==null){
			netState.setData("必须添加一个备注");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}
		else if(noFreeNote!=null & noFreeShiftNote!=null){
			netState.setData("只能添加一个备注");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}
		else{
			
			SimpleDateFormat sdff = new SimpleDateFormat("yyyy-MM-dd");
			//得到该排班的日期
			//date转String
	    	String time = sdff.format(nofreeDate);
			//同一天不能存在2个相同班次的排班
			List<NurseNofree> list = nofreeService.selectCommonNoFreeInfo(nurseNofreeShiftId, time);
			
			if(list.size()>0){//说明这一天有相同班次的排班
				netState.setData("已经存在该班次的排班");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
			
			//同一天不能添加第二条月历备注
			
			NurseNofree nofree = new NurseNofree();
			//生成ID
			String id = java.util.UUID.randomUUID().toString().replace("-", "");
			//把数据保存在实体类中
			nofree.setNurseNofreeId(id);
			nofree.setNurseNofreeNurseid(nurseid);
			nofree.setNurseNofreeShiftId(nurseNofreeShiftId);
			nofree.setNurseNofreeName(noFreeNote);
			nofree.setNurseNofreeNote(noFreeShiftNote);
			nofree.setNurseNofreeDate(nofreeDate);
			nofree.setNurseNofreeCreatetime(new Date());
			nofree.setNurseNofreeCreatetime(new Date());
			try {
				int i = nofreeService.insertSelective(nofree);
				if(i>0){
					netState.setData("添加成功");
					netState.setErrorCode(NetState.SUCCESS);
					
				}else{
					netState.setData("添加失败");
					netState.setErrorCode(NetState.PARAMS_ERROR);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return netState;
	}
	/**
	 * 获取所有班次
	 * 
	 */
	@RequestMapping(value="nurseNofreeShiftAllInfo", method=RequestMethod.POST)
	public @ResponseBody NetState nurseNofreeShiftAllInfo(String nurseId)throws Exception{
		NetState netState = new NetState();
		if(nurseId==null || "".equals(nurseId)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		NurseNofreeShiftExample example = new NurseNofreeShiftExample();
		com.chance.ssm.po.NurseNofreeShiftExample.Criteria criteria = example.createCriteria();
		criteria.andNurseNofreeShiftNurseIdEqualTo(nurseId);
		List<NurseNofreeShift> list = nofreeService.selectByExampleShift(example);
		
		if(list.size()>0){
			netState.setData("查询成功");
			netState.setJson(list);
			netState.setErrorCode(NetState.SUCCESS);
		}else{
			netState.setData("查询结果为空");
			netState.setErrorCode(NetState.DATA_NOT_FOUND);
		}
		return netState;
	}
	
	/**
	 * //添加班次
	 * @param nurseId 护士ID
	 * @param NofreeShiftName 班次名称
	 * @param nofreeShiftColor 颜色
	 * @param nofreeShiftBegintime 开始时间(8:00:00)
	 * @param nofreeShiftStoptime 结束时间(10:00:00)
	 * @param nofreeShiftNote 备注
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="AddnurseNofreeShift", method=RequestMethod.POST)
	public @ResponseBody NetState AddnurseNofreeShift(String nurseId, String nofreeShiftName,String nofreeShiftColor, String nofreeShiftBegintime,String nofreeShiftStoptime,String nofreeShiftNote)throws Exception{
		NetState netState = new NetState();
		if(nurseId==null || "".equals(nurseId)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(nofreeShiftName==null || "".equals(nofreeShiftName)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(nofreeShiftColor==null || "".equals(nofreeShiftColor)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		
		if(nofreeShiftBegintime==null || "".equals(nofreeShiftBegintime)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(nofreeShiftStoptime==null || "".equals(nofreeShiftStoptime)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(nofreeShiftNote==null || "".equals(nofreeShiftNote)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		Nurse nurse =  nurseService.selectForNurseId(nurseId);
		if(nurse==null ||"".equals(nurse)){
			netState.setData("该护士不存在");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		int count=0;
		//通过名称查询有没有同名的班次名称
		count=  nofreeService.selectNurseNofreeShiftByName(nofreeShiftName,nurseId);
		if(count>0){
			netState.setData("已存在同名名称");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		
		NurseNofreeShift nurseNofreeShift = new NurseNofreeShift();
		nurseNofreeShift.setNurseNofreeShiftId(java.util.UUID.randomUUID().toString().replace("-", ""));
		nurseNofreeShift.setNurseNofreeShiftNurseId(nurseId);
		nurseNofreeShift.setNurseNofreeShiftName(nofreeShiftName);
		nurseNofreeShift.setNurseNofreeShiftNote(nofreeShiftNote);
		nurseNofreeShift.setNurseNofreeShiftColor(nofreeShiftColor);
		nurseNofreeShift.setNurseNofreeShiftBegintime(nofreeShiftBegintime);
		nurseNofreeShift.setNurseNofreeShiftStoptime(nofreeShiftStoptime);
		nurseNofreeShift.setNurseNofreeShiftState(1);
		nurseNofreeShift.setNurseNofreeShiftCreatetime(new Date());
		
		int i = nofreeService.insertSelectiveShift(nurseNofreeShift);
		if(i==0){
			netState.setData("添加失败");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			netState.setData("添加成功");
			netState.setErrorCode(NetState.SUCCESS);
		}
		return netState;
	}
	/**
	 * //修改班次
	 * @param nofreeShiftId班次ID
	 * @param nurseId 护士ID
	 * @param NofreeShiftName 班次名称
	 * @param nofreeShiftColor 颜色
	 * @param nofreeShiftBegintime 开始时间(8:00:00)
	 * @param nofreeShiftStoptime 结束时间(10:00:00)
	 * @param nofreeShiftNote 备注
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="uptnurseNofreeShift", method=RequestMethod.POST)
	public @ResponseBody NetState uptnurseNofreeShift(String nofreeShiftId, String nurseId, String nofreeShiftName,String nofreeShiftColor, String nofreeShiftBegintime,String nofreeShiftStoptime,String nofreeShiftNote)throws Exception{
		NetState netState = new NetState();
		if(nurseId==null || "".equals(nurseId)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		if(nofreeShiftId==null || "".equals(nofreeShiftId)){
			netState.setData("参数错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		//通过班次ID查询是不是该用户的班次
		
		NurseNofreeShift nofreeShift = nofreeService.selectByPrimaryKeyByShiftId(nofreeShiftId);
		String nofreeShiftNurseId = nofreeShift.getNurseNofreeShiftNurseId();
		if(nofreeShiftNurseId!=nurseId && !nurseId.equals(nofreeShiftNurseId)){
			netState.setData("该班次不属于该用户");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		Nurse nurse =  nurseService.selectForNurseId(nurseId);
		if(nurse==null ||"".equals(nurse)){
			netState.setData("该护士不存在");
			netState.setErrorCode(NetState.PARAMS_ERROR);
			return netState;
		}
		int count=0;
		//通过名称查询有没有同名的班次名称
		if(nofreeShiftName!=null&&!"".equals(nofreeShiftName)){
			count=  nofreeService.selectNurseNofreeShiftByName(nofreeShiftName,nurseId);
			if(count>1){
				netState.setData("已存在同名名称");
				netState.setErrorCode(NetState.PARAMS_ERROR);
				return netState;
			}
		}
		
		
		NurseNofreeShift nurseNofreeShift = new NurseNofreeShift();
		nurseNofreeShift.setNurseNofreeShiftId(nofreeShiftId);
		nurseNofreeShift.setNurseNofreeShiftNurseId(nurseId);
		
		if(nofreeShiftName!=null&&!"".equals(nofreeShiftName)){
			
			nurseNofreeShift.setNurseNofreeShiftName(nofreeShiftName);
		
		}
		if(nofreeShiftNote!=null&&!"".equals(nofreeShiftNote)){
			nurseNofreeShift.setNurseNofreeShiftNote(nofreeShiftNote);
		}
		if(nofreeShiftColor!=null&&!"".equals(nofreeShiftColor)){
			nurseNofreeShift.setNurseNofreeShiftColor(nofreeShiftColor);
		}
		if(nofreeShiftBegintime!=null&&!"".equals(nofreeShiftBegintime)){
			nurseNofreeShift.setNurseNofreeShiftBegintime(nofreeShiftBegintime);
		}
		if(nofreeShiftStoptime!=null&&!"".equals(nofreeShiftStoptime)){
			nurseNofreeShift.setNurseNofreeShiftStoptime(nofreeShiftStoptime);
		}
		nurseNofreeShift.setNurseNofreeShiftCreatetime(new Date());
		
		int i = nofreeService.updateByPrimaryKeySelectiveNofreeShiftId(nurseNofreeShift);
		if(i==0){
			netState.setData("修改失败");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		}else{
			netState.setData("修改成功");
			netState.setErrorCode(NetState.SUCCESS);
		}
		return netState;
	}
	
}
