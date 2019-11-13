package com.example.form;

/**
 * 記事フォーム.
 * 
 * @author yosuke.yamada
 *
 */
public class ArticleForm {

	/** 投稿者名 */
	private String name;
	/** 投稿内容 */
	private String content;

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

	@Override
	public String toString() {
		return "ArticleForm [name=" + name + ", content=" + content + "]";
	}

}