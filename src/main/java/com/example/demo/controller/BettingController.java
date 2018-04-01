package com.example.demo.controller;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.base.utils.libaray.util.JacksonUtils;
import com.example.demo.controller.base.BaseController;
import com.example.demo.model.dto.JsonDto;
import com.example.demo.model.param.BettingInfoParam;
import com.example.demo.model.vo.BettingInfoVo;

@RestController
@RequestMapping("api/v1/betting")
public class BettingController extends BaseController{
	

	//一键投注和立即投注
	@RequestMapping(value = "doBetting", method = RequestMethod.POST)
	public JsonDto doBettingStr(Long ruleId, String bettingInfoStr ) {
		System.out.println(bettingInfoStr);
		List<BettingInfoVo> bettingInfoList = null;
		try {
			bettingInfoList = JacksonUtils.toList(bettingInfoStr, BettingInfoVo.class);
		} catch (Exception e) {
			json.setFailure("请求参数异常");
			return json;
		}
		try {
			if(null != bettingInfoList ) {
				for (BettingInfoVo bettingInfoVo : bettingInfoList) {
					String selectedNum = bettingInfoVo.getSelectedNum();
					System.out.println(selectedNum);
					if(StringUtils.isNotBlank(selectedNum)) {
						String[] selectedNumArr = selectedNum.split(",");
						
					}else {
						json.setFailure("投注号码不能为空");
						return json;
					}
				}
			}
		} catch (Exception e) {
			log.error("doBetting Error",e);
			json.setError();
		}
		return this.json;
	}

}
