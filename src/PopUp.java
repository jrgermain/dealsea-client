import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PopUp extends JFrame {
	JPanel popUpPanel = new JPanel();

	public PopUp(){
		super("Deal Sailor");
		setMinimumSize(new Dimension(400, 175));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		popUpPanel.setLayout(new BoxLayout(popUpPanel, BoxLayout.Y_AXIS));

		add(popUpPanel);
		setVisible(true);
	}

	public void displayItems(List<String> items){
		this.popUpPanel.removeAll();
		if (items.size() == 0) {
			System.out.println("No results found");
			this.popUpPanel.add(new JLabel("No results found"));
		} else {
			System.out.println("Displaying " + items.size() + " results");
			for (String item : items) {
				JLabel currItem = new JLabel(item);
				this.popUpPanel.add(currItem);
			}
		}
		pack();
	}
}
