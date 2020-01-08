package main;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import database.*;

@Controller
public class HomeController {

	@RequestMapping({ "/", "/login" })
	public String showLogin() {

		return "login";
	}

	@RequestMapping("/student")
	public String showStudentMenu(HttpServletRequest request, Model model) {
		String nextView = "login";

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		DbHandler dbh = new DbHandler();
		List<Student> foundStudents = dbh.verifyUser("Student", username, password);
		List<Essay> foundEssays = dbh.viewEssays(foundStudents.get(0).type);

		boolean c1 = foundStudents.isEmpty();

		if (c1 == true) {
			System.out.println("Student doesn't exist.");
		} else {
			nextView = "student_menu";
			request.getSession().setAttribute("userame", username);
			request.getSession().setAttribute("password", password);
			request.getSession().setAttribute("first_name", foundStudents.get(0).fName);

			boolean c2 = foundEssays.isEmpty();

			if (c2 == true) {
				System.out.println("No essays available.");
			} else {
				model.addAttribute("essays", foundEssays);
			}
		}

		return nextView;
	}
	
	@RequestMapping({ "/student/essay", "/essay" })
	public String showEssay(HttpServletRequest request, Model model) {
		String title = request.getParameter("title");

		request.getSession().getAttribute("username");
		String username = request.getParameter("username");

		DbHandler dbh = new DbHandler();
		List<Essay> essayDetails = dbh.getEssayDetails(title);

		model.addAttribute("details", essayDetails.get(0));

		return "essay_view";
	}

	@RequestMapping({ "/submission", "student/submission" })
	public String showSubmission(HttpServletRequest request, Model model) {

		return "essay_submission";
	}


}
