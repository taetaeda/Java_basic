package etc.exception.custom;

public class LoginUser {

	String UserAccount;  // 계정명
	String UserPassword; // 가입시 설정한 패스워드
	
	public LoginUser(String userAccount, String userPassword) {
		super();
		UserAccount = userAccount;
		UserPassword = userPassword;
	}
	
	//로그인 검증
	public String loginValidate(String inputAccount, String inputPassword)
            throws LoginValidateException {

        //계정명이 일치하는가?
        if(UserAccount.equals(inputAccount)) {
            //패스워드가 일치하는가?
            if(UserPassword.equals(inputPassword)) {
                return "SUCCESS";

            }else {
                //패스워드 정보가 틀림
                throw new LoginValidateException("비밀번호 똑바로 치세요!");
            }
        }else {
            //계정정보가 틀림
            throw new LoginValidateException("회원가입부터 하세요!");
        }
	}
	
}
