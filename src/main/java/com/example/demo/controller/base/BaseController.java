package com.example.demo.controller.base;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.common.Constant;
import com.example.demo.model.dto.JsonDto;
import com.example.demo.model.entity.Player;


public class BaseController {
	protected JsonDto json = new JsonDto();
	protected HttpSession session;
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected String JSONVIEW = "jsonview";
	protected int pageSize = 10;
	protected int pageNum = 1;
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	protected Player player;
	protected Long playerId;
	
	
	@ModelAttribute
	protected void setRquAndResp(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
		this.session = request.getSession();
		pageSize = this.getInt("pageSize")== 0 ? 10 : getInt("pageSize");
		pageNum = getInt("pageNum") == 0 ? 1 : getInt("pageNum");
		this.player = (Player) this.session.getAttribute(Constant.PLAYER_INFO);
		this.playerId = this.player.getPlayerId();
	}

	
	
	protected Long  getPlayerId() {
		return this.playerId;
	}
	
	protected Player getPlayerInfo() {
		return this.player;
	}
	
	
	
	public HttpSession getSession() {
		return session;
	}



	public HttpServletRequest getRequest() {
		return request;
	}



	public HttpServletResponse getResponse() {
		return response;
	}



	public int getPageSize() {
		return pageSize;
	}



	/**
	 * 获取web项目根路径
	 * 
	 * @return
	 */
	protected String getWebRoot() {
		HttpServletRequest request = this.request;
		// 得到协议如：http
		String scheme = request.getScheme();
		// 得到服务器名称如：127.0.0.1
		String serverName = request.getServerName();
		// 得到端口号如8080
		String serverPort = request.getServerPort() == 80 ? "" : (":" + request.getServerPort());
		// 得到当前上下文路径，也就是安装后的文件夹位置。
		String contextPath = request.getContextPath().equals("/") ? "" : request.getContextPath();
		// 连起来拼成完整的url
		String webRoot = scheme + "://" + serverName + serverPort + contextPath + "/";
		return webRoot;
	}

	/**
	 * 获取基于应用程序的url绝对路径
	 * 
	 * @param request
	 * @param url
	 *            以"/"打头的URL地址
	 * @return 基于应用程序的url绝对路径
	 */
	public final String getAppbaseUrl(HttpServletRequest request, String url) {
		Assert.hasLength(url, "url不能为空");
		Assert.isTrue(url.startsWith("/"), "必须以/打头");
		return request.getContextPath() + url;
	}

	
	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	
	
	private int getInt(String parameter) {
		try {
			return Integer.parseInt(request.getParameter(parameter));
		} catch (Exception ex) {
		}
		return 0;
	}
}
