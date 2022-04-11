import javax.swing.*;
import java.awt.*;

public class TelePanelBot extends JPanel
{
	private TeleFrame frame;

	public TelePanelBot(TeleFrame tf)
	{
		frame = tf;

		setPreferredSize(new Dimension(700, 250));

		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0.5;
		c.weighty = 0.5;
		c.gridx = 0;
		c.gridy = 0;

		add(new TelePanelGPS(frame), c);

		c.gridx = 1;
		c.gridy = 0;

		add(new TelePanelOptions(frame), c);	
	}
}
