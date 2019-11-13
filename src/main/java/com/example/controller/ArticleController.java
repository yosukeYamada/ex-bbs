package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Article;
import com.example.domain.Comment;
import com.example.form.ArticleForm;
import com.example.form.CommentForm;
import com.example.repository.ArticleRepository;
import com.example.repository.CommentRepository;

/**
 * 掲示板のコントローラ.
 * 
 * @author yosuke.yamada
 *
 */
@Controller
@RequestMapping("/exbbs01")
public class ArticleController {

	@Autowired
	private ArticleRepository articleRepository;

	@Autowired
	private CommentRepository commentRepository;

	@ModelAttribute
	public ArticleForm setUpForm() {
		return new ArticleForm();
	}
	
	@ModelAttribute
	public CommentForm setUpForm2() {
		return new CommentForm();
	}

	/**
	 * 掲示板を表示する.
	 * 
	 * @param model リクエストパラメータ
	 * @return 掲示板を表示
	 */
	@RequestMapping("")
	public String index(Model model) {
		List<Article> articleList = articleRepository.findAll();
		for(Article article: articleList) {
			article.setCommentList(commentRepository.findByArticleId(article.getId()));
		}
		model.addAttribute("articleList", articleList);
		return "index_bbs";
	}

	/**
	 * 1件更新をするメソッド.
	 * 
	 * @param articleForm フォーム
	 * @return 掲示板を表示
	 */
	@RequestMapping("/insert")
	public String insert(ArticleForm articleForm) {
		Article article = new Article();
		article.setName(articleForm.getName());
		article.setContent(articleForm.getContent());
		articleRepository.insert(article);
		return "redirect:/exbbs01";
	}
	
	/**
	 * コメントを1件更新するメソッド
	 * @param commentForm　フォーム
	 * @return　掲示板を表示
	 */
	@RequestMapping("/insertComment")
	public String insertComment(Integer articleId,CommentForm commentForm) {
		Comment comment = new Comment();
		comment.setArticleId(articleId);
		System.out.println(articleId);
		comment.setName(commentForm.getName());
		comment.setContent(commentForm.getContent());
		commentRepository.insert(comment);
		return "redirect:/exbbs01";
	}

}
