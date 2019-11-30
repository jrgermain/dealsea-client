import javax.swing.*;
import java.util.List;

public class PopUp extends JFrame {
	JPanel popUpPanel = new JPanel();

	public PopUp(){
		super("Deals App");
		setSize(400,500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// setLayout(null);

		add(popUpPanel);
		setVisible(true);
	}

	public void displayItems(List<String> items){
		this.popUpPanel.removeAll();
		for (String item : items) {
			JLabel currItem = new JLabel(item);
			this.popUpPanel.add(currItem);
		}
	}
}
