package lang;
/*
 * @ Date	: 20150629
 * @ Author : �ֽ���
 * @ Story	: equals() Ȱ�� ����
 */
public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person("800101-1234567");
		Person p2 = new Person("800101-1234567");
		String result = ""; // �������� �ʱ�ȭ
		result = (p1 == p2) ? "������" : "�ٸ����" ;
		// ���׿����� ( if -else ��� �����ϰ� ǥ���� �� ��� )
		// (�����) ? true �� ��� : false �� ���;
		System.out.println("p1 == p2 �� ��� ��� : " + result);
		// ����� �ٸ� ������� Ǯ�µǴ� ���� ������ �񱳰� �ƴ϶�
		// == �� �����ּҰ� ���̱� �����̴�.
		result = (p1.equals(p2)) ? "������" : "�ٸ����" ;
		// �ּҰ� �񱳰� �ƴ� ������ �� ����� ����
		// �ּҰ� : call by Reference --> �ڹٿ��� ���� �ּҷ� �޸� ����
		// ������ : call by Value --> C���� ���� �޸𸮸� ����
		System.out.println("p1 == p2 �� ��� ��� : " + result);
	}
}
