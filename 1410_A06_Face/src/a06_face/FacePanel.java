/***************************
 * Author: Spencer Rosenvall
 * Assignment: A06_Face
 ***************************/

package a06_face;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Class FacePanel creates a panel with a variety of icons to create a face.
 * 
 * @author SpencerR
 *
 */
@SuppressWarnings("serial")
public class FacePanel extends JPanel {

	private int circleIndex;
	private int eyesIndex;
	private int noseIndex;
	private int mouthIndex;

	String[] circleUrl = { "/a06_face/images/circle1.png", "/a06_face/images/circle2.png",
			"/a06_face/images/circle3.png" };
	String[] eyesUrl = { "/a06_face/images/eyes1.png", "/a06_face/images/eyes2.png", "/a06_face/images/eyes3.png" };
	String[] noseUrl = { "/a06_face/images/nose1.png", "/a06_face/images/nose2.png", "/a06_face/images/nose3.png" };
	String[] mouthUrl = { "/a06_face/images/mouth1.png", "/a06_face/images/mouth2.png", "/a06_face/images/mouth3.png" };

	private ImageIcon[] circleIcons = { new ImageIcon(FacePanel.class.getResource(circleUrl[0])), // create circle icons
			new ImageIcon(FacePanel.class.getResource(circleUrl[1])),
			new ImageIcon(FacePanel.class.getResource(circleUrl[2])) };

	private ImageIcon[] eyesIcons = { new ImageIcon(FacePanel.class.getResource(eyesUrl[0])), // create eyes icons
			new ImageIcon(FacePanel.class.getResource(eyesUrl[1])),
			new ImageIcon(FacePanel.class.getResource(eyesUrl[2])) };

	private ImageIcon[] noseIcons = { new ImageIcon(FacePanel.class.getResource(noseUrl[0])), // create nose icons
			new ImageIcon(FacePanel.class.getResource(noseUrl[1])),
			new ImageIcon(FacePanel.class.getResource(noseUrl[2])) };

	private ImageIcon[] mouthIcons = { new ImageIcon(FacePanel.class.getResource(mouthUrl[0])), // create mouth icons
			new ImageIcon(FacePanel.class.getResource(mouthUrl[1])),
			new ImageIcon(FacePanel.class.getResource(mouthUrl[2])) };

	/**
	 * Creates the panel.
	 */
	public FacePanel() {

	}

	/**
	 * Calls super class and sets background.
	 * 
	 * @param g
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.BLUE);
		initializePainComponents(g);
	}

	/**
	 * Paints the initial components on the FacePanel.
	 * 
	 * @param g
	 */
	public void initializePainComponents(Graphics g) {
		circleIcons[circleIndex].paintIcon(this, g, 50, 50);
		eyesIcons[eyesIndex].paintIcon(this, g, 150, 150);
		noseIcons[noseIndex].paintIcon(this, g, 300, 275);
		mouthIcons[mouthIndex].paintIcon(this, g, 250, 425);
	}

	/**
	 * Updates the circle icon on the FacePanel.
	 * 
	 * @param g
	 */
	public void updateCircle(Graphics g) {
		circleIndex = ++circleIndex % circleIcons.length; // look at vid for weird ++x %
		circleIcons[circleIndex].paintIcon(this, g, 100, 50);
	}

	/**
	 * Updates the eyes icon on the FacePanel.
	 * 
	 * @param g
	 */
	public void updateEyes(Graphics g) {
		eyesIndex = ++eyesIndex % eyesIcons.length;
		eyesIcons[eyesIndex].paintIcon(this, g, 150, 150);
	}

	/**
	 * Updates the nose icon on the FacePanel.
	 * 
	 * @param g
	 */
	public void updateNose(Graphics g) {
		noseIndex = ++noseIndex % noseIcons.length;
		noseIcons[noseIndex].paintIcon(this, g, 300, 275);
	}

	/**
	 * Updates the mouth icon on the FacePanel.
	 * 
	 * @param g
	 */
	public void updateMouth(Graphics g) {
		mouthIndex = ++mouthIndex % mouthIcons.length;
		mouthIcons[mouthIndex].paintIcon(this, g, 250, 425);
	}

}
