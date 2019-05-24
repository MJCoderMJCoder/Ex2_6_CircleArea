package com.elephant.circlearea;

/**
 * JOptionPane(用来弹出各种标准的模式对话框)的部分功能：
 * ConfirmDialog：确认对话框
 * InputDialog:文本输入对话框
 * MessageDialog：信息显示对话框
 * OptionDialog：综合上述3中功能的对话框
 */
import javax.swing.JOptionPane;

public class CircleArea {

	public static void main(String[] args) {
		
		/*通过对话框输入半径*/
		String radiusString = JOptionPane.showInputDialog("请输入半径");
		/*检查输入的字符串是否有错*/
		if(radiusString.trim().length() == 0)
			JOptionPane.showMessageDialog(null, "输入的数据长度为0",
					"输入数据错误", JOptionPane.ERROR_MESSAGE);
		else {
			/*将输入的字符串转换成半径，根基半径计算圆的周长和面积*/
			double radius = Double.parseDouble(radiusString);	//将字符串中包含的数字解析为对应的double类型的值	
			double perimeter = 2 * Math.PI * radius;
			double area = Math.PI * radius *radius;
			
			/*通过对话框输出显示结果*/
			String result = "周长为" + Double.toString(perimeter)
					+ "。\n面积为" + Double.toString(area) + "。\n";
			JOptionPane.showMessageDialog(null, result, "计算结果", JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
