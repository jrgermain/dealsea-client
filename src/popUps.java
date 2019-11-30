import javax.swing.*;
import java.util.List;

public class popUps extends JFrame {
	JPanel popUpPanel = new JPanel();

	public popUps(){
		super("Deals App");
		setSize(400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setLayout(null);

		add(popUpPanel);
		setVisible(true);
	}

	public void displayItems(List<String> items){
		for(int i = 0; i < items.size();){
			JLabel currItem = new JLabel(items.get(i));
			this.popUpPanel.add(currItem);
		}
	}
}
