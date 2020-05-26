package chainOfResponsibility;

/**
 * 
 * @author Dell
 *
 *类说明：用来模拟用户向数据库提交的内容，此内容在被提交到数据库之前需要经过3次操作：1.检查是否为空 2.添加注释 3.添加审阅
 */



public class Message {
	
	private String content;
	
	public Message(String content) {
		
		this.content = content;
		
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	

}
