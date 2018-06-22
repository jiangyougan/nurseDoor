package com.chance.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chance.ssm.po.GoodsExample;
import com.chance.ssm.po.Note;
import com.chance.ssm.po.NoteExample;
import com.chance.ssm.po.NoteExample.Criteria;
import com.chance.ssm.po.base.NetState;
import com.chance.ssm.po.vo.GoodsVO;
import com.chance.ssm.service.GoodsService;
import com.chance.ssm.service.NoteService;

/**
 * 产品控制类
 * 
 * @author Administrator
 * 
 */
@Controller
@RequestMapping("goods")
public class GoodsController {
	@Autowired
	private GoodsService goodsService;

	@Autowired
	private NoteService noteService;
	
	/**
	 * 通过服务ID查询产品详情并有备注
	 * 
	 * @param contentId
	 *            护理ID
	 * @return
	 */
	@RequestMapping(value = "selectgoodsbycoentid", method = RequestMethod.POST)
	public @ResponseBody
	NetState SelectContentByProjectId( String contentId) {
		NetState netState = new NetState();
		if (contentId == null || "".equals(contentId)) {
			netState.setData("服务ID错误");
			netState.setErrorCode(NetState.PARAMS_ERROR);
		} else {
			List<GoodsVO> goodsVOs = new ArrayList<GoodsVO>();
			try {
				// 根据ID查询产品
				GoodsExample goodsExample = new GoodsExample();
				com.chance.ssm.po.GoodsExample.Criteria criteria = goodsExample
						.createCriteria();
				criteria.andGoodsContentEqualTo(contentId);
				criteria.andGoodsNoteEqualTo("0");//上架
				//根据是否默认和金钱的大小排序
				goodsExample.setOrderByClause("goods_order asc,goods_isdefault asc, goods_money asc");
				
				goodsVOs = goodsService.selectByExampleRuVO(goodsExample);
				// 把“\”替换成“/”
				int goodsVosize = goodsVOs.size();
				for (int i = 0; i < goodsVosize; i++) {
					if (goodsVOs.get(i).getContentImgurl() != null) {
						String zhuanye = goodsVOs.get(i)
								.getContentImgurl().replaceAll("\\\\", "/");
						goodsVOs.get(i)
								.setContentImgurl(zhuanye);
					}
				}
				
			
				
				// 获取允许使用的备注ID
				List<String> noteidList = new ArrayList<String>();
				if (goodsVOs.size() > 0) {
					//切割备注ID
					String[] noteid = goodsVOs.get(0).getContentNote()
							.split(",");
					//把备注ID放入List列表中
					for (int i = 0; i < noteid.length; i++) {
						noteidList.add(noteid[i]);
					}
				}
				if (noteidList.size() > 0) {
					// 查询备注
					NoteExample noteExample = new NoteExample();
					Criteria criteria2 = noteExample.createCriteria();
					criteria2.andNoteIdIn(noteidList);
					List<Note> notes = new ArrayList<Note>();
					notes = noteService.selectByExample(noteExample);
					if (notes.size() > 0) {
						String notesub = notes.get(0).getNoteName();
						int notesize = notes.size();
						for (int i = 1; i < notesize; i++) {
							notesub = notesub + ","
									+ notes.get(i).getNoteName();
						}
						if(goodsVOs.size()>0){
							goodsVOs.get(0).setContentNote(notesub);
						}
					}
				}

				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			netState.setData("查询成功");
			netState.setErrorCode(NetState.SUCCESS);
			netState.setJson(goodsVOs);

		}
	
		return netState;

	}
}
