package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.InputTextField;

public class InputController implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		InputTextField.getInstance().sendInput();
		
	}

}
