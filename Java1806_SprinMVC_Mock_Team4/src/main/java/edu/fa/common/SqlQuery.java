package edu.fa.common;

public class SqlQuery {
	public interface UserQuery {
		public static final String FIND_USER = "FROM User  WHERE user_name=:user_name AND password=:password";
		public static final String USER_BYNAME = "FROM User  WHERE user_name=:user_name";
		public static final String VIEW_ROLE_BY_NAME_PASS = "select role_id from User where user_name:user";

	}
	public interface SubjectQuery {
		public static final String FIND_SUBJECT = "FROM Subject";
		
	}
	
	public interface ExamQuery {
		public static final String FIND_EXAM_BY_USERID = "from Exam e where e.examId.user.user_id=:user_id";
		public static final String FIND_EXAM_BY_ID="FROM Exam  WHERE user_id=:user_id AND test_id=:test_id AND createDate=:createDate";
		public static final String DELETE_HISTORY_ID="DELETE FROM Exam WHERE user_id=:user_id AND test_id=:test_id AND createDate=:createDate";
		public static final String DELETE_HISTORY_USER="DELETE FROM Exam WHERE user_id=:user_id";
		
	}

}
