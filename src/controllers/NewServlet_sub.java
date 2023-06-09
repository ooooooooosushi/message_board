package controllers;

import java.io.IOException;
import java.sql.Timestamp;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Message;
import utils.DBUtil;

/**
 * Servlet implementation class NewServlet
 */
@WebServlet("/newaaaaaa")
public class NewServlet_sub extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewServlet_sub() {
        super();
        // TODO Auto-generated constructor stub
    }

//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    	System.out.println("dopost");
//
//    	EntityManager em = DBUtil.createEntityManager();
//		em.getTransaction().begin();
//
//		// Messageのインスタンスを作成
//		Message m = new Message();
//
//		// mの各フィールドにデータを代入
//		String title = "taro";
//		m.setTitle(title);
//
//		String content = "hello";
//		m.setContent(content);
//
//		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
//		m.setCreated_at(currentTime);
//		m.setUpdated_at(currentTime);
//
//		// データベースに保存
//		em.persist(m);
//		em.getTransaction().commit();
//
//		// 自動採番されたIDの値を表示
//		response.getWriter().append(Integer.valueOf(m.getId()).toString());
//    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doget");
		EntityManager em = DBUtil.createEntityManager();
		em.getTransaction().begin();

		// Messageのインスタンスを作成
		Message m = new Message();

		// mの各フィールドにデータを代入
		String title = "taro";
		m.setTitle(title);

		String content = "hello";
		m.setContent(content);

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		m.setCreated_at(currentTime);
		m.setUpdated_at(currentTime);

		// データベースに保存
		em.persist(m);
		em.getTransaction().commit();

		// 自動採番されたIDの値を表示
		response.getWriter().append(Integer.valueOf(m.getId()).toString());

	}

}
