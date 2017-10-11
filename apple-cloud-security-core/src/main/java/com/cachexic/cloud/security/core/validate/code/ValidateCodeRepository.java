package com.cachexic.cloud.security.core.validate.code;

import com.cachexic.cloud.security.core.config.enums.ValidateCodeType;
import com.cachexic.cloud.security.core.validate.code.entity.ValidateCode;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * @Description: 抽取出 校验码存取器 (浏览器保存在session中,app自定义保存地方)
 * @author tangmin
 * @date 2017-10-11 18:41:11
 */
public interface ValidateCodeRepository {

	/**
	 * 保存验证码
	 * @param request
	 * @param code
	 * @param validateCodeType
	 */
	void save(ServletWebRequest request, ValidateCode code, ValidateCodeType validateCodeType);
	/**
	 * 获取验证码
	 * @param request
	 * @param validateCodeType
	 * @return
	 */
	ValidateCode get(ServletWebRequest request, ValidateCodeType validateCodeType);
	/**
	 * 移除验证码
	 * @param request
	 * @param codeType
	 */
	void remove(ServletWebRequest request, ValidateCodeType codeType);

}
