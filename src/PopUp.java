import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PopUp extends JFrame {
	JPanel popUpPanel = new JPanel();

	public PopUp(){
		super("Deal Search");
		setMinimumSize(new Dimension(400, 500));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		popUpPanel.setLayout(new BoxLayout(popUpPanel, BoxLayout.Y_AXIS));

		add(popUpPanel);
		setVisible(true);
	}

	public void displayItems(List<String> items){
		this.popUpPanel.removeAll();
		System.out.println("Displaying " + items.size() + " results");
		for (String item : items) {
			JLabel currItem = new JLabel(item);
			this.popUpPanel.add(currItem);
		}
		pack();
	}
}
