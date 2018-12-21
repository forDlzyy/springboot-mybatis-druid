package com.example.mybatisdemo.domain.common;

/***
 * 对应Result数据返回状态标示
 * 
 * Created by qingbiao.zhu on 2018/05/30.
 *
 */
public interface Status {
	/***
	 * 通用状态定义
	 * 表示完成
	 */
	int OK = 0;
	String OK_MSG = "OK";

	int ER = 1;
	String ER_MSG = "FAIL";

	int ER_PARAM = 2;
	String ER_PARAM_MSG = "参数错误";

	/***
	 * 登录状态定义
	 */
	int LOGIN_STATUS_EXCEEDS_AUTHORIZED_ACCESS = 10001;
	String LOGIN_STATUS_EXCEEDS_AUTHORIZED_ACCESS_MSG = "你好，你无权访问此功能，请联系管理员开通权限！";
	int LOGIN_STATUS_USER_DELETED = 10002;
	String LOGIN_STATUS_USER_DELETED_MSG = "你好，该用户已被删除，请联系管理员！";
	int LOGIN_STATUS_USER_FREEZED = 10003;
	String LOGIN_STATUS_USER_FREEZED_MSG = "你好，该用户已被冻结，请联系管理员！";

	/***
	 * Excel导入导出 状态定义 导入状态值从20001开始 导出状态值从21001开始
	 */
	int EXCEL_IMPORT_EXPANDED_FORMAT_ERROR = 20001;
	String EXCEL_IMPORT_EXPANDED_FORMAT_ERROR_MSG = "导入的Excel扩展名格式不是正确的格式,请重新导入！";
	int EXCEL_IMPORT_FILE_SIZE_OUT_RANGE_ERROR = 20002;
	String EXCEL_IMPORT_FILE_SIZE_OUT_RANGE_ERROR_MSG = "选择的文件超出大小范围,文件最大为1000MB！";

	int EXCEL_EXPORT_GLOBAL_CONFINE_DAYS_ERROR = 21001;
	String EXCEL_EXPORT_GLOBAL_CONFINE_DAYS_ERROR_MSG = "导出要求：录入时间跨度不超过一个月,请修改筛选条件后重新导出！";

	int EXCEL_EXPORT_GLOBAL_CONFINE_YEAR_ERROR = 21002;
	String EXCEL_EXPORT_GLOBAL_CONFINE_YEAR_ERROR_MSG = "导出要求：录入时间跨度不超过一年,请修改筛选条件后重新导出！";

	/***
	 * OSS文件上传状态定义
	 */
	int OSS_UPLOAD_PARAM_ERROR = 30001;
	String OSS_UPLOAD_PARAM_ERROR_MSG = "文件上传参数错误";

	int OSS_UPLOAD_BASE64_ERROR = 30002;
	String OSS_UPLOAD_BASE64_ERROR_MSG = "base64格式错误";

	int OSS_UPLOAD_IMAGE_MAX_SIZE_ERROR = 30003;
	String OSS_UPLOAD_IMAGE_MAX_SIZE_ERROR_MSG = "请上传大小在 4MB以内的图片";

	/***
	 * 系统操作的状态定义
	 */
	int SYSTEMOPERATE_FROM_REPEAT_SUBMIT = 40001;
	String SYSTEMOPERATE_FROM_REPEAT_SUBMIT_MSG = "系统提示：表单重复提交，请稍后再试";

	/***
	 * shiro权限请求状态定义
	 */
	int REQUEST_STATUS_UNAUTHORIZED = 4011;
	String REQUEST_STATUS_UNAUTHORIZED_MSG = "未经授权：由于凭据无效，访问被拒绝。";
	int REQUEST_STATUS_UNVITAL = 4012;
	String REQUEST_STATUS_UNVITAL_MSG = "登录失败：由于凭据过期，请重新登录。";
	int REQUEST_STATUS_USER_NOT_EXIST = 4014;
	String REQUEST_STATUS_USER_NOT_EXIST_MSG = "未经授权：用户不存在。";
	int REQUEST_STATUS_CSRFTOKEN_NOT_FOUND = 4015;
	String REQUEST_STATUS_CSRFTOKEN_NOT_FOUND_MSG = "CSRF Token未找到！";
	int REQUEST_STATUS_CSRFTOKEN_INVALID = 4016;
	String REQUEST_STATUS_CSRFTOKEN_INVALID_MSG = "CSRF Token无效！";
	int REQUEST_STATUS_EXCEEDS_AUTHORIZED_ACCESS = 4030;
	String REQUEST_STATUS_EXCEEDS_AUTHORIZED_ACCESS_MSG = "未经授权：越权访问。";
	int REQUEST_STATUS_CSRF_ACCESS = 4038;
	String REQUEST_STATUS_CSRF_ACCESS_MSG = "未经授权站点：拒绝访问。";
	int REQUEST_STATUS_LOGIN_ERROR = 5000;
	String REQUEST_STATUS_LOGIN_ERROR_MSG = "登录失败，请再次登录。";

	/***
	 * 状态定义说明 根据页面原型分化大板块：六个板块 系统基础管理(系统管理、权限管理)、商场基础信息管理、推广运营管理、会员积分管理、页面管理、
	 * 状态定义规范:Entity单词分解_状态功能_标示 每个状态定义后紧接着再定义状态内容,状态内容定义规范：状态_MEG
	 * 每个模块都按照自己模块定义的状态引用，不可乱引用其他定义相同的状态值！
	 */

	/***
	 * 1 全部 01 系统管理 01 日志系统 01 第一个状态值
	 */
	/*************** <<<=== 系统管理 ===>>> ***************/
	/************************* <日志系统管理>状态定义开始 *********************************/
	int SYSTEM_USER_LOG_EXCEL_EXPORT_SIZE_CONFINE_ERROR = 1010101;
	String SYSTEM_USER_LOG_EXCEL_EXPORT_SIZE_CONFINE_ERROR_MSG = "单次最多导出5万条记录，请修改筛选条件后重新导出！";

	/************************* <日志系统管理>状态定义结束 *********************************/

	/*************** <<<=== 权限管理 ===>>> ***************/
	/************************* <用户管理>状态定义开始 *********************************/
	int AUTHORITY_USER_EXCEL_EXPORT_SIZE_CONFINE_ERROR = 1020101;
	String AUTHORITY_USER_EXCEL_EXPORT_SIZE_CONFINE_ERROR_MSG = "单次最多导出1万条记录，请修改筛选条件后重新导出！";
	int AUTHORITY_USER_NOT_FOUND_TENANT_STATUS = 1020102;
	String AUTHORITY_USER_NOT_FOUND_TENANT_MSG = "商户不能为空";
	/************************* <用户管理>状态定义结束 *********************************/

	/************************* <角色管理>状态定义开始 *********************************/
	/***
	 * 1020201 为第一个状态开始
	 */
	int AUTHORITY_ROLE_EXIST_NAME_STATUS = 1020201;
	String AUTHORITY_ROLE_EXIST_NAME_STATUS_MSG = "角色名称已存在";
	/*************** <<<=== 添加用户管理 ===>>> ***************/
	int ADD_EMP_COMMENT_STATUS = 4001;
	String ADD_EMP_COMMENT_MSG = "用户评价已经添加,不能重复添加";

	String ADD_EMP_COMMENT_ERROR = "用户评论数据添加有误";

	int NOT_HAS_AUTHORITY_CODE = 4003;
	String NOT_HAS_AUTHORITY_MSG = "用户没有权限";
}
