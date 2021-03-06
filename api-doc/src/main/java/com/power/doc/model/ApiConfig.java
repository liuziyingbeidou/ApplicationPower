package com.power.doc.model;

import com.power.common.util.CollectionUtil;

import java.util.List;

/**
 * Description:
 * Api配置
 *
 * @author yu 2018/06/18.
 */
public class ApiConfig {

    /**
     * 是否采用严格模式
     */
    private boolean isStrict;

    /**
     * 输出路径
     */
    private String outPath;


    /**
     * 源代码路径
     */
    private String sourcePath;

    /**
     * 请求头
     */
    private List<ApiReqHeader> requestHeaders;

    /**
     * 自定义字段
     */
    private List<CustomRespField> customResponseFields;

    /**
     * 错误码code列表
     * @return
     */

    private List<ApiErrorCode> errorCodes;

    public boolean isStrict() {
        return isStrict;
    }

    public void setStrict(boolean strict) {
        isStrict = strict;
    }

    public String getOutPath() {
        return outPath;
    }

    public void setOutPath(String outPath) {
        this.outPath = outPath;
    }

    public List<ApiReqHeader> getRequestHeaders() {
        return requestHeaders;
    }

    public void setRequestHeaders(ApiReqHeader... requestHeaders) {
        this.requestHeaders = CollectionUtil.asList(requestHeaders);
    }

    public List<CustomRespField> getCustomResponseFields() {
        return customResponseFields;
    }

    public void setCustomResponseFields(CustomRespField... customResponseFields) {
        this.customResponseFields = CollectionUtil.asList(customResponseFields);
    }

    public String getSourcePath() {
        return sourcePath;
    }

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    public List<ApiErrorCode> getErrorCodes() {
        return errorCodes;
    }

    public void setErrorCodes(List<ApiErrorCode> errorCodes) {
        this.errorCodes = errorCodes;
    }
}
