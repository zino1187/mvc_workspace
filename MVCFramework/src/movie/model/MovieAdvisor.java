package movie.model;

public class MovieAdvisor {

public String getAdvice(String movie) {
		String msg = null;
		if(movie.equals("�̼����ļ���5")) {
			msg = "��ũ���� �ֿ��� ����";
		} else if(movie.equals("��Ÿ����")) {
			msg = "������ ����";
		} else if(movie.equals("����3")) {
			msg = "1,2�� ��� ���༺��";
		} else if(movie.equals("�г�������")) {		
			msg = "�ͽ�Ʈ�� �׼�";
		}
		return msg;
	}
}
