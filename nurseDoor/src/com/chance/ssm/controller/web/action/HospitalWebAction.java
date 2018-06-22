package com.chance.ssm.controller.web.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chance.ssm.po.Hospital;
import com.chance.ssm.po.HospitalExample;
import com.chance.ssm.po.Major;
import com.chance.ssm.po.MajorExample;
import com.chance.ssm.po.SimpleMajor;
import com.chance.ssm.po.SimpleMajorExample;
import com.chance.ssm.po.SimpleMajorExample.Criteria;
import com.chance.ssm.po.vo.SimpleMajorVO;
import com.chance.ssm.service.HospitalService;
import com.chance.ssm.service.MajorService;
import com.chance.ssm.service.SimpleMajorService;
/**
 * 医院控制类
 * @author Administrator
 *
 */
@Controller
public class HospitalWebAction {
	@Autowired
	private HospitalService hospitalService;
	
	@Autowired
	private SimpleMajorService simpleMajorService;
	
	@Autowired
	private MajorService majorService;
	
	
	/**
	 * 根据医院名称查询医院信息
	 * @param hospitalName 医院名
	 * @param model
	 * @return
	 */
	@RequestMapping(value="selecthospitalbynameweb", method = RequestMethod.POST)
	public String SelectHospitalByNameWeb(String hospitalName, Model model){
		//新建医院对象的list
		 List<Hospital> hospitals = new ArrayList<Hospital>();
		 HospitalExample hospitalExample = new HospitalExample();
		 com.chance.ssm.po.HospitalExample.Criteria criteria = hospitalExample.createCriteria();
		 criteria.andHospitalNameLike("%"+hospitalName+"%");
		 try {
			hospitals = hospitalService.selectByExample(hospitalExample);
			model.addAttribute("list", hospitals);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "hospital-list";
		
	}
	
	
	/**
	 * 根据ID删除医院
	 * @param hospitalId 医院ID
	 * @return
	 */
	@RequestMapping(value="delecthospitalbyid")
	public String DelectHospitalById(String hospitalId){
		int i = 0;
		if(hospitalId == null || "".equals(hospitalId)){
			return "error";
		}else{
			try {
				i = hospitalService.deleteByPrimaryKey(hospitalId);
				if(i > 0){
					MajorExample majorExample = new MajorExample();
					com.chance.ssm.po.MajorExample.Criteria criteria = majorExample.createCriteria();
					criteria.andMajorDetailsEqualTo(hospitalId);
					majorService.deleteByExample(majorExample);
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(i > 0){
			return "redirect:selecthospitalallweb.action";
		}else{
			return "error";
		}
		
		
	}
	
	/**
	 * 添加医院
	 * @param hospitalName 医院名
	 * @param hospitalProvince 所在省份
	 * @param hospitalCity 所在城市
	 * @param hospitalDistrict 所在区县
	 * @param hospitalAddress 医院详细地址
	 * @param hospitalPhone 医院电话 
	 * @param session
	 * @return
	 */
	@RequestMapping(value="updatehospitalbyid")
	public String updatehospitalbyid(String hospitalId, String hospitalName, String hospitalProvince, String hospitalCity, String hospitalDistrict, String hospitalAddress, String hospitalPhone, HttpSession session, HttpServletRequest request){
		String[] majorIds = request.getParameterValues("ifAll");//返回一个数组
		//初始化医院bean
		Hospital hospital = new Hospital();
		if(hospitalId != null && !"".equals(hospitalId)){
			hospital.setHospitalId(hospitalId);
		}
		if(hospitalName != null && !"".equals(hospitalName)){
			hospital.setHospitalName(hospitalName);
		}
		if(hospitalProvince != null && !"".equals(hospitalProvince)){
			hospital.setHospitalProvince(hospitalProvince);
		}
		if(hospitalCity != null && !"".equals(hospitalCity)){
			hospital.setHospitalCity(hospitalCity);
		}
		if(hospitalDistrict != null && !"".equals(hospitalDistrict)){
			hospital.setHospitalDistrict(hospitalDistrict);
		}
		if(hospitalAddress != null && !"".equals(hospitalAddress)){
			hospital.setHospitalAddress(hospitalAddress);
		}
		if(hospitalPhone != null && !"".equals(hospitalPhone)){
			hospital.setHospitalPhone(hospitalPhone);
		}
		int i = 0;
		try {
			 i = hospitalService.updateByPrimaryKeySelective(hospital);
			if(i > 0){
				//如果医院插入成功则插入医院和专业的关联表
				//查询专业的信息
				//初始化专业ID的list
				List<String> majorIdlist = new ArrayList<String>();
				for(int j = 0; j < majorIds.length; j++){
					majorIdlist.add(majorIds[j]);
				}
				if(majorIdlist.size() > 0){
					//如果有专业ID则从专业表中查出来专业信息
					List<SimpleMajor> simpleMajors = new ArrayList<SimpleMajor>();
					SimpleMajorExample simpleMajorExample = new SimpleMajorExample();
					Criteria criteria = simpleMajorExample.createCriteria();
					criteria.andSimpleMajorIdIn(majorIdlist);
					try {
						simpleMajors = simpleMajorService.selectByExample(simpleMajorExample);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//如果查出来的专业不为空
					int simpleMajorsize = simpleMajors.size();
					if(simpleMajorsize > 0){
						Major major = new Major();
						for(int n = 0; n < simpleMajorsize; n++){
							major.setMajorId(simpleMajors.get(n).getSimpleMajorId());
							major.setMajorName(simpleMajors.get(n).getSimpleMajorName());
							major.setMajorDetails(hospitalId);
							major.setMajorNote(simpleMajors.get(n).getSimpleMajorNote());
//							major.setMajorCreateter(session.getAttribute("").toString());
							major.setMajorCteatetime(new Date());
							try {
								majorService.insertSelective(major);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}
				
				
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i < 0){
			return "error";
		}else{
			return "redirect:selecthospitalallweb.action";
		}
	
	}
	/**
	 * 根据医院ID查出所需要修改的医院的所有信息
	 * @param hospitalId 医院ID
	 * @param model
	 * @return
	 */
	@RequestMapping(value="selecthospitalmodifybyidtest",method = RequestMethod.GET)
	public String SelectHospitalModifyByid(String hospitalId, Model model){
		if(hospitalId == null && "".equals(hospitalId)){
			return "redirect:selecthospitalallweb.action";
		}else{
			//查询医院信息
			Hospital hospital = new Hospital();
			try {
				hospital = hospitalService.selectByPrimaryKey(hospitalId);
				//查询医院下面的专业
				List<Major> majors = new ArrayList<Major>();
				MajorExample majorExample = new MajorExample();
				com.chance.ssm.po.MajorExample.Criteria criteria = majorExample.createCriteria();
				criteria.andMajorDetailsEqualTo(hospitalId);
				majors = majorService.selectByExample(majorExample);
				//获取医院下面的所有的专业的ID
				List<String> majorIds = new ArrayList<String>();
				int majorsize = majors.size();
				for(int i = 0; i < majorsize; i++){
					majorIds.add(majors.get(i).getMajorId());
				}
				//查询所有的专业
				List<SimpleMajorVO> simpleMajors = new ArrayList<SimpleMajorVO>();
				SimpleMajorExample simpleMajorExample = new SimpleMajorExample();
				simpleMajors = simpleMajorService.selectByExampleRuVO(simpleMajorExample);
				//医院下面的专业和所有的专业进行比较
				for(int j = 0; j < majorsize; j++){
					if(majorIds.get(j).equals(simpleMajors.get(j).getSimpleMajorId())){
						simpleMajors.get(j).setIsUse(1);
					}else{
						simpleMajors.get(j).setIsUse(0);
					}
				}
				model.addAttribute("hospitalId", hospitalId);
				model.addAttribute("hospital", hospital);
				model.addAttribute("simpleMajors", simpleMajors);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return "hospital-update";
		
	}
		
	/**
	 * 根据医院ID查询医院所有的专业
	 * @param hospitalId
	 * @param model
	 * @return
	 */
	@RequestMapping(value="slecthospitalinfobyid")
	public String SlectHospitalInfoById(String hospitalId, Model model){
		if(hospitalId == null && "".equals(hospitalId)){
			return "redirect:selecthospitalallweb.action";
		}else{
			List<Major> majors = new ArrayList<Major>();
			MajorExample majorExample = new MajorExample();
			com.chance.ssm.po.MajorExample.Criteria criteria = majorExample.createCriteria();
			criteria.andMajorDetailsEqualTo(hospitalId);
			try {
				majors = majorService.selectByExample(majorExample);
				model.addAttribute("majors", majors);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "hospital-major";
		
	}
	
	/**
	 * 查询所有的医院
	 * @param model
	 * @return
	 */
	@RequestMapping(value="selecthospitalallweb")
	public String SelectHospitalAllWeb(Model model){
		List<Hospital> hospitalList = new ArrayList<Hospital>();
		HospitalExample hospitalExample = new HospitalExample();
		hospitalExample.setOrderByClause("hospital_createtime desc");
		try {
			hospitalList = hospitalService.selectByExample(hospitalExample);
			model.addAttribute("list", hospitalList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "hospital-list";
		
	}
	/**
	 * 添加医院
	 * @param hospitalName 医院名
	 * @param hospitalProvince 所在省份
	 * @param hospitalCity 所在城市
	 * @param hospitalDistrict 所在区县
	 * @param hospitalAddress 医院详细地址
	 * @param hospitalPhone 医院电话 
	 * @param session
	 * @return
	 */
	@RequestMapping(value="addhospital",method = RequestMethod.POST)
	public String AddHospital(String hospitalName, String hospitalProvince, String hospitalCity, String hospitalDistrict, String hospitalAddress, String hospitalPhone, HttpSession session, HttpServletRequest request){
		String[] majorIds = request.getParameterValues("ifAll");//返回一个数组
		
		Hospital hospital = new Hospital();
		//生成ID
		String hospitalId = java.util.UUID.randomUUID().toString().replaceAll("-", "");
		hospital.setHospitalId(hospitalId);
		if(hospitalName != null && !"".equals(hospitalName)){
			hospital.setHospitalName(hospitalName);
		}
		if(hospitalProvince != null && !"".equals(hospitalProvince)){
			hospital.setHospitalProvince(hospitalProvince);
		}
		if(hospitalCity != null && !"".equals(hospitalCity)){
			hospital.setHospitalCity(hospitalCity);
		}
		if(hospitalDistrict != null && !"".equals(hospitalDistrict)){
			hospital.setHospitalDistrict(hospitalDistrict);
		}
		if(hospitalAddress != null && !"".equals(hospitalAddress)){
			hospital.setHospitalAddress(hospitalAddress);
		}
		if(hospitalPhone != null && !"".equals(hospitalPhone)){
			hospital.setHospitalPhone(hospitalPhone);
		}
//		hospital.setHospitalCreateter(session.getAttribute("").toString());
		hospital.setHospitalCreatetime(new Date());
		int i = 0;
		try {
			i = hospitalService.insertSelective(hospital);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i > 0){
			//如果医院插入成功则插入医院和专业的关联表
			//查询专业的信息
			//初始化专业ID的list
			List<String> majorIdlist = new ArrayList<String>();
			if (majorIds.length > 0) {
				for (int j = 0; j < majorIds.length; j++) {
					majorIdlist.add(majorIds[j]);
				}
			}
			if(majorIdlist.size() > 0){
				//如果有专业ID则从专业表中查出来专业信息
				List<SimpleMajor> simpleMajors = new ArrayList<SimpleMajor>();
				SimpleMajorExample simpleMajorExample = new SimpleMajorExample();
				Criteria criteria = simpleMajorExample.createCriteria();
				criteria.andSimpleMajorIdIn(majorIdlist);
				try {
					simpleMajors = simpleMajorService.selectByExample(simpleMajorExample);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//如果查出来的专业不为空
				int simpleMajorsize = simpleMajors.size();
				if(simpleMajorsize > 0){
					Major major = new Major();
					for(int n = 0; n < simpleMajorsize; n++){
						major.setMajorId(simpleMajors.get(n).getSimpleMajorId());
						major.setMajorName(simpleMajors.get(n).getSimpleMajorName());
						major.setMajorDetails(hospitalId);
						major.setMajorNote(simpleMajors.get(n).getSimpleMajorNote());
//						major.setMajorCreateter(session.getAttribute("").toString());
						major.setMajorCteatetime(new Date());
						try {
							majorService.insertSelective(major);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
			
			
			return "redirect:selecthospitalallweb.action";
		}else{
			return "error";
		}
		
	}
	/**
	 * 添加医院是查出所有专业 
	 * @param model
	 * @return
	 */
	@RequestMapping(value="addhospitalbefomajor")
	public String AddHospitalBefoMajor(Model model) {
		// 新建专业对象的list
		List<SimpleMajor> simpleMajorList = new ArrayList<SimpleMajor>();
		SimpleMajorExample simpleMajorExample = new SimpleMajorExample();
		simpleMajorExample.setOrderByClause("simple_major_createtime desc");
		try {
			// 查询所有的专业
			simpleMajorList = simpleMajorService
					.selectByExample(simpleMajorExample);
			model.addAttribute("simpleMajorList", simpleMajorList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "hospital-add";
	}
}
