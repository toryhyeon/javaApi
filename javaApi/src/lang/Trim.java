package lang;
/*
 * @ Date	: 20150629
 * @ Author : �ֽ���
 * @ Story	: trim() ����
 */
public class Trim {
	public static void main(String[] args) {
		String str = "    Hello    Java    World !!    ";
		System.out.println(str.trim());
		// trim() �� ���ͷ����� �յ� ������ ���ִ� ����� �Ѵ�.
		
		/*
		 * �޼ҵ� ü�α�� : �����ϴ� ���� String �̶��
		 * String �� �޼ҵ���� �����ؼ� ����� �� �ִµ�
		 * �̰��� �޼ҵ� ü���̶�� �Ѵ�.
		 */
		System.out.println(str.trim().replace("Java", "JSP"));
	}
}
