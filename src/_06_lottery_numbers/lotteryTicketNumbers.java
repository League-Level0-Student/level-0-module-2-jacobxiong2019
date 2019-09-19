package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryTicketNumbers {
	public static void main(String[] args) {
		Random ran = new Random();
		String s = "";
		for(int i = 0; i < 5; i++)
		{
		int randomNumber = ran.nextInt((99 - 1)+1)+1;
		s = s+randomNumber;
		}
		JOptionPane.showMessageDialog(null, s);
	}
}
