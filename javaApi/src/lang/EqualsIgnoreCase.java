package lang;
/*
 * @ Date	: 20150629
 * @ Author : �ֽ���
 * @ Story	: ��ҹ��� ���� ���ִ� �޼ҵ�
 */
public class EqualsIgnoreCase {
	public static void main(String[] args) {
		System.out.println("HELLO".equals("hello") ? "����" : "�ٸ���");
		// ���ͷ� Ÿ��(StringŸ��) �� equals �� callByValue �� ��
		// �ֳ��ϸ� ���ͷ��� ��������� �ν��ϱ� ����
		System.out.println("HELLO".equals("HELLO") ? "����" : "�ٸ���");
		
		System.out.println("HELLO".equalsIgnoreCase("hello") ? "����" : "�ٸ���");
	}
}
