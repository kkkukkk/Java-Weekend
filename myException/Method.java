package myException;

public class Method {
	public void setNick(String nick) throws BadWordException{
		if(nick.equals("바보")) {
			throw new BadWordException("바보라고 입력됨");
		}
		if(nick.equals("멍청이")) {
			throw new BadWordException("멍청이라고 입력됨");
		}
		System.out.println("당신의 닉네임은 "+nick+" 입니다.");
	}
}
