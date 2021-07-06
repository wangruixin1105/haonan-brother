package com.haonan.common.constant;

/**
 * 系统常量
 */
public interface GlobalConstant {

	/**
	 * 编码
	 */
	String UTF_8 = "UTF-8";

	/**
	 * contentType
	 */
	String CONTENT_TYPE_NAME = "Content-type";

	/**
	 * JSON 资源
	 */
	String CONTENT_TYPE = "application/json;charset=utf-8";

	/**
	 * 默认为空消息
	 */
	String DEFAULT_NULL_MESSAGE = "暂无承载数据";
	/**
	 * 默认成功消息
	 */
	String DEFAULT_SUCCESS_MESSAGE = "操作成功";
	/**
	 * 默认失败消息
	 */
	String DEFAULT_FAILURE_MESSAGE = "操作失败";
	/**
	 * 默认未授权消息
	 */
	String DEFAULT_UNAUTHORIZED_MESSAGE = "签名认证失败";

}
