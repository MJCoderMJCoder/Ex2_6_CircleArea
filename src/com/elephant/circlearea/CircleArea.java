package com.elephant.circlearea;

/**
 * JOptionPane(�����������ֱ�׼��ģʽ�Ի���)�Ĳ��ֹ��ܣ�
 * ConfirmDialog��ȷ�϶Ի���
 * InputDialog:�ı�����Ի���
 * MessageDialog����Ϣ��ʾ�Ի���
 * OptionDialog���ۺ�����3�й��ܵĶԻ���
 */
import javax.swing.JOptionPane;

public class CircleArea {

	public static void main(String[] args) {
		
		/*ͨ���Ի�������뾶*/
		String radiusString = JOptionPane.showInputDialog("������뾶");
		/*���������ַ����Ƿ��д�*/
		if(radiusString.trim().length() == 0)
			JOptionPane.showMessageDialog(null, "��������ݳ���Ϊ0",
					"�������ݴ���", JOptionPane.ERROR_MESSAGE);
		else {
			/*��������ַ���ת���ɰ뾶�������뾶����Բ���ܳ������*/
			double radius = Double.parseDouble(radiusString);	//���ַ����а��������ֽ���Ϊ��Ӧ��double���͵�ֵ	
			double perimeter = 2 * Math.PI * radius;
			double area = Math.PI * radius *radius;
			
			/*ͨ���Ի��������ʾ���*/
			String result = "�ܳ�Ϊ" + Double.toString(perimeter)
					+ "��\n���Ϊ" + Double.toString(area) + "��\n";
			JOptionPane.showMessageDialog(null, result, "������", JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
