package com.example.domain;

/**
 * コメントのドメイン.
 * 
 * @author yosuke.yamada
 *
 */
public class Comment {

	/**	ID */
	private Integer id;
	/**	コメント投稿者の名前 */
	private String name;
	/**	コメント */
	private String content;
	/**	投稿と紐づけるID */
	private Integer ArticleId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public Integer getArticleId() {
		return ArticleId;
	}
	public void setArticleId(Integer articleId) {
		ArticleId = articleId;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", name=" + name + ", content=" + content + ", ArticleId=" + ArticleId + "]";
	}



}
