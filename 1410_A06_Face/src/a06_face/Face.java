/***************************
 * Author: Spencer Rosenvall
 * Assignment: A06_Face
 ***************************/

package a06_face;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 * Class Face creates a JFrame with a control panel that implements FacePanel to
 * create an interactive GUI.
 * 
 * @author SpencerR
 *
 */
@SuppressWarnings("serial")
public class Face extends JFrame {

	private JPanel contentPane;
	public JPanel panelDisplay;

	/**
	 * Launches the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Face frame = new Face();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Face() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		// create container for the panelControl to keep buttons from using whole panel
		JPanel containerPanel = new JPanel();
		contentPane.add(containerPanel, BorderLayout.WEST);

		JPanel panelControl = createPanelControl();
		containerPanel.add(panelControl);

		panelDisplay = new FacePanel();
		contentPane.add(panelDisplay, BorderLayout.CENTER);

	}

	/**
	 * creates control panel and slave components.
	 * 
	 * @return
	 */
	private JPanel createPanelControl() {
		JPanel panelControl = new JPanel();

		panelControl.setBorder(new EmptyBorder(10, 10, 10, 10));
		getContentPane().add(panelControl);
		panelControl.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblChoose = new JLabel("You choose...");
		lblChoose.setHorizontalAlignment(SwingConstants.CENTER);
		lblChoose.setBorder(new EmptyBorder(10, 10, 10, 10));

		panelControl.add(lblChoose);

		JCheckBox checkBoxEyes = new JCheckBox("Eyes");
		checkBoxEyes.setHorizontalAlignment(SwingConstants.CENTER);
		checkBoxEyes.setBorder(new EmptyBorder(10, 10, 10, 10));
		panelControl.add(checkBoxEyes);

		JCheckBox checkBoxNose = new JCheckBox("Nose");
		checkBoxNose.setHorizontalAlignment(SwingConstants.CENTER);
		checkBoxNose.setBorder(new EmptyBorder(10, 10, 10, 10));
		panelControl.add(checkBoxNose);

		JCheckBox checkBoxMouth = new JCheckBox("Mouth");
		checkBoxMouth.setHorizontalAlignment(SwingConstants.CENTER);
		checkBoxMouth.setBorder(new EmptyBorder(10, 10, 10, 10));
		panelControl.add(checkBoxMouth);

		JButton btnUpdate = createBtnUpdate(checkBoxEyes, checkBoxNose, checkBoxMouth);
		panelControl.add(btnUpdate, BorderLayout.SOUTH);
		btnUpdate.setBorder(new EmptyBorder(10, 10, 10, 10));

		return panelControl;
	}

	/**
	 * Creates update button and checks which options are checked to update.
	 * 
	 * @param checkBoxEyes
	 * @param checkBoxNose
	 * @param checkBoxMouth
	 * @return
	 */
	private JButton createBtnUpdate(JCheckBox checkBoxEyes, JCheckBox checkBoxNose, JCheckBox checkBoxMouth) {
		JButton btnUpdate = new JButton("update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// if all boxes unchecked, change circle color
				if (!checkBoxEyes.isSelected() && !checkBoxNose.isSelected() && !checkBoxMouth.isSelected()) {
					((FacePanel) panelDisplay).updateCircle(panelDisplay.getGraphics()); // update circle color
				}

				if (checkBoxEyes.isSelected()) {
					((FacePanel) panelDisplay).updateEyes(panelDisplay.getGraphics()); // update eyes
				}

				if (checkBoxNose.isSelected()) {
					((FacePanel) panelDisplay).updateNose(panelDisplay.getGraphics()); // update nose
				}

				if (checkBoxMouth.isSelected()) {
					((FacePanel) panelDisplay).updateMouth(panelDisplay.getGraphics()); // update mouth
				}
				panelDisplay.repaint();
			}
		});
		return btnUpdate;
	}

}
