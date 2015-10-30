package net.showcal.api.response.mobile;


import net.showcal.api.XiniuResponse;

/**
 * Created on 2015-05-14.
 *
 * @author 吕浩
 * @since 1.0.0
 */
public class VerificationCodeCreateResponse extends XiniuResponse {

    /**
     * 验证码
     */
    private String verificationCode;

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
}
