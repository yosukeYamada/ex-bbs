package com.example.form;

/**
 * コメントのフォーム.
 * 
 * @author yosuke.yamada
 *
 */
public class CommentForm {

	/**	ID */
	private String id;
	/**	コメント投稿者名 */
	private String name;
	/**	コメント */
	private String content;
	/**	投稿と紐づけるID */
	private String articledId;

	public Integer getIntId() {
		return Integer.parseInt(id);
	}

	public Integer getIntArticledId() {
		return Integer.parseInt(articledId);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getArticledId() {
		return articledId;
	}

	public void setArticledId(String articledId) {
		this.articledId = articledId;
	}

	@Override
	public String toString() {
		return "CommentForm [id=" + id + ", name=" + name + ", content=" + content + ", articledId=" + articledId + "]";
	}

}
