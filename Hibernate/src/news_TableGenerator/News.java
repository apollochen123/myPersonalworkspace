package news_TableGenerator;

import javax.persistence.*;

@Entity
@Table(name="news_inf")
public class News
{
	// 消息类的标识属性
	@Id
	// 定义主键生成器
	@TableGenerator(name="newsGen" , table="NEWS_ID_GEN",
		pkColumnName="gen_key", valueColumnName="gen_value",
		pkColumnValue="news_id")
	// 使用GenerationType.TABLE主键生成策略
	@GeneratedValue(strategy=GenerationType.TABLE
		, generator="newsGen")
	private Integer id;
	// 消息标题
	private String title;
	// 消息内容
	private String content;

	// id的setter和getter方法
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}

	// title的setter和getter方法
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getTitle()
	{
		return this.title;
	}

	// content的setter和getter方法
	public void setContent(String content)
	{
		this.content = content;
	}
	public String getContent()
	{
		return this.content;
	}
}
	


